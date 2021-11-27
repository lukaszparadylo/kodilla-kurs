package com.kodilla.hibernate.manytomany.facade;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DatabaseFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseFacade.class);
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    @Autowired
    public DatabaseFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void addEmployee(Employee employee){
        employeeDao.save(employee);
    }

    public void addCompany(Company company){
        companyDao.save(company);
    }

    public List<Company> companyNameByMinimum3chars(String companyName) {
        return companyDao.retrieveCompanyByAlmost3Chars("%"+companyName+"%");
    }

    public List<Employee> employeeByMinimum3Chars(String employeeName) {
        return employeeDao.retrieveEmployeeByAlmost3CharsOfSurname("%"+employeeName+"%");
    }

    public boolean deleteCompanies(){
        try {
            companyDao.deleteAll();
            return true;
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            return false;
        }
    }
    public boolean deleteEmployees(){
        try {
            employeeDao.deleteAll();
            return true;
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            return false;
        }
    }
}

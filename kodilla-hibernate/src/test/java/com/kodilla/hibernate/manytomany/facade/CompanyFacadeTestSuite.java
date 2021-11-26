package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private DatabaseFacade databaseFacade;

    @Test
    public void findEmployeeByPartOfName() {
        //Given
        databaseFacade.addEmployee(new Employee("Zenek","Kowalski"));
        databaseFacade.addEmployee(new Employee("Jacek", "Dziad"));
        //When
        List<Employee> employeesList = databaseFacade.employeeByMinimum3Chars("Kowal");
        //Then
       try {
            assertEquals(1, employeesList.size());
        } finally {
            //CleanUp
            databaseFacade.deleteEmployees();
        }
    }
    @Test
    public void findCompanyNameByPartOfName(){
        //Given
        databaseFacade.addCompany(new Company("ABC"));
        databaseFacade.addCompany(new Company("Kruktech"));
        //When
        List<Company> companiesList = databaseFacade.companyNameByMinimum3chars("Kru");
        //Then
        try {
            assertEquals(1, companiesList.size());
        } finally {
            //CleanUp
            databaseFacade.deleteCompanies();
        }
    }
}

package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
///
@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retrieveEmployeeSurname(@Param("LASTNAME") String lastname);

    @Query
    List<Employee> retrieveEmployeeByAtLeast3CharsOfSurname(@Param("LASTNAME") String lastname);
}

package com.alexkalnij.jpastudy.dao;

import com.alexkalnij.jpastudy.model.Employee;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 25.07.13
 * Time: 20:06
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeDao {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(int id);
    Set<Employee> getAllEmployees();
}

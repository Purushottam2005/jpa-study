package com.alexkalnij.jpastudy.dao;

import com.alexkalnij.jpastudy.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 25.07.13
 * Time: 20:08
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private EntityManager entityManager;

    @Override
    public Employee createEmployee(Employee employee) {
        entityManager.persist(employee);
        return employee;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public Set<Employee> getAllEmployees() {
        String sql = "SELECT e FROM Employee e";
        Query query = entityManager.createQuery(sql);
        List<Employee> resultList = query.getResultList();
        Set<Employee> result = new HashSet<Employee>();
        result.addAll(resultList);
        return result;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}

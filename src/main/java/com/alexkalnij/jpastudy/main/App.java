package com.alexkalnij.jpastudy.main;

import com.alexkalnij.jpastudy.dao.EmployeeDaoImpl;
import com.alexkalnij.jpastudy.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 24.07.13
 * Time: 21:31
 * To change this template use File | Settings | File Templates.
 */
public class App {
    public static void main(String[] args) {
        populate();
    }

    private static void populate() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager entityManager = factory.createEntityManager();
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.setEntityManager(entityManager);
        Employee alex = createEmployee("Alex", new BigDecimal(2300.00));
        alex.setId(1);
        Employee vasya = createEmployee("Vasya", new BigDecimal(1800.505));
        vasya.setId(2);
        entityManager.getTransaction().begin();
        employeeDao.createEmployee(alex);
        employeeDao.createEmployee(vasya);
        entityManager.getTransaction().commit();
    }

    private static Employee createEmployee(String name, BigDecimal salary) {
        Employee e = new Employee();
        e.setName(name);
        e.setSalary(salary);
        return e;
    }
}

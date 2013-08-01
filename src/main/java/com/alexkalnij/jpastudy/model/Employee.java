package com.alexkalnij.jpastudy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 25.07.13
 * Time: 19:54
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Employee {
    private int id;
    private String name;
    private BigDecimal salary;

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

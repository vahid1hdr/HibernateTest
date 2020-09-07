package net.javaguides.hibernate.entity;

import javax.persistence.Entity;

/**
 * Created by v.heydari on
 * 9/7/2020 3:35 PM
 */

@Entity
public class Employee extends Person{
    private String employeeNumber;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String employeeNumber) {
        super(firstName, lastName);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}

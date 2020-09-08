package net.javaguides.hibernate.entity;

import javax.persistence.*;

@Entity
public class Student extends Person {
    private String studentNumber;
    private Car car;

    public Student() {

    }

    public Student(String firstName, String lastName, String studentNumber, Car car) {
        super(firstName, lastName);
        this.studentNumber = studentNumber;
        this.car = car;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
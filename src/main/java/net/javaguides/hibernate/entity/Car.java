package net.javaguides.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by v.heydari on
 * 9/8/2020 3:55 PM
 */

@Entity
public class Car {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToOne(mappedBy = "car")
    private Student student;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

package com.example.hibernatetest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kompis {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int phone;

    public Kompis(Long id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
public Kompis(){}
    @Override
    public String toString() {
        return "Kompis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


}

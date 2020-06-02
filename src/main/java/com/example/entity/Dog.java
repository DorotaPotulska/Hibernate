package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
    String name;
    Integer age;
    String race;

    public Dog() {

    }

    public Dog(final String name, final Integer age, final String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }

    public void setAge(final Integer age) {
        this.age = age;
    }
}

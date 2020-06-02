package com.example.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="table_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false) // nie moze byc nullem
    String name;
    @Column(name = "password") // zmiana nazwy kolumny
    String secret;
    @Column(length = 9, unique = true) // długosc znaku max 9 i unikatowe musza byc
    String telephoneNumber;
    @Transient //przezroczyste , istnieje w obiekcie ale nie ma tego w bazie danych
    int age;
/*    @Temporal(TemporalType.DATE) //
    LocalDate birthDate;*/
    @Enumerated(value = EnumType.STRING)
    Gender gender;
    @Lob
    @Basic(fetch = FetchType.LAZY)// do ładowania długich ciagów znaków, (zdjecia, pliki - przechowujemy na dyskach, a w bazie danych tylko scieżke dostepu do tego zdjecia , pliku)
    String description;


    public Employee( final String name, final String secret, final String telephoneNumber, final int age, final Gender gender, final String description) {

        this.name = name;
        this.secret = secret;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
        this.gender = gender;
        this.description = description;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secret='" + secret + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", description='" + description + '\'' +
                '}';
    }
}

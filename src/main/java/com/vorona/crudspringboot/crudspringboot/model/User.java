package com.vorona.crudspringboot.crudspringboot.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    @NotEmpty(message = "Вы ничего не ввели")
    @Size(min = 3, max = 20,message = "Имя должно быть в диапазоне от 2 до 20 символов")
    private String name;
    @Column(name = "surname")
    @NotEmpty(message = "Вы ничего не ввели")
    @Size(min = 3, max = 20,message = "Имя должно быть в диапазоне от 2 до 20 символов")
    private String surname;
    @Min(value = 0,message = "Возраст должен быть больш нуля")
    @Column(name = "age")
    private Integer age;



    public User() {
    }

    public User(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

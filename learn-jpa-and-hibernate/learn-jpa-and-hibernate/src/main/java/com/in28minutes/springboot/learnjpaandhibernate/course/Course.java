package com.in28minutes.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;


/*
* Using JDBC we were creating a table using sql command and we were writing code to insert, select and update the table.
* In JPA we will make Entities and map Entity with the SQL Table.
* JPA is used to map our bean with the table.
*
* In JDBC we were not using below annotations.
* */
@Entity (name = "Course")
public class Course {
    @Id
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;

    public Course() {}
    @Autowired
    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

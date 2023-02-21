package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
* We implement the CommandLineRunner interface when we want to run the jdbc queries at the startup of the application.
* */
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        /* For JPA and JDBC*/
//        repository.insert(new Course(1,"Java","ABD"));
//        repository.insert(new Course(2,"AWS","OPT"));
//        repository.insert(new Course(3,"GCP","DEF"));
//        repository.deleteById(1);
//        System.out.println(repository.findById(2));

        /* For SpringDataJpa */
        repository.save(new Course(1L,"Java","ABD"));
        repository.save(new Course(2L,"AWS","OPT"));
        repository.save(new Course(3L,"GCP","DEF"));

        repository.deleteById(1L);
        System.out.println(repository.findById(2L));
        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("DEF"));
    }
}

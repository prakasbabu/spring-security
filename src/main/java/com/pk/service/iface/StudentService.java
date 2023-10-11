package com.pk.service.iface;

import com.pk.entity.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);
    Student getStudent(Integer id);
    List<Student> findAll();
    Student updateStudent(Student student);
    void deleteStudent(Integer id);
}

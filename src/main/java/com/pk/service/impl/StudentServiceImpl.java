package com.pk.service.impl;

import com.pk.entity.Student;
import com.pk.repo.StudentRepo;
import com.pk.service.iface.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;
    @Override
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudent(Integer id) {
        return studentRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {
    studentRepo.deleteById(id);
    }
}

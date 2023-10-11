package com.pk.controller;

import com.pk.entity.Student;
import com.pk.service.iface.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/home")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/welcome")
    public String home(){
        return "home page, welcome all";
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/find/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @ResponseStatus(HttpStatus.OK)
    public Student findStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }
    @GetMapping("/findAll")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findStudent(){
        return studentService.findAll();
    }


    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(Integer id){
        studentService.deleteStudent(id);
    }

}

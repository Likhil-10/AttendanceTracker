package io.javabrains.springbootsecurity.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootsecurity.models.Student;
import io.javabrains.springbootsecurity.models.Teacher;
import io.javabrains.springbootsecurity.services.PrincipalServices;

@RestController
public class PrincipalController {
    
    @Autowired
    private PrincipalServices principalServices;

    @GetMapping("/")
    public String welcome()
    {
        return "Welcome";
    }

    @PostMapping("/principal/addstudent")
    public Student addstudent(@RequestBody Student student)
    {
        return principalServices.addStudent(student);
    }

    @GetMapping("/principal/allstudents")
    public ArrayList<Student> getAllStudents()
    {
        return principalServices.getAllStudents();
    }

    @GetMapping("/principal/student/{studentid}")
    public Student getStudentById(@PathVariable("studentid") int studentid)
    {
        return principalServices.getStudentById(studentid);
    }

    @DeleteMapping("/principal/removestudent/{studentid}")
    public String removeStudent(@PathVariable("studentid") int studentid)
    {
        return principalServices.removeStudent(studentid);
    }

    @PutMapping("/principal/updatestudent/{studentid}")
    public Student updateStudent(@PathVariable("studentid") int studentid, @RequestBody Student student)
    {
        return principalServices.updateStudent(studentid, student);
    }

    @GetMapping("/grade/{grade}")
    public ResponseEntity<ArrayList<Student>> getStudentsByGrade(@PathVariable int grade) {
        ArrayList<Student> students = principalServices.getStudentsByGrade(grade);
        return ResponseEntity.ok(students);
    }

    /*------------------------------------------------------------------------------------------------------
     * -----------------------------------------------------------------------------------------------------
     * -----------------------------------------------------------------------------------------------------
     */


    @PostMapping("/principal/addteacher")
    public Teacher addTeacher(@RequestBody Teacher teacher)
    {
        return principalServices.addTeacher(teacher);
    }

    @GetMapping("/principal/getallteachers")
    public ArrayList<Teacher> getAllTeachers()
    {
        return principalServices.getAllTeachers();
    }

    @GetMapping("/principal/teacher/{teacherid}")
    public Teacher getTeacherById(@PathVariable("teacherid") int teacherid)
    {
        return principalServices.getTeacherById(teacherid);
    }

    @PutMapping("/principal/updateteacher/{teacherid}")
    public Teacher updateTeacher(@PathVariable("teacherid") int teacherid, @RequestBody Teacher teacher)
    {
        return principalServices.updateTeacher(teacherid, teacher);
    }

    @DeleteMapping("/principal/deleteteacher/{teacherid}")
    public String removeTeacher(@PathVariable("teacherid") int teacherid)
    {
        return principalServices.deleteTeacher(teacherid);
    }
    
}

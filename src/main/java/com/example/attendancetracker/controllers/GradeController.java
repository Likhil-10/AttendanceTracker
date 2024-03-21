package com.example.attendancetracker.controllers;

import com.example.attendancetracker.models.Grade;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.attendancetracker.services.PrincipalServices;

@RestController
public class GradeController {
    
    @Autowired
    private PrincipalServices grades;

    @PostMapping("/grade/addnewgrade")
    public Grade addGrade(@RequestBody Grade grade)
    {
        return grades.addGrade(grade);
    }

    @GetMapping("/grade/allgrades")
    public ArrayList<Grade> getAllGrades()
    {
        return grades.getAllGrades();
    }

    @GetMapping("/grade/details/{gradeid}")
    public Grade getGradeById(@PathVariable("gradeid") int gradeid)
    {
        return grades.getGradeById(gradeid);
    }

    @PutMapping("/grade/updategrade/{gradeid}")
    public Grade updatGrade(@PathVariable("gradeid") int gradeid, @RequestBody Grade grade)
    {
        return grades.updateGrade(gradeid, grade);
    }
    
    @DeleteMapping("/grade/delete/{gradeid}")
    public String deleteGrade(@PathVariable("gradeid") int gradeid)
    {
        return grades.deleteGrade(gradeid);
    }
}

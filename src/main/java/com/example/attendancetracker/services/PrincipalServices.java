package com.example.attendancetracker.services;

import com.example.attendancetracker.models.Teacher;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.attendancetracker.models.Grade;
import com.example.attendancetracker.models.Student;
import com.example.attendancetracker.repositories.GradeJpaRepository;
import com.example.attendancetracker.repositories.StudentJpaRepository;
import com.example.attendancetracker.repositories.TeacherJpaRepository;

@Service
public class PrincipalServices {

    @Autowired
    private StudentJpaRepository studentJpaRepository;

    public Student addStudent(Student st)
    {
        studentJpaRepository.save(st);
        return st;
    }
    
    public ArrayList<Student> getAllStudents()
    {
        List<Student> l=studentJpaRepository.findAll();
        ArrayList<Student> al=new ArrayList<>(l);

        return al;
    }

    public Student getStudentById(int studentid)
    {
        try{
            Student st=studentJpaRepository.findById(studentid).get();
            return st;
        }
        catch(Exception e)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No student with that ID");
        }
    }

    public String removeStudent(int studentid)
    {
        try{
            Student st=getStudentById(studentid);
            String name=st.getName();
            studentJpaRepository.deleteById(studentid);

            return name+" is transferred";
        }
        catch(Exception e)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No student with that ID");
        }
    }

    public Student updateStudent(int studentid, Student student)
    {
        try{
            Student st=getStudentById(studentid);
            if(student.getName()!=null) st.setName(student.getName());
            if(student.getAge()!=0) st.setAge(student.getAge());

            studentJpaRepository.save(st);
            return st;
        }
        catch(Exception e)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No student with that ID");
        }
    }

    public ArrayList<Student> getStudentsByGrade(int grade) {
        return studentJpaRepository.findByGrade(grade);
    }    

    /*------------------------------------------------------------------------------------------------------
     * -----------------------------------------------------------------------------------------------------
     * -----------------------------------------------------------------------------------------------------
     */

    @Autowired
    private TeacherJpaRepository teacherJpaRepository;

    public Teacher addTeacher(Teacher teacher)
    {
       teacherJpaRepository.save(teacher);
       return teacher;
    }

    public ArrayList<Teacher> getAllTeachers()
    {
       List<Teacher> l=teacherJpaRepository.findAll();
       ArrayList<Teacher> al=new ArrayList<>(l);

       return al;
    }
    
    public Teacher getTeacherById(int teacherid)
    {
       Teacher t=teacherJpaRepository.findById(teacherid).get();
       return t;
    }

    public Teacher updateTeacher(int teacherId, Teacher teacher)
    {
        Teacher old=getTeacherById(teacherId);

        if(teacher.getName()!=null) old.setName(teacher.getName());
        if(teacher.getAge()>0) old.setAge(teacher.getAge());
        if(teacher.getGrade()>0) old.setGrade(teacher.getGrade());
        if(teacher.getEmail()!=null) old.setEmail(teacher.getEmail());
        if(teacher.getPhone()!=null) old.setPhone(teacher.getPhone());

        teacherJpaRepository.save(old);

        return old;
    }

    public String deleteTeacher(int teacherId)
    {
        Teacher t=getTeacherById(teacherId);
        String name=t.getName();

        teacherJpaRepository.deleteById(teacherId);

        return name+" has left the school.";
    }


    /*------------------------------------------------------------------------------------------------------
     * -----------------------------------------------------------------------------------------------------
     * -----------------------------------------------------------------------------------------------------
     */

    @Autowired
    private GradeJpaRepository gradeJpaRepository;

    public Grade addGrade(Grade grade)
    {
        Teacher t=grade.getTeacherId();
        int id=t.getTeacherId();
        Teacher n=getTeacherById(id);
        grade.setTeacherId(n);
        gradeJpaRepository.save(grade);
        return grade;
    }

    public ArrayList<Grade> getAllGrades()
    {
        List<Grade> l=gradeJpaRepository.findAll();
        ArrayList<Grade> al=new ArrayList<>(l);

        return al;
    }

    public Grade getGradeById(int gradeid)
    {
        Grade grade=gradeJpaRepository.findById(gradeid).get();
        return grade;
    }

    public Grade updateGrade(int gradeid, Grade newGrade)
    {
        Grade oldGrade=getGradeById(gradeid);
        if(newGrade.getGrade()>0) oldGrade.setGrade(newGrade.getGrade());
        if(newGrade.getTeacherId()!=null) 
        {
            Teacher up=newGrade.getTeacherId();
            int id=up.getTeacherId();
            Teacher newTeacher=getTeacherById(id);
            oldGrade.setTeacherId(newTeacher);

        }
        if(newGrade.getStrength()>0) oldGrade.setStrength(newGrade.getStrength());

        gradeJpaRepository.save(oldGrade);

        return oldGrade;
    }
    
    public String deleteGrade(int gradeid)
    {
        Grade g=getGradeById(gradeid);
        int grade=g.getGrade();
        gradeJpaRepository.deleteById(gradeid);

        return grade+" grade is removed from school.";
    }
}

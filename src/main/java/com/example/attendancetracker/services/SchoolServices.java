package com.example.attendancetracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.attendancetracker.models.Principal;
import com.example.attendancetracker.repositories.SchoolJpaRepository;

@Service
public class SchoolServices {
    
    @Autowired
    private SchoolJpaRepository school;

    public Principal addPrincipal(Principal principal)
    {
        school.save(principal);
        return principal;
    }

    public ArrayList<Principal> getPrincipal()
    {
        List<Principal> l=school.findAll();
        ArrayList<Principal> al=new ArrayList<>(l);

        return al;
    }

    public Principal getPrincipalById(int id)
    {
        Principal p=school.findById(id).get();
        return p;
    }

    public Principal updatePrincipal(int id, Principal p)
    {
        Principal prince=getPrincipalById(id);

        if(p.getName()!=null) prince.setName(p.getName());
        if(p.getAge()>0) prince.setAge(p.getAge());
        if(p.getPrincipal_since()!=null) prince.setPrincipal_since(p.getPrincipal_since());

        school.save(prince);
        return prince;
    }

    public String removePrincipal(int id)
    {
        Principal p=getPrincipalById(id);
        String name=p.getName();
        String principal_since=p.getPrincipal_since();
        int age=p.getAge();

        school.deleteById(id);
        return name+" is leaving the school at the age of "+age+". He is our principal since "+principal_since;
    }

}

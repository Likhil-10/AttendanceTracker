package com.example.attendancetracker.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.attendancetracker.models.Principal;
import com.example.attendancetracker.services.SchoolServices;

@RestController
public class SchoolController {
    
    @Autowired
    private SchoolServices serve;

    @PostMapping("/school/addprincipal")
    public Principal addPrincipal(@RequestBody Principal principal)
    {
        return serve.addPrincipal(principal);
    }

    @GetMapping("/school/principal")
    public ArrayList<Principal> principalDetails()
    {
        return serve.getPrincipal();
    }

    @GetMapping("/school/principal/{principalid}")
    public Principal getPrincipalById(@PathVariable("principalid") int principalid)
    {
        return serve.getPrincipalById(principalid);
    }

    @PutMapping("/school/updateprincipal/{principalid}")
    public Principal updatPrincipal(@PathVariable("principalid") int principalid, @RequestBody Principal p)
    {
        return serve.updatePrincipal(principalid, p);
    }

    @DeleteMapping("/school/removeprincipal/{principalid}")
    public String removePrincipal(@PathVariable("principalid") int principalid)
    {
        return serve.removePrincipal(principalid);
    }

}

package com.amit.JobPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.JobPortal.model.JobPost;
import com.amit.JobPortal.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  //Please allow this URL to access
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJob() {
        return service.getAllJobs();
    }
    
}

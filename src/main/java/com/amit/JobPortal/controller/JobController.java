package com.amit.JobPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    //if you want to search perticular row on based on Id
    @GetMapping("jobPosts/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        return service.getJobBasedOnId(postId);
    }

    @PostMapping("jobPosts")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJobPost(jobPost);
        return jobPost; //this will return that data in body!
    }

    @PutMapping("jobPosts")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJobJobPost(jobPost);
        return jobPost;
    }

    @DeleteMapping("jobPosts/{postId}")
    public void deleteJobPost(@PathVariable("postId") int postId) {
        service.deleteJobPost(postId);
    }
    
}

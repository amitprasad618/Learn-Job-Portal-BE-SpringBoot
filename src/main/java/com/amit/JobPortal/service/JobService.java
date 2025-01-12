package com.amit.JobPortal.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.JobPortal.model.JobPost;
import com.amit.JobPortal.repo.JobRepo;


@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	//method to return all JobPosts
	public List<JobPost> getAllJobs() {
		return repo.getAllJobs();
	}
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	}

	public JobPost getJobBasedOnId(int postId) {
		return repo.getJobBasedOnId(postId);
	}

    public JobPost updateJobJobPost(JobPost jobPost) {
        return repo.updateJobJobPost(jobPost);
    }

	public void deleteJobPost(int postId) {
		repo.deleteJobPost(postId);
	}

}
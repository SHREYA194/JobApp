package com.project.JobApp.service;

import com.project.JobApp.model.JobPost;
import com.project.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public List<JobPost> getAllJobs() {
        return jobRepo.getAllJobs();
    }

    public void addJob(JobPost jobPost) {
        jobRepo.addJob(jobPost);
    }
}

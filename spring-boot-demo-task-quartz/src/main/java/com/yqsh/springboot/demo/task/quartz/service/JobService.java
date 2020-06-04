package com.yqsh.springboot.demo.task.quartz.service;

import com.github.pagehelper.PageInfo;
import com.yqsh.springboot.demo.task.quartz.entity.domain.JobAndTrigger;
import com.yqsh.springboot.demo.task.quartz.entity.form.JobForm;
import org.quartz.SchedulerException;

public interface JobService {
    void addJob(JobForm form) throws Exception;

    void deleteJob(JobForm form) throws SchedulerException;

    void pauseJob(JobForm form) throws SchedulerException;

    void resumeJob(JobForm form) throws SchedulerException;

    void cronJob(JobForm form) throws Exception;

    PageInfo<JobAndTrigger> list(Integer currentPage, Integer pageSize);
}

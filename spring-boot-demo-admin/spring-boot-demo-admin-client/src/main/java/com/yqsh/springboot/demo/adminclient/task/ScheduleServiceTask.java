package com.yqsh.springboot.demo.adminclient.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceTask {


    @Scheduled(cron = "0/10 * * * * ?")
    public void handler(){

        System.out.println("=======调度服务=======");

    }

}

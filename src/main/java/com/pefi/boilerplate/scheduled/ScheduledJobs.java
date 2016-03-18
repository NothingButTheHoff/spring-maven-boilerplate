package com.pefi.boilerplate.scheduled;


import org.joda.time.DateTime;

public class ScheduledJobs {


    public void printCurrentTime() {
        DateTime date = new DateTime();
        System.out.println("CURRENT TIME: " + date.toString());
    }
}

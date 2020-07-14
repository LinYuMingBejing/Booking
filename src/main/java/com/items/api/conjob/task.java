package com.items.api.conjob;

import com.items.api.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class task {

    @Autowired
    private MailService mailService;

    @Scheduled(cron="* * 12 * * ?")
    private void process(){
        mailService.sendToGmail();
    }
}

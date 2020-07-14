package com.items.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    JavaMailSender mailSender;

    public void sendToGmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("a828215362@gmail.com");
        message.setSubject("測試透過 Gmail 去發信");
        message.setText("您好，測試信件的哦！");
        mailSender.send(message);

    }
}

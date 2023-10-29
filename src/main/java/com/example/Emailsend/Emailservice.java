package com.example.Emailsend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Emailservice {
    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail(String toEmail,
    String Body,
    String Subject){


        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom("satabdimohanty38@gmail.com");
        mailMessage.setTo(toEmail);
        mailMessage.setText(Body);
        mailMessage.setSubject(Subject);

        mailSender.send(mailMessage);
        System.out.println("Mail send...");
    }


}

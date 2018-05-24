package com.thiagodev.mailschedulerspring.config;

import com.thiagodev.mailschedulerspring.config.property.ApplicationProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Autowired
    private ApplicationProperty property;

    @Bean
    public JavaMailSender javaMailSender() {
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", true);
        props.put("mail.starttls", true);
        props.put("mail.smtp.connectiontimeout", 10000);

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setJavaMailProperties(props);
        mailSender.setHost(property.getMail().getHost());
        mailSender.setPort(property.getMail().getPort());
        mailSender.setUsername(property.getMail().getUsername());
        mailSender.setPassword(property.getMail().getPassword());

        return mailSender;
    }
}

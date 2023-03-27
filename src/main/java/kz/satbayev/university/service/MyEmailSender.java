package kz.satbayev.university.service;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MyEmailSender extends JavaMailSenderImpl {
}

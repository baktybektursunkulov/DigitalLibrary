package kz.satbayev.university.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmailServiceTest {

    @Autowired
    EmailService emailService;

    @Test
    void sendEmail() throws MessagingException, IOException {
        emailService.sendEmail("baktybektursunkulov9@gmail.com","test","test2");
    }
}
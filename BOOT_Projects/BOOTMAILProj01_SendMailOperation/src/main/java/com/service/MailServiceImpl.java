package com.service;


import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service("mailservice")
public class MailServiceImpl implements IMailService {
	
	@Autowired
    JavaMailSender mail;
	
	@Value("${spring.mail.username}")
	String fromMail;
	
	public String shoppingCart(String[] items, float[] prices, String[] mails) throws Exception {
		float totalPrice = 0;
		for(float f: prices) {;
			totalPrice+=f;
		}
		String  msg=Arrays.toString(items)+" items are purchased having prices"+Arrays.toString(prices)+" with the billamount::"+totalPrice;
		String result = sendMail(fromMail, mails, msg);
		return msg+" -> "+result;
	}

	// With setReplyTo we can control where reply should be sent from the email address we are sending
	// mail to 
	@Override
	public String sendMail(String fromEmail, String[] mails, String msg) throws MessagingException {
		MimeMessage message = mail.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setFrom(fromEmail);
		helper.setTo(mails);
		helper.setSubject("Sending mail through spring application");
		helper.setText(msg);
		helper.setSentDate(new Date());
		helper.addAttachment("windows11.jpg", new ClassPathResource("windows11.jpg"));
		mail.send(message);
		
		return "Mail is sent with attachment";
	}

}

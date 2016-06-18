/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.mail<br>
 * File name is IdentifyMail.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.mail;

import java.util.Locale;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;

import com.faveroomies.DTO.RoomieImpl;

/**
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
@Component
@Service
public class EmailNotificationService {

	private Logger logger = LoggerFactory.getLogger(EmailNotificationService.class);

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private SpringTemplateEngine templateEngine;

	private final String MAIL_FROM = "no-reply@faveroomies.com";

	public void register(RoomieImpl roomie, String code, Locale locale) {

		logger.info("Email sender");
		logger.info("Roomie : " + roomie + "roomie values [" + roomie.getmUser() + " // "
				+ roomie.getmEmail() + " code : " + code + " ]");

		this.sendConfirmationEmail(roomie, code, locale);
	}

	private void sendConfirmationEmail(RoomieImpl roomie, String code, Locale locale) {

		logger.info("Send Confirmation Email Roomie : " + roomie + "roomie values [" + roomie.getmUser()
				+ " // " + roomie.getmEmail() + " code : " + code + " ]");
		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			@Override
			public void prepare(MimeMessage mimeMessage) {

				logger.info("Send Confirmation Email setting");

				try {
					MimeMessageHelper message = new MimeMessageHelper(mimeMessage);

					
					message.setTo(roomie.getmEmail());
					message.setFrom(MAIL_FROM);

					Context context = new Context(locale);
					context.setVariable("roomie", roomie);
					context.setVariable("rcode", code);
					context.setVariable("confirmLink", "http://faveroomies.com/confirm/"+code+"/"+roomie.getmUser());

					String htmlContent = templateEngine.process("mail_confirmation", context);

					message.setSubject("FaveRoomies.com Sign Up Confirmation");
					message.setText(htmlContent, true);

				} catch (Exception e) {
					e.printStackTrace();
					logger.error(e.getMessage());
				}

			}
		};

		logger.info("mail send");
		mailSender.send(preparator);

	}

}

/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.mail<br>
 * File name is IdentifyMail.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.mail;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import com.faveroomies.form.RegisterForm;

/**
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
@Component
public class EmailNotificationService {

	private Logger logger = LoggerFactory.getLogger(EmailNotificationService.class);

	@Autowired
	private JavaMailSender mailSender;

	private final String MAIL_FROM = "no-reply@faveroomies.com";

	public void register(RegisterForm registerForm, String regiCode) {

		logger.info("Email sender");
		logger.info("Roomie : " + registerForm + "roomie values [" + registerForm.getUsername() + " // " + registerForm.getEmail()
				+ " code : " + regiCode + " ]");

		this.sendConfirmationEmail(registerForm, regiCode);
	}

	private void sendConfirmationEmail(RegisterForm registerForm, String regiCode) {

		logger.info("Send Confirmation Email Roomie : " + registerForm + "roomie values [" + registerForm.getUsername() + " // "
				+ registerForm.getEmail() + " code : " + regiCode + " ]");
		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			@Override
			public void prepare(MimeMessage mimeMessage) {

				logger.info("Send Confirmation Email setting");

				try {
					MimeMessageHelper message = new MimeMessageHelper(mimeMessage);

					message.setTo(registerForm.getEmail());
					message.setFrom(MAIL_FROM);

					Map<String, Object> model = new HashMap<String, Object>();

					model.put("roomie", registerForm);
					model.put("regiCode", regiCode);

					String mailText = "test";

					message.setText(mailText, true);

				} catch (Exception e) {
					e.printStackTrace();
					logger.error(e.getMessage());
				}

			}
		};

		logger.info("mail send");
		mailSender.send(preparator);

		/*logger.info("mail sender 2");
		MimeMessage message = mailSender.createMimeMessage();
		logger.info(mailSender.createMimeMessage().toString());
		
		try {
			
			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setFrom(MAIL_FROM);
			helper.setTo(roomie.getmEmail());
			helper.setText("test");
			
			logger.info(helper.getMimeMessage().toString());
			logger.info(helper.getEncoding());
			logger.info(message.getFrom().toString());
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} finally {
			logger.info("mail send 2");
			mailSender.send(message);
		}*/

	}

}

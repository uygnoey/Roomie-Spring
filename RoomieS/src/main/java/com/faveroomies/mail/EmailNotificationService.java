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

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.ui.ModelMap;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.faveroomies.DTO.Roomie;

/**
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class EmailNotificationService {

	private JavaMailSender mailSender;
	private VelocityEngine velocityEngine;

	@Value("spring.mail.host")
	private String mailHost;

	/**
	 * @param mailSender
	 *            the mailSender to set
	 */
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	/**
	 * @param velocityEngine
	 *            the velocityEngine to set
	 */
	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	public void register(Roomie roomie, String regiCode) {

		sendConfirmationEmail(roomie, regiCode);

	}

	private void sendConfirmationEmail(final Roomie roomie, final String regiCode) {

		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {

				MimeMessageHelper message = new MimeMessageHelper(mimeMessage);

				message.setTo(roomie.getmEmail());
				message.setFrom("no-reply@faveroomies.com", "Fave Roomies");
				
				Map<String, Object> model = new HashMap<String, Object>();

				model.put("roomie", roomie);
				model.put("regiCode", regiCode);

				String mailText = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "regiConfirmation.vm",
						"utf8", model);

				message.setText(mailText, true);
			}
		};

		this.mailSender.send(preparator);
	}

}

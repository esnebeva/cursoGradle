package co.ceiba.service;

import co.ceiba.domain.Person;

public class NotifyPersonService {
	private EmailService emailService;
	
	public NotifyPersonService(EmailService emailService){
		this.emailService = emailService;
	}
	
	public String notify(Person person){
		String message = "Welsome " + person.getLastName();
		return emailService.sendMail(message);
	}

}

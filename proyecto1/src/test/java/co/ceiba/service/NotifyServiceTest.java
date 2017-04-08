package co.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Person;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;


public class NotifyServiceTest {

	private NotifyPersonService notifyPersonService;
	private EmailService emailservice;
	
	@Before
	public void setup(){
		emailservice = new EmailService();
		notifyPersonService = new NotifyPersonService(emailservice);
	}
	
	@Test
	public void notifyTest(){
		//Arrange
		Person person = new PersonTestDataBuilder().build();
		//Act
		String message = notifyPersonService.notify(person);
		//Assert
		Assert.assertNotNull(message);
	}
}

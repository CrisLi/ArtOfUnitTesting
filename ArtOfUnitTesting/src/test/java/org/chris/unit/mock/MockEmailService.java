package org.chris.unit.mock;

public class MockEmailService implements IEmailService {

	public String to;
	public String subject;
	public String body;

	@Override
	public void sendEmail(String to, String subject, String body) {
		this.to = to;
		this.subject = subject;
		this.body = body;
	}

}

package org.chris.unit.mock;

public class LogAnalyzer {

	private IWebService webService;
	private IEmailService emailService;

	public LogAnalyzer() {
		webService = new RealWebService();
	}

	public LogAnalyzer(IWebService webService) {
		this.webService = webService;
	}

	public LogAnalyzer(IWebService webService, IEmailService emailService) {
		this.webService = webService;
		this.emailService = emailService;
	}

	public IWebService getWebService() {
		return webService;
	}

	public void setWebService(IWebService webService) {
		this.webService = webService;
	}

	public IEmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(IEmailService emailService) {
		this.emailService = emailService;
	}

	public void analyze(String fileName) {

		if (fileName.length() < 8) {

			try {
				webService.logError("Filename too short: " + fileName);
			} catch (Exception e) {
				emailService.sendEmail("a", "subject", e.getMessage());
			}

		}

	}
}

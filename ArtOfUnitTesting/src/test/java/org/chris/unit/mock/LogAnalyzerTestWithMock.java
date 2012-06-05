package org.chris.unit.mock;

import junit.framework.Assert;

import org.junit.Test;

public class LogAnalyzerTestWithMock {

	private LogAnalyzer logAnalyzer;

	@Test
	public void analyze_TooShortFileName_CallsWebService() {

		MockWebService mockWebService = new MockWebService();

		logAnalyzer = new LogAnalyzer(mockWebService);
		String tooShortFileName = "abc.ext";
		logAnalyzer.analyze(tooShortFileName);

		Assert.assertEquals("Filename too short: abc.ext", mockWebService.lastError);

	}

	@Test
	public void analyze_WebServiceThrows_SendsEmail() {

		StubWebService stubWebService = new StubWebService();
		stubWebService.toThrow = new RuntimeException("fake exception");

		MockEmailService mockEmailService = new MockEmailService();

		logAnalyzer = new LogAnalyzer(stubWebService, mockEmailService);
		
		String tooShortFileName = "abc.ext";
		logAnalyzer.analyze(tooShortFileName);
		
		Assert.assertEquals("a", mockEmailService.to);
		Assert.assertEquals("fake exception", mockEmailService.body);
		Assert.assertEquals("subject", mockEmailService.subject);
	}
}

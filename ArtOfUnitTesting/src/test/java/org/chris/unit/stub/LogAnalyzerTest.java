package org.chris.unit.stub;

import junit.framework.Assert;

import org.junit.Test;

public class LogAnalyzerTest {

	private LogAnalyzer logAnalyzer;
	private IExtensionManager manager = new StubExtensionManager();

	@Test
	public void isValidFileNameNameShorterThan6CharsButSupportedExtensionReturnsFalse() {

		logAnalyzer = new LogAnalyzer(manager);
		boolean result = logAnalyzer.isValidLogFileName("short.ext");
		Assert.assertFalse(
				"File name with less than 5 chars should have failed the method, even if the extension is supported",
				result);

	}
}

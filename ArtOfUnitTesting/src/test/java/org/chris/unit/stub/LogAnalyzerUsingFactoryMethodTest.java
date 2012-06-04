package org.chris.unit.stub;

import junit.framework.Assert;

import org.junit.Test;

public class LogAnalyzerUsingFactoryMethodTest {

	@Test
	public void overrideTestWithoutStub() {
		TestableLogAnalyzer analyzer = new TestableLogAnalyzer();
		analyzer.isSupported = true;
		boolean result = analyzer.isValidLogFileName("file.ext");
		Assert.assertFalse("...", result);		
	}
}

package org.chris.unit.stub;

public class TestableLogAnalyzer extends LogAnalyzerUsingFactoryMethod {

	public boolean isSupported;

	@Override
	protected boolean isValid(String fileName) {
		return isSupported;
	}

}

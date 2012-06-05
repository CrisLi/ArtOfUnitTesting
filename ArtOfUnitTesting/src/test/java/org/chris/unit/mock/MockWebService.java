package org.chris.unit.mock;

public class MockWebService implements IWebService {

	public String lastError;

	@Override
	public void logError(String message) {
		this.lastError = message;
	}

}

package org.chris.unit.mock;

public class StubWebService implements IWebService {

	public RuntimeException toThrow;

	@Override
	public void logError(String message) {

		if (toThrow != null) {
			throw toThrow;
		}
	}

}

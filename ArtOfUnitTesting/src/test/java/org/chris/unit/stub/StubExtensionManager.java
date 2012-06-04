package org.chris.unit.stub;

public class StubExtensionManager implements IExtensionManager {

	private boolean shouldExtensionBeValid = true;

	public boolean isValid(String fileName) {
		return shouldExtensionBeValid;
	}

}

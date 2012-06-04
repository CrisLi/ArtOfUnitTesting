package org.chris.unit.stub;

import org.apache.commons.io.FilenameUtils;

public class LogAnalyzer {

	private IExtensionManager manager;

	public LogAnalyzer() {
		manager = new FileExtensionManager();
	}

	public LogAnalyzer(IExtensionManager manager) {
		this.manager = manager;
	}

	public boolean isValidLogFileName(String fileName) {

		String baseName = FilenameUtils.getBaseName(fileName);

		return manager.isValid(fileName) && (baseName.length() > 5);
	}

	public IExtensionManager getManager() {
		return manager;
	}

	public void setManager(IExtensionManager manager) {
		this.manager = manager;
	}

}

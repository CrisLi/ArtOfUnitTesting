package org.chris.unit.stub;

import org.apache.commons.io.FilenameUtils;

public class LogAnalyzerUsingFactoryMethod {

	public boolean isValidLogFileName(String fileName) {
		String baseName = FilenameUtils.getBaseName(fileName);
		return this.isValid(fileName) && (baseName.length() > 5);
	}

	protected boolean isValid(String fileName) {
		FileExtensionManager mgr = new FileExtensionManager();
		return mgr.isValid(fileName);
	}

}

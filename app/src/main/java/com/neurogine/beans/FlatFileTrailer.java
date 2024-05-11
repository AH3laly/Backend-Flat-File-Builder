package com.neurogine.beans;

import org.beanio.annotation.Field;

public class FlatFileTrailer {

	@Field(at=1, maxLength=13)
    public String recordType;
	
	@Field(at=14, maxLength=15, defaultValue = "FLAT_FILE")
    public String fileType;

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}

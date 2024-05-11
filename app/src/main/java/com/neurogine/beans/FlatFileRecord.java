package com.neurogine.beans;

import java.util.List;

import org.beanio.annotation.Field;

public class FlatFileRecord {
	
	@Field(at=34, maxLength=14)
	public String REFERENCE_NO;
	
	@Field(at=40, maxLength=16)
	public String AMOUNT;

	public String getREFERENCE_NO() {
		return this.REFERENCE_NO;
	}
	
	public void setREFERENCE_NO(String REFERENCE_NO) {
		this.REFERENCE_NO = REFERENCE_NO;
	}

	public String getAMOUNT() {
		Double d = 10.10d;
		return String.format("RM%.2f", Double.parseDouble(this.AMOUNT));
	}

	public void setAMOUNT(String AMOUNT) {
		this.AMOUNT = AMOUNT;
	}
}

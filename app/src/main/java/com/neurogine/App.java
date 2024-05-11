package com.neurogine;

import java.util.ArrayList;
import java.util.List;

import com.neurogine.beans.FlatFileRecord;
import com.neurogine.services.FlatFileService;
import com.neurogine.services.FlatFileServiceImpl;

public class App {

    public static void main(String[] args) {
    	
    	FlatFileService flatFileService = new FlatFileServiceImpl();
    	
    	flatFileService.loadMappingFile();
    	flatFileService.generate(generateDemoRecords());

    }
    
    
    private static List<FlatFileRecord> generateDemoRecords() {
    	
    	List<FlatFileRecord> demoDateList = new ArrayList<FlatFileRecord>();
    	
    	
    	
    	for(Integer i = 1; i < 20; i++) {
    		FlatFileRecord tempF = new FlatFileRecord();
    		tempF.setAMOUNT(String.valueOf(10.01 + (float)i));
    		tempF.setREFERENCE_NO("6813162459".concat(String.valueOf(i)));
    		demoDateList.add(tempF);
    	}
    	
    	return demoDateList;
    }
}

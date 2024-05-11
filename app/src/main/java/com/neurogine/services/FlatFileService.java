package com.neurogine.services;

import java.util.List;

import com.neurogine.beans.FlatFileRecord;

public interface FlatFileService {
	public static final String STORAGE_ROOT = "/projects/Backend-Flat-File-Builder/Backend-Flat-File-Builder/app/src/main/resources/";
	public static final String MAPPING_FILE_NAME = "mapping.xml";
	public static final String MAPPING_FILE_STREAM_NAME = "flatFileMainStream";
	public static final String OUTPUT_FILE_NAME = "flat_output.txt";
	public void loadMappingFile();
	public void loadMappingFile(String sourceFile);
	public void generate(List<FlatFileRecord> content);
	public void generate(List<FlatFileRecord> content, String destinationFile);
}

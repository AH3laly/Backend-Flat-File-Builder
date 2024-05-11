package com.neurogine.services;

import java.io.File;
import java.util.List;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import com.neurogine.beans.FlatFileHeader;
import com.neurogine.beans.FlatFileRecord;
import com.neurogine.beans.FlatFileTrailer;

public class FlatFileServiceImpl implements FlatFileService{

	StreamFactory streamFactory = StreamFactory.newInstance();

	@Override
	public void generate(List<FlatFileRecord> content) {
		generate(content, OUTPUT_FILE_NAME);
	}
	
	private void addFlatFileHeader(BeanWriter beanWriter) {
		beanWriter.write(new FlatFileHeader());
	}
	
	private void addFlatFileTrailer(BeanWriter beanWriter) {
		beanWriter.write(new FlatFileTrailer());
	}
	
	@Override
	public void generate(List<FlatFileRecord> flatRecordList, String destinationFile) {
		
		BeanWriter beanWriter = streamFactory.createWriter(MAPPING_FILE_STREAM_NAME, new File(destinationFile));
		
		addFlatFileHeader(beanWriter);
		
    	for(FlatFileRecord fr : flatRecordList) {
    		beanWriter.write(fr);
    	}
    	
    	addFlatFileTrailer(beanWriter);

    	beanWriter.flush();
    	beanWriter.close();
		
	}

	@Override
	public void loadMappingFile() {
		loadMappingFile(MAPPING_FILE_NAME);
	}

	@Override
	public void loadMappingFile(String sourceFile) {
		streamFactory.load(sourceFile);
	}
}

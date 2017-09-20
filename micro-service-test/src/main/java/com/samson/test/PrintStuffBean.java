package com.samson.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


@Service("PrintStuff")
public class PrintStuffBean implements PrintStuff{

	private static final Logger logger = Logger.getLogger(PrintStuffBean.class);
	public void getStringAndPrint() {
		File file = new File("d:\\fg.ini");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while (br.read()!=-1) {
				logger.info(br.readLine());
				
			}
		}catch(Exception e) {
			logger.error("cannot load file or print stuffs", e);
		}
		
	}
}

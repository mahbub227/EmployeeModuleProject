package com.bjit.EmployeeModuleProject.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtility {
	
	private static final String ABS_PATH="C:\\Users\\shamsul\\Documents\\workspace-sts-3.9.2.RELEASE\\EmployeeModuleProject\\src\\main\\webapp\\WEB-INF\\images\\";
	private static String REAL_PATH="";

	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtility.class);
	public static void uploadFile(HttpServletRequest request, MultipartFile file, String image) {
		// TODO Auto-generated method stub
		REAL_PATH = request.getSession().getServletContext().getRealPath("/images/");
		logger.info(REAL_PATH);
		
		if(!new File(ABS_PATH).exists()) {
			new File(ABS_PATH).mkdirs();
		}
		if(!new File(REAL_PATH).exists()) {
			new File(REAL_PATH).mkdirs();
		}
		
		try {
			file.transferTo(new File(REAL_PATH + image +".jpg"));
			file.transferTo(new File(ABS_PATH + image +".jpg"));
		}
		catch(IOException ex) {
			
		}
	}
	

}

package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configration_Reader {

	public static Properties p;
	public Configration_Reader() throws Throwable{
		File f = new File("C:\\Users\\User\\eclipse-workspace\\Adactin01\\src\\test\\java\\com\\adactin\\properties\\Configration.properties ");
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	p.load(fis);
	

	}


		public String getBrowser() {
		String browser = p.getProperty("browser");
		System.out.println(""+browser );
		return browser; 
		
		}

		public String getUrl() {
			String url = p.getProperty("Url");
			return url;
			
		}




}

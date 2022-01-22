package com.adactin.helper;	

public class File_Reader_Manager {

	
	private File_Reader_Manager(){
		
	}
	
	
	
	
	
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;
	}
	
	public  Configration_Reader getInstanceCR() throws Throwable {
		Configration_Reader cr = new Configration_Reader();
		return cr;
		
	
	
	
	
	
	}
}

package Genric_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_File {

	
		
	public String getPropertyKeyValue(String key) throws IOException
 {
	  
FileInputStream fis=new FileInputStream("./src/test/resources/Commondata.properties.txt");
         
        Properties pro=new Properties();
          pro.load(fis);
 
          String value=pro.getProperty(key);
          return value;
 
	}
 
}


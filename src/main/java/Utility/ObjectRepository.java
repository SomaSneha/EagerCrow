package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepository {
protected String getLocator(String l) {
	Properties prop=new Properties();
	try{
		FileInputStream fis=new FileInputStream("KeywordDrivenFramework/Config/ObjectRepository.properties");
	    prop.load(fis);
	    String locator=(String) prop.get(l);
	    
	}
	catch(FileNotFoundException e) {
		e.getStackTrace();
	}
	catch(IOException e) {
		e.getStackTrace();
	}
	return l;
	

}
}

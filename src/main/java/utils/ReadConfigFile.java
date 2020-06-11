package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {

	public static String readConfig(String property) {
		String propValue = null;
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("./src/main/resources/properties/config.properties");
			prop.load(fis);
			propValue = prop.getProperty(property);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return propValue;

	}
	 
	

}


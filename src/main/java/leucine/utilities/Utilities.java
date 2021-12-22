package leucine.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import leucine.core.Base;

public class Utilities extends Base{

	public static FileReader file = null;

	public static String getConfigProperty(String key) {

		Properties p = new Properties();

		try {
			file = new FileReader(System.getProperty("user.dir") + File.separator + "Resources" + File.separator
					+ "config.properties");
			p.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p.getProperty(key);
	}
	
	
}

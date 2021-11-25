package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public void automation() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\srava\\eclipse-workspace\\DigitalCutlet\\src\\test\\java\\properties");
		prop.load(fis);
		System.out.println("url");
		System.out.println("email");
		System.out.println("password");
		System.out.println("browser");

	}

}

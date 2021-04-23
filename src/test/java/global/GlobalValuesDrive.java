package global;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\MyWorkSpace\\learning\\src\\test\\java\\global\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fo=new FileOutputStream("D:\\MyWorkSpace\\learning\\src\\test\\java\\global\\data.properties");
		prop.store(fo, null);

	}

}

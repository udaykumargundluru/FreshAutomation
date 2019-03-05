package com.qa.hubspot.Base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class BasePage {

		public WebDriver driver;
		public Properties prop;

		public WebDriver initialize_driver() {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\uday3\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			return driver;
		}
		
		public Properties initialize_Properties(){
			prop = new Properties();
			try {
				FileInputStream ip = new FileInputStream("C:\\Users\\uday3\\Desktop\\New folder\\Javalatest\\FreshAutomation\\src\\main\\java\\com\\qa\\hubspot\\config\\config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return prop;
		}
		

	}

	

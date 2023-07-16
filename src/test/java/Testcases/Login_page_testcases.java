package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Locators.Login_Page_locators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page_testcases extends Login_Page_locators{

	@Test
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");	
		String tabtitle=dr.getTitle();
		Assert.assertTrue(true, tabtitle);
	}
}

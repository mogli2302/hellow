package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Commonutils.PropertyFileUtil;
import Commonutils.Webdriverutil;

public class OrganizationTest {
	
	


@Test
public void CreateOrganizationTest() throws IOException, InterruptedException {
	PropertyFileUtil putil=new PropertyFileUtil();
	Webdriverutil wutil=new Webdriverutil();
    WebDriver driver=new ChromeDriver();
	//to maximize the window
      wutil.maximize(driver);
	wutil.implicitwait(driver);
	//to read data from property file
	  String URL= putil.getDataPropertyFile("Url");
	  String USERNAME= putil.getDataPropertyFile("Username");
	  String PASSWORD= putil.getDataPropertyFile("Password");
	
	  
	  driver.get(URL);
	  
	  driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	  driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	  driver.findElement(By.id("submitButton")).click();
	  
  	
	}
}

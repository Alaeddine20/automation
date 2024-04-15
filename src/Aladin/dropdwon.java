package Aladin;




import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdwon {
	
	
	static WebDriver driver;

	By user_name = By.xpath("//*[@id=\"user_name\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By sign = By.xpath("//*[@id=\"login_submit\"]");
	By customer_menu_filed= By.xpath("/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span");
	By add_customer_validation_filed= By.xpath("//*[@id=\"customers\"]/li[2]/a/ span");
	By full_name_filed= By.xpath("//*[@id=\"general_compnay\"]/div[1]/div/input");
	By Dashboard= By.xpath("/html/body/div[1]/section/div/div[2]/div/div/header/div/strong");

@SuppressWarnings("deprecation")
@Before 


public void init () {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\automation\\selenium\\chrome\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://codefios.com/ebilling/");
	driver.manage().window().maximize();
//driver.manage().timeouts().setScriptTimeou, arg1)
	
 
	
}
@SuppressWarnings("unused")
private void WebDriverWait() {
	// TODO Auto-generated method stub
	
}
@Test
	public void testlogin() {
	
		driver.findElement( user_name).sendKeys("demo@codefios.com");
		driver.findElement(password).sendKeys("abc123");
		driver.findElement( sign).click();
	
		
		
		Assert.assertTrue("dashbored page dont exist", driver.findElement(Dashboard).isDisplayed());
	//Assert.assertEquals("dashboard page not found", "Dashboard",driver.findElement(Dashboard).isDisplayed());
}
	//@Test
public void testaddcustomer() {

	testlogin();

	driver.findElement(customer_menu_filed).click();
	driver.findElement(add_customer_validation_filed).click();
	Assert.assertEquals("Add Customer page not found!!", "New Customer",driver.findElement(add_customer_validation_filed).getText());
//	Select sel - new Select (driver. findElement (COMPANY DROPWOWN ETELD) ) ; sel. selectByVisiblfText ("Techfios*a
	//sel.selectByValue ("Techfios") :
	//sel. selectByIndex (7);
	
	
	
}

}

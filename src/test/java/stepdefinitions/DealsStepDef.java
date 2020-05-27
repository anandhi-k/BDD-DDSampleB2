package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDef {
//	WebDriver driver;
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_login_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://classic.crmpro.com/");
//	}
//
//	@When("^Title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() throws Throwable {
//	   String title = driver.getTitle();
//	   System.out.println("Page Title : " + title);
//	   Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//	
//	@Then("^User enters credential$")
//	public void user_enters_credential(List<UserCredential> userCredentials) throws Throwable {
//		for(UserCredential userData:userCredentials) {
//		driver.findElement(By.name("username")).sendKeys(userData.getUsername());
//		driver.findElement(By.name("password")).sendKeys(userData.getPassword());
//		}
//	}
//	
//	@Then("^User clicks login button$")
//	public void user_clicks_login_button() throws Throwable {
//		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
//	   
//	}
//
//	@Then("^User is on Home Page$")
//	public void user_is_on_Home_Page() throws Throwable {
//	   String title = driver.getTitle();
//	   Assert.assertEquals("CRMPRO", title);
//	   
//	}
//	
//	@Then("^User moves to New Deal Page$")
//	public void user_moves_to_New_Deal_Page() throws Throwable {
//	  driver.switchTo().frame("mainpanel");
//	  Actions action = new Actions(driver);
//	  Thread.sleep(3000);
//	  action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
//	  driver.findElement(By.xpath("//a[contains(text(), 'New Deal')]")).click();
//	}
//
//	@Then("^User enters deal details$")
//	public void user_enters_deal_details(DataTable dealData) throws Throwable {
//		//List<Map<String, String>> sampleData = dealData.asMaps(String.class, String.class);
//		for(Map<String, String> data : dealData.asMaps(String.class, String.class)) {
//			driver.findElement(By.id("title")).sendKeys(data.get("title"));
//			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
//			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
//			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
//			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//			Actions action = new Actions(driver);
//			Thread.sleep(5000);
//			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
//			driver.findElement(By.xpath("//a[contains(text(), 'New Deal')]")).click();
//		}
//	 
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() throws Throwable {
//		Thread.sleep(2000);
//	   driver.quit();
//	}


}

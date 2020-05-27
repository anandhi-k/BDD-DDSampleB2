package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {
	
//	WebDriver driver;
//	@Given("^User is already on login page$")
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
////	@Then("^User enters credential$")
////	public void user_enters_credential() throws Throwable {
////	   driver.findElement(By.name("username")).sendKeys("anandhi_k");
////	   driver.findElement(By.name("password")).sendKeys("crmpro@123");
////	}
//	
////	@Then("^User enters \"(.*)\" and \"(.*)\"$")
////	public void user_enters_credential(String username, String pwd) throws Throwable {
////	   driver.findElement(By.name("username")).sendKeys(username);
////	   driver.findElement(By.name("password")).sendKeys(pwd);
////	}
//
////	@Then("^User enters credential$")
////	public void user_enters_credential(DataTable data) throws Throwable {
////		List<List<String>> rawData = data.raw();
////		driver.findElement(By.name("username")).sendKeys(rawData.get(0).get(0));
////		driver.findElement(By.name("password")).sendKeys(rawData.get(0).get(1));
////	}
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
//	@Then("^Close the browser$")
//	public void close_the_browser() throws Throwable {
//		Thread.sleep(2000);
//	   driver.quit();
//	}

}

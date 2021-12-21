package com.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	
WebDriver driver;

@Given("user is on the facebook page")
public void user_is_on_the_facebook_page() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
@When("user should login")
public void user_should_login(io.cucumber.datatable.DataTable dataTable) {
 List<Map<String, String>> emp = dataTable.asMaps();
 Map<String, String> map = emp.get(2);
 String s = map.get("username");
 String s1 = map.get("password");
 WebElement element = driver.findElement(By.id("email"));
 element.sendKeys(s);
 WebElement element2 = driver.findElement(By.id("pass"));
 element2.sendKeys(s1);
 
}


@Then("verify user page")
public void verify_user_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
}

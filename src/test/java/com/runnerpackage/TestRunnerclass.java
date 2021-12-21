package com.runnerpackage;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.stepdefinition"},monochrome=true,dryRun=false,plugin= {"pretty","json:src\\test\\resources\\Reports\\output.json"})
public class TestRunnerclass {
	@AfterClass
	public static void afterclass() {
		String path = System.getProperty("user.dir");
		Reporting.jvmReports(path+"\\src\\test\\resources\\Reports\\output.json");
	}

}


package com.todomvc.features.excercise;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.util.EnvironmentVariables;

public class Common {
	//private String webUrl = "http://todomvc.com/examples/angularjs/";
	private WebDriver driver;
	private final static String EXPECT_TITLE = "AngularJS • TodoMVC";
	private String baseUrl;
	private EnvironmentVariables variableEnvironment;
	
	@Before
	public void tear_up() {
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		baseUrl = variableEnvironment.getProperty("webdriver.base.url");
		driver.get(baseUrl);
		
	}
	
	public String getTitlePage() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	public String getExpectTitle() {
		return EXPECT_TITLE;
	}
	
	@After
	public void tear_down() {
		driver.quit();
	}
}


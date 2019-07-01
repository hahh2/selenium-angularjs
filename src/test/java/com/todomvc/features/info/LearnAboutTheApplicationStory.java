package com.todomvc.features.search;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindPageTitle {

	WebDriver driver = null;
	public final static String webUrl = ("http://todomvc.com/examples/angularjs/#/");
	@Test
	public void should_see_the_correct_website_title() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get(webUrl);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectTitle = "AngularJS • TodoMVC";
		if(actualTitle.contains(expectTitle)) {
			
			System.out.print("Đúng tiêu đề");
		}else {
			System.out.print("Sai điêu đề");
		}
		driver.quit();
	}

}

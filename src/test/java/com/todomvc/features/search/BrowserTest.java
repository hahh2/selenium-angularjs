package com.todomvc.features.search;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public String webUrl = "http://bongdaso.com";
	WebDriver browser = null;
	@Test
	public void openAppChrome() {
		
		// duong dan nay chi toi cai chromedriver.exe trong thu muc driver ben trai do. theo cach 2
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		
		browser = new ChromeDriver();
		browser.get(webUrl);
		
		// tat trinh duyet sau khi bat len
		browser.quit();
		
		// Viec setup chromedriver co the dien ra o 4 cho khac nhau
		// 1. setup o dong lenh nhu bạn vua nhin thay. Cai nay co muc uu tien nhat. No se override het nhung cho khac
		// 2. setup trong code: nhu o phia tren
		// 3. setup trong file serenity.properties
	}

	@Test
	public void openAppFirefox() {
		
		// duong dan nay chi toi cai chromedriver.exe trong thu muc driver ben trai do. theo cach 2
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");

		
		browser = new FirefoxDriver();
		browser.get(webUrl);
		
		// tat trinh duyet sau khi bat len
		browser.quit();
		
		// Viec setup chromedriver co the dien ra o 4 cho khac nhau
		// 1. setup o dong lenh nhu bạn vua nhin thay. Cai nay co muc uu tien nhat. No se override het nhung cho khac
		// 2. setup trong code: nhu o phia tren
		// 3. setup trong file serenity.properties
	}
}

package duckduck;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
public class Scariano01{

	@Test
	public void LeanAboutScariano01() {
		//	Mở trang web : https://duckduckgo.com
		//	Gõ từ khóa cần tìm kiếm: "selenium vietnam"
		//	Tiêu đề của trang web sẽ hiển thị LÀ (is/equal) : "selenium vietnam at DuckDuckGo"	
		String baseUrl = "http://duckduckgo.com";
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement input; // khai bao doi tuong tren web
		input = driver.findElement(By.id("search_form_input_homepage"));//tim kiem doi tuong tren web
		input.sendKeys("selenium vietnam");
		WebElement seachButton = driver.findElement(By.id("search_button_homepage"));
		seachButton.click();
		assertThat(driver.getTitle()).isEqualTo("selenium viet nam at DuckDuckGo");
		driver.quit();
	}


}

package duckduck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scariano02 {

		//Mở trang web : https://duckduckgo.com
		//Gõ từ khóa cần tìm kiếm: "selenium vietnam"
		//Tiêu đề của trang web sẽ hiển thị KHÔNG (NOT)  phải là : "selenium at DuckDuckGo"
	@Test
	public void LeanAboutScariano02() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		String baseUrl = "https://duckduckgo.com";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement input = driver.findElement(By.id("search_form_input_homepage"));
		input.sendKeys("selenium viet nam");
		WebElement seachButton = driver.findElement(By.id("search_button_homepage"));
		seachButton.click();
		assertThat(driver.getTitle()).isNotEqualTo("selenium at DuckDuckGo");
		driver.quit();
	}
	
}


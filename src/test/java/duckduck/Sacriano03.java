package duckduck;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class Sacriano03 {

	//Mở trang web : https://duckduckgo.com
	//	Gõ từ khóa cần tìm kiếm: "selenium vietnam"
	//	Tiêu đề của trang web sẽ CHỨA (contains) cụm từ : "selenium vietnam"
	@Test
	public void LeanAboutScariano03() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://duckduckgo.com";
		driver.get(baseUrl);
		WebElement input = driver.findElement(By.id("search_form_input_homepage"));
		input.sendKeys("selenium viet nam");
		WebElement seachButton = driver.findElement(By.id("search_button_homepage"));
		seachButton.click();
		assertThat(driver.getTitle().contains("selenium vietnam"));
		driver.quit();
	}
}
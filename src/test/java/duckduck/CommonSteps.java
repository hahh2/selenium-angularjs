package duckduck;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonSteps {
	/*Tạo một package tên là duckduck trong thư mục root package

	Kịch bản 01

	Mở trang web : https://duckduckgo.com
	Gõ từ khóa cần tìm kiếm: "selenium vietnam"
	Tiêu đề của trang web sẽ hiển thị LÀ (is/equal) : "selenium vietnam at DuckDuckGo"
	Kịch bản 02

	Mở trang web : https://duckduckgo.com
	Gõ từ khóa cần tìm kiếm: "selenium vietnam"
	Tiêu đề của trang web sẽ hiển thị KHÔNG (NOT)  phải là : "selenium at DuckDuckGo"
	Kịch bản 03

	Mở trang web : https://duckduckgo.com
	Gõ từ khóa cần tìm kiếm: "selenium vietnam"
	Tiêu đề của trang web sẽ CHỨA (contains) cụm từ : "selenium vietnam"*/
	
	private String baseUrl = "https://duckduckgo.com";
	WebDriver driver = null;
	private WebElement obj;
	//private EnvironmentVariables varEnviroments;
	@Before
	public void tearUp() {
		//baseUrl = varEnviroments.getProperty("webdriver.base.url");
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	public String get_Title() {
		String title = driver.getTitle();
		return title;
	}
	
	public void insertWebPage() {
		obj = driver.findElement(By.id("search_form_input_homepage"));
		obj.sendKeys("selenium viet nam");
	}
	public void searchWebPage() {
		obj = driver.findElement(By.id("search_button_homepage"));
		obj.click();		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}

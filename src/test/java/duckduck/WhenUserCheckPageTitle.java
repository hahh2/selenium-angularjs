package duckduck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;
public class WhenUserCheckPageTitle extends CommonSteps{
	String title = null;
	
	@Ignore
	public void should_see_that_correct_web_page_title () {
		insertWebPage();
		searchWebPage();
		title = get_Title();
		System.out.print(title);
		assertThat(title).isEqualTo("selenium viet nam ad duck duck go");
	}
	@Test
	public void should_see_that_incorrect_web_page_title () {
		insertWebPage();
		searchWebPage();
		title = get_Title();
		System.out.print(title);
		assertThat(title).isNotEqualTo("selenium at DuckDuckGo");
	}
	@Ignore
	public void should_see_that_web_page_title_contains_expectation () {
		insertWebPage();
		searchWebPage();
		title=get_Title();
		assertThat(title).contains("selenium vietnam");
	}
}

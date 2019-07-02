package duckduck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;
public class WhenUserCheckPageTitle extends CommonSteps{
	String title = null;
	
	@Ignore
	public void LearnAbout1() {
		insertWebPage();
		searchWebPage();
		title = get_Title();
		System.out.print(title);
		assertThat(title).isEqualTo("selenium viet nam ad duck duck go");
	}
	@Test
	public void LearnAbout2() {
		insertWebPage();
		searchWebPage();
		title = get_Title();
		System.out.print(title);
		assertThat(title).isNotEqualTo("selenium at DuckDuckGo");
	}
	@Ignore
	public void LearnAbout3() {
		insertWebPage();
		searchWebPage();
		title=get_Title();
		assertThat(title).contains("selenium vietnam");
	}
}

package com.todomvc.features.excercise;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;


public class LeanAboutApplication1AssertJ extends Common {

	
	@Test
	public void show_test_correct_page_title() {
		String actualTitle = getTitlePage();
		System.out.print("AssertJ test");
		assertThat(actualTitle).isEqualTo(getExpectTitle());
		
	}
	@Test
	public void show_test_incorrect_page_title() {
		String actualTitle = getTitlePage();
		assertThat(actualTitle).isNotEqualTo(getExpectTitle());	
	}

}

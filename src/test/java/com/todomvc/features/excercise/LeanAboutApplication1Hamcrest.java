package com.todomvc.features.excercise;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.Ignore;
import org.junit.Test;
public class LeanAboutApplication1Hamcrest extends Common{


		@Ignore
		public void show_test_correct_page_title() {
			String actualTitle = getTitlePage();
			System.out.print("Hacmrest test");
			assertThat(actualTitle, is(getExpectTitle()));
		}
		
		@Test
		public void show_test_incorrect_page_title() {
			String actualTitle = getTitlePage();
			System.out.print(actualTitle);
			assertThat(actualTitle, not(is(getExpectTitle())));
		}

}

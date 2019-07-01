package com.todomvc.features.excercise;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class LeanAboutApplication1JUnit extends Common{
	//Bài 1: Viết kịch bản kiểm tra tiêu đề của trang web

	@Test
	public void show_test_correct_title_page() {
		String actualString = getTitlePage();
		System.out.print("Junit test");
		Assert.assertEquals(getExpectTitle(), actualString);
		
	
	}
	@Ignore
	public void show_test_incorrec_title_page() {
		String actualString = getTitlePage();
		Assert.assertNotEquals(actualString, getExpectTitle());
	}
	
	

}

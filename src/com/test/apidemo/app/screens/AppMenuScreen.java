package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

import com.test.utils.AbstractScreen;

public class AppMenuScreen extends AbstractScreen {

	@AndroidFindBy(accessibility = "Activity")
	private WebElement appActivity;

	public AppMenuScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		loadPage();
	}

	public AppActivityScreen getActivityPage() throws InterruptedException {
		// TODO Auto-generated method stub
		appActivity.click();
		Thread.sleep(8000);
		return new AppActivityScreen(driver);
	}

}

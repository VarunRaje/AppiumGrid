package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

import com.test.utils.AbstractScreen;

public class HomeScreen extends AbstractScreen {

	@AndroidFindBy(accessibility = "App")
	private WebElement appMenuItem;

	public HomeScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		loadPage();
	}

	public AppMenuScreen getAppMenuPage() throws InterruptedException {
		// driver.findElement(By.name("App")).click();
		appMenuItem.click();
		Thread.sleep(5000);
		return new AppMenuScreen(driver);
	}
}

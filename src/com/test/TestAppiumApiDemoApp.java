package com.test;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.apidemo.app.screens.AppActivityScreen;
import com.test.apidemo.app.screens.AppMenuScreen;
import com.test.apidemo.app.screens.HomeScreen;
import com.test.apidemo.app.screens.ScreenOrientationScreen;
import com.test.utils.AppUtils;

public class TestAppiumApiDemoApp {
	private AndroidDriver driver;
	private HomeScreen homeScreen;
	private AppMenuScreen appMenuPage;
	private AppActivityScreen appActivityPage;
	private ScreenOrientationScreen screenOrientationPage;
	private AppUtils appUtil;

	@Parameters("device_name")
	@BeforeClass(alwaysRun = true)
	public void startAutomation(String device_name) throws IOException {
		appUtil = new AppUtils();
		appUtil.loadConfigProp("config_apidemo_test_app.properties");
		if (device_name.equalsIgnoreCase("03157df35bde5405")) {

			appUtil.setCapabilities(device_name);
	    }
	    if(device_name.equalsIgnoreCase("8e94af86")){
	    	appUtil.setCapabilities(device_name);
	    }
	    
	  	driver = appUtil.getDriver();
	}

	@AfterClass(alwaysRun = true)
	public void stopAutomation() {
		driver.quit();
	}

	@Test(groups = { "Smoke" }, enabled = true)
	public void testAppActivity() throws InterruptedException {
		homeScreen = new HomeScreen(driver);
		appMenuPage = homeScreen.getAppMenuPage();
		appActivityPage = appMenuPage.getActivityPage();
	//	screenOrientationPage = appActivityPage.getScreenOrientationPage();
	//	Assert.assertEquals(screenOrientationPage.isItValidScreenOrientationPage(), true);
	//	screenOrientationPage.changeScreenOrientation("USER");
	//	Assert.assertEquals(screenOrientationPage.checkOrientationType(), true);
	}
}

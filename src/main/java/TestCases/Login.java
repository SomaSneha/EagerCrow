package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import Keywords.Keywords;

public class Login {
	public static Logger Log = Logger.getLogger(Login.class);

	@AfterMethod
	private void closeBrowser() {
		Log.info("Test done. Closing browser window");
		Keywords.driver.quit();
	}

	@Test
	public void tc_01() throws IOException {
		Keywords.openBrowser("Chrome");
		Log.info("Browser opened successfully");
		Keywords.openURL("https://www.facebook.com/");
		Keywords.maximiseBrowser();

		Keywords.enterText("XPATH", "//input[@id=\'u_0_m\']", "sneha");
		Keywords.enterText("XPATH", "//input[@name=\'lastname\']", "soma");
		Keywords.selectValueFromDropDown("XPATH", "//select[@id=\'day\']", "2");
		Keywords.selectValueFromDropDown("XPATH", "//select[@id=\'month\']", "Jul");
		Keywords.selectValueFromDropDown("XPATH", "//select[@id=\'year\']", "1991");
		Keywords.clickOnElement("XPATH", "//button[@name=\'websubmit\']");
		Keywords.takeScreenShots("C:\\Users\\Sunny\\Desktop\\testing\\Screenshots\\sneha.png");

	}

	@Test
	public static void tc_02() {
		Keywords.openBrowser("Chrome");
		Keywords.implicitWait(10, "SECONDS");
		Keywords.openURL("https://www.flipkart.com/");
		Keywords.openURL("https://www.facebook.com/");
		Keywords.openURL("https://www.amazon.com/");
		Keywords.navigateBackward();
		Keywords.navigateForward();

	}

	@Test
	public static void tc_03() {
		Keywords.openBrowser("Chrome");
		Keywords.openURL("http://demo.guru99.com/test/drag_drop.html");
		WebElement sourceLocation = Keywords.getWebElement("XPATH", "//li[@id='credit2']/a");
		WebElement destinationLocation = Keywords.getWebElement("XPATH", "//ol[@id='bank']/li");
		Keywords.dragAndDrop(sourceLocation, destinationLocation);
	}

	@Test
	public static void tc_04() {
		Keywords.openBrowser("Chrome");
		Keywords.openURL("https://www.naukri.com/");
		Keywords.switchToWindow("Tech Mahindra");
		Keywords.clickOnElement("XPATH", "//img[@alt='Tech Mahindra']");
	}
}

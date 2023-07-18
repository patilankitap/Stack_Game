package Test;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class StackTestCase_1 {

	public AndroidDriver driver;

	@BeforeTest
	public void setUp() throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "GameTesting");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");
		caps.setCapability("app", "C://Java Program//Stack_Game//src//test//resources//stack-3-30.apk");

		URL appiumServerURL = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(appiumServerURL, caps);
	}

	@Test
	public void testStartGame() {
		// Locate the "Start" button and click to start the game
		sleep(30000); 
		
		WebElement InstallButton = driver.findElement(MobileBy.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
		InstallButton.click();
		
		sleep(30000); 

		WebElement IagreeButton = driver.findElement(MobileBy.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button"));
		IagreeButton.click();
		
		sleep(30000); 

		WebElement startButton = driver.findElement(MobileBy.id("com.ketchapp.stack:id/unitySurfaceView"));
		startButton.click();
		sleep(30000); 
		
		int stackCount = 5; // Number of times to stack the blocks
		for (int i = 0; i < stackCount; i++) {
			for(int j= 0; j<=i; j++) {
			WebElement play = driver.findElement(MobileBy.id("com.ketchapp.stack:id/unitySurfaceView"));
			play.click();
			sleep(1500);
//			TouchAction action = new TouchAction(driver);
//			action.tap(PointOption.point(500, 1500)).perform();
			// Replace the coordinates with the appropriate values
		}
		sleep(5000);
		}
		System.out.println("Game Over!");
		
		
	}

//	@Test
	//public void testStackBlocks() {
//		
//		testStartGame();
//		
//		int stackCount = 5; // Number of times to stack the blocks
//		for (int i = 0; i < stackCount; i++) {
//			for(int j= 0; j<=i; j++) {
//			WebElement play = driver.findElement(MobileBy.id("com.ketchapp.stack:id/unitySurfaceView"));
//			play.click();
//			sleep(1500);
//			TouchAction action = new TouchAction(driver);
//			action.tap(PointOption.point(500, 1500)).perform();
//			// Replace the coordinates with the appropriate values
//		}
//		sleep(5000);
//		}
//		System.out.println("Game Over!");
//		
		// Tap on the screen to stack the blocks
//		int stackCount = 5; // Number of times to stack the blocks
//		for (int i = 0; i < stackCount; i++) {
//			for(int j= 0; j<=i; j++) {
//			WebElement play = driver.findElement(MobileBy.id("com.ketchapp.stack:id/unitySurfaceView"));
//			play.click();
//			sleep(1000);
//			TouchAction action = new TouchAction(driver);
//			action.tap(PointOption.point(500, 1500)).perform();
//			Replace the coordinates with the appropriate values
//		}
//		sleep(5000);
		//}
	//}

//	@Test
//	public void testGameOver() {
//		Simulate game over scenario by missing the stack
//		WebElement stackBlock = driver.findElement(MobileBy.id("stack_block"));
//		stackBlock.click();
//
//		Verify that the "Game Over" screen appears
//		WebElement gameOverText = driver.findElement(MobileBy.id("game_over_text"));
//		assert gameOverText.isDisplayed();
//	}
//
//	 Other test methods from the previous example
//
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}

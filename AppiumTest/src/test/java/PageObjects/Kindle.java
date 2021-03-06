package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Kindle {

	public AndroidDriver<AndroidElement> driver;

	public Kindle(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	// Selecting Kindle from Shop by category option
	@AndroidFindBy(id = "sbdCategory3")
	public AndroidElement Ereaders;

	public void clickOnKindle()
	{
		Ereaders.click();

	}

}

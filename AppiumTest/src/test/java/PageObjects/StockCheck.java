package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class StockCheck {

	public AndroidDriver<AndroidElement> driver;

	public StockCheck(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	//Add to cart button
	@AndroidFindBy(id = "add-to-cart-button")
	public AndroidElement atc;

	public void Availability()
	{  	
		TouchAction ts = new TouchAction(driver);
		ts.press(916, 1525 ).moveTo(340, 870).release().perform();	
		atc.click();
	}

}


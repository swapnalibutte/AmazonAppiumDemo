package Tests;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import PageObjects.AmazonHomepage;
import PageObjects.Kindle;
import PageObjects.KindlePaperwhite;
import PageObjects.StockCheck;
import PageObjects.TypeKindleEReader;
import PageObjects.UserSelection;

public class AddKindlePaperWhileToCart extends LaunchAppTest{

	public AndroidDriver<AndroidElement> driver;

	@Test(priority=1)
	public void setCapabilties() throws MalformedURLException, InterruptedException{	

		driver=Capabilities();
		Thread.sleep(5000);
	}
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//Skip login
	@Test(priority=2)

	public void selectSkipLogin() throws InterruptedException{
		UserSelection hp=new UserSelection(driver);
		//Thread.sleep(3000);
		hp.clickOnSkipButton();
		Thread.sleep(5000);
	}

	//Select Shop by category
	@Test(priority=3)
	public void selectShopByCategory() throws InterruptedException{
		AmazonHomepage ah = new AmazonHomepage(driver);
		//Thread.sleep(3000);
		ah.clickOnShopbycategory();
		Thread.sleep(5000);
	}

	//Select Category Kindle E-readers and e Books
	@Test(priority=4)
	public void selectCategory() throws InterruptedException{
		Kindle k = new Kindle (driver);
		//Thread.sleep(8000);
		k.clickOnKindle();
		Thread.sleep(8000);
	}
	//Select Kindle E Readers
	@Test(priority=5)
	public void selectItemKindleEReader() throws InterruptedException{
		TypeKindleEReader kin = new TypeKindleEReader(driver);
		kin.KindleEReader();
		Thread.sleep(3000);
	}
	//Select Kindle PaperWhite
	@Test(priority=6)
	public void selectKindlePaperWhite() throws InterruptedException{
		KindlePaperwhite kp = new KindlePaperwhite(driver);
		kp.Paperwhite();
		Thread.sleep(3000);
	}

	//Select Kindle PaperWhite
	@Test(priority=7)
	public void selectAddtoCart(){		
		StockCheck s = new StockCheck(driver);
		s.Availability();
		//Thread.sleep(3000);

	}	

}


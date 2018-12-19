package HomePageTest;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePageObjects.BasePage;
import HomePageObjects.DressPageObject;
import HomePageObjects.HomePageObjects;

import HomePageObjects.TshirtsPageObject;
import HomePageObjects.WomenPageObject;

public class HomePageTest {

	HomePageObjects hp;
	BasePage bp;
	WomenPageObject wp;
	DressPageObject dp;
	TshirtsPageObject tp;
	int value = new Random().nextInt(5000);

	public HomePageTest() {
		hp = new HomePageObjects();
		bp = new BasePage();
		wp = new WomenPageObject();
		dp = new DressPageObject();
		tp = new TshirtsPageObject();
	}

	@Test
	public void verifytestnavigation() {

		hp.clickWomen();
		Assert.assertTrue(wp.getheaderText().getText().trim().equals("WOMENS"), "Failed : Womens Page not navigated");
		hp.clickDresses();
		Assert.assertTrue(dp.getHeadertext().getText().trim().equals("DRESS"), "Dress Page Not Found");

		hp.clickTshirts();
		Assert.assertTrue(tp.getHeadertext().getText().trim().equals("T-SHIRTS"), "Tshirts Page Not Found");

	}

	@Test
	public void Verifytabs() {
		Assert.assertTrue(hp.DresstabEnabled().isDisplayed(), "The Dresstab is not Displayed");
		Assert.assertTrue(hp.TshirtstabEnabled().isDisplayed(), "The Tshirt tab is not Displayed");
		Assert.assertTrue(hp.WomentabEnabled().isDisplayed(), "The Womens tab is not Displayed");
	}

	@Test
	public void VerifyNewsLetter() {
		String email = "ArpTestautomation" + value + "@gmail.com";
		hp.enterEmailInNewsLetter(email);
		String alertMessage = hp.getAlertMsg();
		Assert.assertTrue(alertMessage.contains("Newsletter : You successfully subscribed to this newletter."),
				"Failed: Subscription is not successfull");

	}
@Test
public void VerifySociallinks() {
	Assert
	
	
	
	
}
}


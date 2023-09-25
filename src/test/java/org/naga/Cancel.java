package org.naga;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cancel extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserlaunch("Edge");
		implicitlyWait(20);
		driver.manage().window().maximize();
	}

	@Before
	public void before() {
		System.out.println("nagarajan");
	}

	@AfterClass
	public static void afterClass() {
	}

	@After
	public void after() {
		System.out.println("sadasivam");
	}

	@Test
	public void test() {
		Locator l = new Locator();
		geturl("https://adactinhotelapp.com/");
		Assert.assertTrue("verify url", getCurrenturl().contains("adactinhotelapp"));
		sendkeys(l.getUsername(), "HarishkumarB");
		sendkeys(l.getPassword(), "Gokul@6699");
		click(l.getLogin());
		Assert.assertTrue("verify url", getCurrenturl().contains("adactinhotelapp"));
		click(l.getBookHistory());

		WebElement alltext = driver.findElement(By.xpath("//table[@cellpadding='5']"));

		List<WebElement> cells = alltext.findElements(By.xpath("//input[@type='checkbox']"));
		click(cells.get(cells.size() - 1));
		click(l.getCancel());
		clickinAlert();

	}

}

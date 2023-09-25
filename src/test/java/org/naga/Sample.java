package org.naga;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample extends BaseClass {
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
		Assert.assertEquals("verify username","HarishkumarB",getAttribute(l.getUsername()));
		
		sendkeys(l.getPassword(), "Gokul@6699");
		Assert.assertEquals("verify password","Gokul@6699", getAttribute(l.getPassword()));
	
		click(l.getLogin());
		Assert.assertTrue("verify url", getCurrenturl().contains("adactinhotelapp"));
	}

	@Test
	public void test1() {
		Locator l = new Locator();
		selectByIndex(l.getLocation(), 2);
		Assert.assertEquals("verify location", "Melbourne", getAttribute(l.getLocation()));

		selectByIndex(l.getHotel(), 2);
		Assert.assertEquals("verify hotel", "Hotel Sunshine", getAttribute(l.getHotel()));

		selectByIndex(l.getRoomType(), 4);
		Assert.assertEquals("verify room", "Super Deluxe", getAttribute(l.getRoomType()));

		selectByIndex(l.getRoomNo(), 2);
		Assert.assertEquals("verify room number", "2", getAttribute(l.getRoomNo()));
		
        clear(l.getChckindate());
		sendkeys(l.getChckindate(), "28/08/2023");
		Assert.assertEquals("verify chechin", "28/08/2023", getAttribute(l.getChckindate()));
        l.getChckoutdate().clear();
		sendkeys(l.getChckoutdate(), "29/08/2023");
		Assert.assertEquals("verify checkout", "29/08/2023", getAttribute(l.getChckoutdate()));

		selectByIndex(l.getAdult(), 2);
		Assert.assertEquals("verify adult", "2", getAttribute(l.getAdult()));

		selectByIndex(l.getChild(), 2);
		Assert.assertEquals("verify child", "2", getAttribute(l.getChild()));
		click(l.getSearch());
	}

	@Test
	public void test2() {
		Locator l = new Locator();
		click(l.getRadio());
		click(l.getContinues());

	}

	@Test
	public void test3() {
		Locator l = new Locator();
		sendkeys(l.getFirstname(), "naga");
		Assert.assertEquals("verify firest name", "naga", getAttribute(l.getFirstname()));
		
		sendkeys(l.getLastname(), "rajan");
		Assert.assertEquals("verify last name", "rajan", getAttribute(l.getLastname()));
		
		sendkeys(l.getAddress(), "157,madam street");
		Assert.assertEquals("verify address", "157,madam street", getAttribute(l.getAddress()));
		
		sendkeys(l.getCardnumber(), "8056968683987898");
		Assert.assertEquals("verify card number", "8056968683987898", getAttribute(l.getCardnumber()));
		
		selectByIndex(l.getCardtype(), 2);
		Assert.assertEquals("verify card type","VISA",getAttribute(l.getCardtype()));
		
		selectByIndex(l.getMonthselect(), 1);
		selectByIndex(l.getSelectyear(), 10);
		sendkeys(l.getCcv(), "123");
		Assert.assertEquals("verify cvv", "123", getAttribute(l.getCcv()));
		click(l.getBooknow());
		System.out.println("ORDER NO:" + getAttribute(l.getOrdernumber()));

	}

}

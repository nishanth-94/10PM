package org.naga;

import java.awt.AWTException;
import java.util.List;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver chromeBroweser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver browserlaunch(String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static WebDriver browserlaunch2(String bname) {
		switch (bname) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;

	}

	
	//wait
	public static void implicitlyWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}

	// GetUrl
	public static void geturl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	public static String getCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void closewindow() {
		driver.close();
	}

	

	public static void quit() {
		driver.quit();
	}

	// SLEEP
	public static void threadsleep() throws InterruptedException {
		Thread.sleep(20);

	}

	// FIND LOCATORS
	public static WebElement findLocatorById(String Id) {
		WebElement element = driver.findElement(By.id(Id));
		return element;

	}

	public static WebElement findLocatorByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public static WebElement findLocatorByclassName(String classname) {
		WebElement element = driver.findElement(By.className(classname));
		return element;
	}

	public static WebElement findLocatorByxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static WebElement findLocatorBytagName(String tagname) {
		WebElement element = driver.findElement(By.tagName(tagname));
		return element;
	}



	// SEND KEYS

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();

	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}
	public static String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
      public static String getAttributeByValue(WebElement element, String value) {
		String attributevalue = element.getAttribute("value");
		return attributevalue;
	}

	// ACTIONS CLASS
	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragAnddrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();

	}

	public static void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void doubleclick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void sendkeyaByActionByAction(WebElement target, String keys) {
		Actions a = new Actions(driver);
		a.sendKeys(target, keys);
	}

	// ROBOT
	public static void keypress(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyPress(keycode);

	}

	public static void keyrelease(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyRelease(keycode);

	}

	// ALERT
	public static void clickinAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void cancleinAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void sendKeys(String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);

	}

	// SELECT CLASS
	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByvisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void selectByAttributeValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void deselectByvisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void deselectByAttributeValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
	}

	public static void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	// SCREENSHOT
	public File screenshot(String name) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		return s;
	}

	public File particularscreenshot(WebElement element) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		return s;
	}

	// FindElement
	public static WebElement findElement(String loc, String value) {
		WebElement t = null;
		if (loc.equals("id")) {
			t = driver.findElement(By.id(value));
		} else if (loc.equals("name")) {
			t = driver.findElement(By.name(value));
		} else if (loc.equals("xpath")) {
			driver.findElement(By.xpath(value));

		}
		return t;
	}

	// JAVA SCRIPT EXECUTOR
	public static void insertValueByjavaScript(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].settAttribute('value','data')", element);

	}

	public static Object returnValuesofUserEnteredText(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript("return arguments[0].gettAttribute('value')", element);
		return executeScript;
	}

	public static void buttonclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	// NAVIGATION
	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void to(String url) {
		driver.navigate().to(url);
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void back() {
		driver.navigate().back();
	}

	// Frames
	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToFrame(String id) {
		driver.switchTo().frame(id);

	}

	public static void ParentToFrame() {
		driver.switchTo().parentFrame();

	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// WINDOW HANDLIND
	public static void switchwindowByurl(String name) {
		driver.switchTo().window(name);

	}
	
	public static void switchWindowIndex(int index) {
		Set<String> allwindows = driver.getWindowHandles();
		
		List<String> li=new ArrayList<>();
		li.addAll(allwindows);
		
		driver.switchTo().window(li.get(index));
		
	}

	// PARENT ALL WINDOW
	public static void switchToAllWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();

		for (String parentWindow1 : allwindows) {
			if (parentWindow1.equals(parentWindow)) {
				driver.switchTo().window(parentWindow);
			}
		}

	}

	// VISIBLITY OF ELEMENT
	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}

	public static boolean isDisPlayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}
//	//Excell data sendkeys
//	public static  String readexcel(String filename,String sheet,int row,int cell) throws IOException {
//
//		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenExcel\\src\\test\\resources\\"+filename+".xlsx");
//		FileInputStream fi = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(fi);
//		Sheet s = w.getSheet(sheet);
//		Row r = s.getRow(row);
//		Cell c = r.getCell(cell);
//		int type = c.getCellType();
//		
//		String value=null;
//		if(type==1) {
//			 value = c.getStringCellValue();
//			
//		}else {
//			if(DateUtil.isCellDateFormatted(c)) {
//				Date dd = c.getDateCellValue();
//				SimpleDateFormat s1 =new SimpleDateFormat();
//				value = s1.format(dd);
//				
//			}else {
//				double no = c.getNumericCellValue();
//				long l =(long)no;
//				value=String.valueOf(1); 
//			}
//		}
//		return value;
		
		
}

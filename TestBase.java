package com.bdmoms.testbase;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class TestBase {
	JavascriptExecutor jse;
		public static final Logger log = Logger.getLogger(TestBase.class.getName());

		public WebDriver driver;
		String url = "https://moms.babydestination.com";
		String browser = "chrome";

		public void init() {
			selectBrowser(browser);
			getUrl(url);
			String log4jConfpath = "log4j.properties";
			PropertyConfigurator.configure(log4jConfpath);
		}

		public void selectBrowser(String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\BD Marketing\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
				log.info("Creating object of " + browser);
				driver = new ChromeDriver();
			}
		}

		public void getUrl(String url) {
			log.info("Navigating to " + url);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(url);

		}

/*		public void switchWindow() {
			String parent_window = driver.getWindowHandle();
			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();
			while (i1.hasNext()) {
				String child_window = i1.next();
				if (!parent_window.equalsIgnoreCase(child_window)) {
					driver.switchTo().window(child_window);

					driver.findElement(By.xpath("//*[@id='preg-1w-13w']/div[2]/div[3]/a/div/div")).click();
				}
			}
		}  */
		public void mouseOver()
		{
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id='mod-dob']/div/div/div/form/div/input"))).build();
			
		}
		public void back()
		{
			driver.navigate().to("https://moms.babydestination.com/forum");
		}
		public void forward()
		{
			driver.navigate().forward();
		}
		public void scroll(String scr)
		{
			jse = (JavascriptExecutor) driver;
			jse.executeScript(scr);
		}
		public void switchingWindow(String email,String pass) throws InterruptedException
		{
			driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[1]/section[3]/a[2]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/section[2]/a")).click();//facebook login
		
			String parent_window=driver.getWindowHandle();
			Set<String> s1=driver.getWindowHandles();
			Iterator<String> i1=s1.iterator();
			while(i1.hasNext())
			{
				
				String child_window=i1.next();
				if(!parent_window.equalsIgnoreCase(child_window))
				{
					
					
					Thread.sleep(5000);
					driver.switchTo().window(child_window);
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys();
					driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pass);
					driver.findElement(By.xpath("//*[@id=\"u_0_0\"]")).click(); 
					Thread.sleep(3000);
					driver.switchTo().window(parent_window);
					driver.close();
				
				}
			}
		}
	}



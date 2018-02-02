package com.bdmoms.homepage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bdmoms.actions.HomePagePregnancy;
import com.bdmoms.testbase.TestBase;

public class TC_004Pregnancy extends TestBase {
	JavascriptExecutor jse;
	HomePagePregnancy homePagePregnancy;

	@BeforeClass
	public void setUp() {
		init();
	}

	@Test(priority=1)
	public void login() throws InterruptedException
	{
		 homePagePregnancy =new HomePagePregnancy(driver);
		 homePagePregnancy.pregnancy();
	/*	driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[1]/section[3]/a[2]")).click();
		String parent_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[1]/section[2]/a")).click();//facebook login
		
		Thread.sleep(1000);
		
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
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8368509461");
				driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("nagendra");
				driver.findElement(By.xpath("//*[@id=\"u_0_0\"]")).click(); 
				Thread.sleep(5000);
				driver.switchTo().window(parent_window);
			}
		}
		driver.switchTo().window(parent_window);
		}

	@Test(priority = 1)
	public void pregnancy1() throws InterruptedException {
		try {			driver.findElement(By.xpath("//*[@id=\"basic-tab-bar\"]/a[3]")).click();

			Thread.sleep(1000);
			jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0,400)");
			Boolean status = driver
					.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[1]/div[2]/div/div/div/button"))
					.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void pregnancy2() throws InterruptedException {
		try {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[1]/div[2]/div/div/div/button"))
					.click();// load more
			Thread.sleep(500);
			jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0,500)");
			Boolean status = driver
					.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[1]/div[1]/div[10]/div/a/div"))
					.isDisplayed();
			Assert.assertTrue(status);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void pregnancy3() throws InterruptedException {
		try {
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[1]/div[1]/div[10]/div/a/div"))
					.click();// particular blog
			Thread.sleep(500);
			jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0,800)");
			Boolean status = driver.findElement(By.xpath("//*[@id=\"read_more\"]")).isDisplayed();
			Assert.assertTrue(status);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void pregnancy4() throws InterruptedException {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"read_more\"]")).click();
			Thread.sleep(800);
			jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(500,1000)");
			Thread.sleep(2000);
			WebElement preg1 = driver
					.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div[6]/div/div[1]/div/a/div"));
			Boolean status = preg1.isDisplayed();
			Assert.assertTrue(status);
			preg1.click();
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void pregnancy5() throws InterruptedException {
		try {
			String parent_window1 = driver.getWindowHandle();
			Set<String> s11 = driver.getWindowHandles();
			Iterator<String> i11 = s11.iterator();
			while (i11.hasNext()) {

				String child_window1 = i11.next();
				if (!parent_window1.equalsIgnoreCase(child_window1)) {

					Thread.sleep(2000);
					driver.switchTo().window(child_window1);
					Thread.sleep(2000);
					WebElement preg2 = driver.findElement(By.xpath("//*[@id=\"u_0_s\"]"));
					Boolean status = preg2.isDisplayed();
					Assert.assertTrue(status);
					preg2.sendKeys("Hi This is You");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"u_0_1v\"]")).click();
					driver.switchTo().window(parent_window1);
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void pregnancy6() throws InterruptedException {
		try {
			Boolean status = driver
					.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div[6]/div/div[3]/div/a/div"))
					.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(2000);
			for (int i = 0; i <= 4; i++) {
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div[6]/div/div[3]/div/a/div")).click();// next
				Thread.sleep(1500);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void pregnancy7() throws InterruptedException {
		try {
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id=\"app\"]/div/div/main/div/div[1]/div[2]/div/div[1]/div/section[2]/form/input"))
					.click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mobNum\"]")).sendKeys("0000000000");
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//*[@id=\"app\"]/div/div/main/div/div[1]/div[2]/div/div[1]/div/section[2]/form/input"))
					.click();
			System.out.println("Pregnancy completed");

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"basic-tab-bar\"]/a[3]")).click();
			Thread.sleep(1000);
			jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0,500)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[2]/div[2]/div[2]/div/div[1]"))
					.click();
			Thread.sleep(1000);
			for (int i = 0; i <= 2; i++) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[2]/div[3]/div/button[2]"))
						.click();// rightarrow card

			}
			driver.navigate().back();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterClass
	public void quit() {
		driver.quit();             */
	}

}

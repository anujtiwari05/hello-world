package com.bdmoms.actions;



	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.bdmoms.testbase.TestBase;

	public class HomePageVideos extends TestBase{
		JavascriptExecutor jse;
		public static final Logger log=Logger.getLogger(HomePageVideos.class.getName());
		@FindBy(xpath="//*[@id=\"basic-tab-bar\"]/a[2]")
		WebElement videoMenu;
		@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div/div[2]/div/div/div/button")
		WebElement loadMoreVideos;
		@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div/div[1]/div[10]/div/div")
		WebElement randomVideo;
		@FindBy(xpath="//*[@id=\"player_uid_741054373_1\"]/div[4]/button/div")
		WebElement playVideo;
		
		
		public HomePageVideos(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		public void videos() throws InterruptedException
		{
			videoMenu.click();
			log.info("Clicked on videoMenu and object is "+videoMenu.toString());
			scroll("scroll(0,200)");
			loadMoreVideos.click();
			log.info("Clicked on loadMoreVideos and object is "+loadMoreVideos.toString());
	        scroll("scroll(200,500)");
	        randomVideo.click();
			log.info("Clicked on RandomVideo and object is "+randomVideo.toString());
			playVideo.click();
			log.info("Clicked on playVideo and object is "+playVideo.toString());
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
		
	}

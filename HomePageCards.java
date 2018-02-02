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

public class HomePageCards extends TestBase{
	public static final Logger log=Logger.getLogger(HomePageCards.class.getName());
	@FindBy(xpath="//*[@id=\"basic-tab-bar\"]/a[1]")
	WebElement tipsMenu;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div/div[2]/div/div/div/button")
	WebElement loadMoreCards;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div/div[1]/div[9]/div/div[1]")
	WebElement tipsRandomCard;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div/div[1]/div[17]/div/button[2]")
	WebElement tipsRightArrow;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div/div[1]/div[17]/div/div[2]/ul[2]/li[1]/button")
	WebElement tipsZoomIn;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div/div[1]/div[17]/div/div[2]/ul[2]/li[2]/button")
	WebElement tipsZoomOut;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div/div[1]/div[17]/div/button[1]")
	WebElement tipsLeftArrow;
	
	public HomePageCards(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 
	public void quickTips() throws InterruptedException
	{
		tipsMenu.click();
		log.info("Clicked on tipsMenu and object is "+tipsMenu.toString());
		scroll("scroll(0,400)");
		loadMoreCards.click();
		log.info("Clicked on loadMoreCards and object is "+loadMoreCards.toString());
        scroll("scroll(400,1000)");
        Thread.sleep(1000);
        tipsRandomCard.click();
        Thread.sleep(1000);
		log.info("Clicked on tipsRandomCards and object is "+tipsRandomCard.toString());
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(2000);
		tipsRightArrow.click();
		log.info("Clicked on "+ i +" tipsRightArrow and object is "+tipsRightArrow.toString());
		tipsZoomIn.click();
		log.info("Clicked on "+ i +" tipsZoomIn and object is "+tipsZoomIn.toString());
		tipsZoomOut.click();
		log.info("Clicked on "+ i +" tipsZoomOut and object is "+tipsZoomOut.toString());
		}
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(2000);
			tipsLeftArrow.click();
			log.info("Clicked on "+ i +" tipsLeftArrow and object is "+tipsLeftArrow.toString());
		}
		
	}
	
	
}


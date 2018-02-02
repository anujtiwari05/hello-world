package com.bdmoms.homepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bdmoms.actions.HomePageCards;
import com.bdmoms.testbase.TestBase;

public class TC_002QuickTips extends TestBase {
	HomePageCards homePageCards;
	public static final Logger log=Logger.getLogger(TC_002QuickTips.class.getName());


	@BeforeClass
	public void setUp() {
		init();
	}
@Test
	public void quickTips() throws InterruptedException
	{
		log.info("===================Quick Tips Test Started====================");
		homePageCards=new HomePageCards(driver);
		homePageCards.quickTips();
		log.info("===================Quick Tips Test End====================");
		driver.navigate().back();
	}

	
}

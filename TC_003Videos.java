package com.bdmoms.homepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bdmoms.actions.HomePageCards;
import com.bdmoms.actions.HomePageVideos;
import com.bdmoms.testbase.TestBase;

public class TC_003Videos extends TestBase {
	public static final Logger log=Logger.getLogger(TC_003Videos.class.getName());

	HomePageVideos homePageVideos;
	@BeforeClass
	public void setUp()
	{
		init();
	}
	

	@Test
	public void videos() throws InterruptedException
	{
		log.info("=====================Videos Test Started==================");
		homePageVideos=new HomePageVideos(driver);
		homePageVideos.videos();
		log.info("=====================Videos Test End==================");
		driver.navigate().back();
	

	}
	
}

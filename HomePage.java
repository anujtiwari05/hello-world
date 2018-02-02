package com.bdmoms.actions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.bdmoms.testbase.TestBase;

public class HomePage extends TestBase{
	public static final Logger log=Logger.getLogger(HomePage.class.getName());
	
	@FindBy(xpath="//*[@id='app']/div/div/header/div[1]/section[3]/a[1]")
	WebElement ask;
	@FindBy(xpath="//*[@id='app']/div/div/main/div/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div/a/h3")
	WebElement askLifestage;
	@FindBy(xpath="//*[@id='app']/div/div/main/div/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div/a")
	WebElement asklike;
	@FindBy(xpath="//*[@id='app']/div/div/main/div/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div")
	WebElement askAnswer;
	@FindBy(xpath="//*[@id='app']/div/div/main/div/div[1]/div[3]/form/div[1]/div/div/div/div[2]/div/textarea")
	WebElement askWriteAns;
	@FindBy(xpath="//*[@id='app']/div/div/main/div/div[1]/div[3]/form/div[2]/div/div/div[2]/button")
	WebElement askPost;
	@FindBy(xpath="//*[@id='app']/div/div/div/div/div/div[1]/section[2]/a")
	WebElement askfbLogin;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void questionsAnswers() throws InterruptedException
{

	ask.click();
	log.info("Clicked on askMoms and object is "+ask.toString());
	/*askLifestage.click();
	log.info("Clicked on askLifestages and object is "+askLifestage.toString());
	driver.navigate().back();
	if(asklike.isDisplayed())
		asklike.click();*/
	askAnswer.click();
	log.info("Clicked on askLifestages and object is "+askAnswer.toString());
	driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
	askWriteAns.sendKeys("Thanks babydestination");
	log.info("Clicked on askLifestages and object is "+askWriteAns.toString());
	if(askPost.isEnabled())
		askPost.click();
	log.info("Clicked on askLifestages and object is "+askAnswer.toString());
	askfbLogin.click();
	
	log.info("Clicked on askLifestages and object is "+asklike.toString());
}
}

package com.bdmoms.actions;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdmoms.testbase.TestBase;

import javafx.util.converter.PercentageStringConverter;

public class HomePagePregnancy extends TestBase {

	public static final Logger log=Logger.getLogger(HomePagePregnancy.class.getName());
	
	@FindBy(xpath="//*[@id=\"basic-tab-bar\"]/a[3]")
	WebElement pregMenu;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div[1]/div[2]/div/div/div/button")
	WebElement pregLoadMore1;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div/div[1]/div[1]/div[10]/div/a/div")
	WebElement pregRandomBlog;
	@FindBy(xpath="//*[@id=\"read_more\"]")
    WebElement pregLoadMore2;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div[6]/div/div[1]/div/a/div")
	WebElement pregFbShare;
	@FindBy(name="xhpc_message_text")
	WebElement pregFbTextInput;
	@FindBy(xpath="//*[@id=\"u_0_1v\"]")
	WebElement pregFbPost;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div[6]/div/div[3]/div/a/div")
	WebElement pregNextArrow;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/main/div/div[1]/div[2]/div/div[1]/div/section[2]/form/input")
	WebElement pregJoinWhatsapp;
	@FindBy(xpath="//*[@id=\"mobNum\"]")
	WebElement pregEnterMob;
	
	public HomePagePregnancy(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 
	public void pregnancy() throws InterruptedException
	{
      	switchingWindow("anujtiwari05@gmail.com", "anujanuj@password");
		pregMenu.click();
		scroll("scroll(0,400)");
		pregLoadMore1.click();
		scroll("scroll(0,600)");
		pregRandomBlog.click();
		scroll("scroll(0,400)");
	//	pregLoadMore2.click();
	//	scroll("scroll(0,800)");
		pregFbShare.click();
		Set<String> s11=driver.getWindowHandles();
		Iterator<String> i11=s11.iterator();
	/*	while(i11.hasNext())
		{
			
			String child_window=i11.next();
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				
				
				Thread.sleep(5000);
				driver.switchTo().window(child_window);
				Thread.sleep(5000);
				pregFbTextInput.sendKeys("Hi this is you");
				pregFbPost.click();
				driver.switchTo().window(parent_window);
			}}
		
		driver.switchTo().window(parent_window);      */
	
		pregNextArrow.click();
		pregJoinWhatsapp.click();
		driver.switchTo().alert().accept();
		pregEnterMob.sendKeys("5555555555");
		pregJoinWhatsapp.click();



		
	}
}

//Anuj Kumar Tiwari

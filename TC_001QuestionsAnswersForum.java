package com.bdmoms.homepage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bdmoms.actions.HomePage;
import com.bdmoms.testbase.TestBase;

public class TC_001QuestionsAnswersForum extends TestBase{
	HomePage homePage;
	
	@BeforeTest
	public void setUp()
	{
		init();	
	}
	@Test
	public void askMoms() throws InterruptedException
	{
		log.info("============Starting Question and Answer forum================");
		homePage=new HomePage(driver);
     	homePage.questionsAnswers();
		log.info("============Finished Question and Answers forum================");
      
	}
	
}

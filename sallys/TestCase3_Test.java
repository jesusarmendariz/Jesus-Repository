package com.project.pom.sallys;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestCase3_Test {
	
	private WebDriver driver;
	AdoptOnePuppy adoptonePuppy;

	@Before
	public void setUp() throws Exception {
		adoptonePuppy = new AdoptOnePuppy(driver);
		driver = adoptonePuppy.chromeDriverConnection();
		adoptonePuppy.visit("http://puppies.herokuapp.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
         adoptonePuppy.puppy4info();
         Thread.sleep(2000);
         adoptonePuppy.yourlitterpageadoptanother();
         Thread.sleep(2000);
         adoptonePuppy.puppy3info();
         Thread.sleep(2000);
         adoptonePuppy.yourlitterpageadoptanother();
         Thread.sleep(2000);
         adoptonePuppy.puppy1info();
         Thread.sleep(2000);
         assertTrue(adoptonePuppy.ispuppy4LitterInfoDisplayed());
         assertTrue(adoptonePuppy.ispuppy3LitterInfoDisplayed());
         assertTrue(adoptonePuppy.ispuppy1LitterInfoDisplayed());         
	}

}

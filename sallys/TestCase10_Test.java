package com.project.pom.sallys;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestCase10_Test {

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
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
         assertTrue(adoptonePuppy.IsAdoptPuppyItemDisplayed());
         assertTrue(adoptonePuppy.IsLearnItemDisplayed());
         assertTrue(adoptonePuppy.IsAnimalShelterItemDisplayed());
         assertTrue(adoptonePuppy.IsClassifiedsItemDisplayed());
         assertTrue(adoptonePuppy.IsMsgBoardsItemDisplayed());
         assertTrue(adoptonePuppy.IsPetNewsItemDisplayed());
 
	}

}

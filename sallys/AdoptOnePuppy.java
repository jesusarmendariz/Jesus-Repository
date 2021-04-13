package com.project.pom.sallys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.project.com.Base;

public class AdoptOnePuppy extends Base {
	
	By viewdetailsBtn4Locator = By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input");
	By viewdetailsBtn3Locator = By.xpath("//*[@id=\"content\"]/div[3]/div/div[4]/form/div/input");
	By viewdetailsBtn1Locator = By.xpath("//*[@id=\"content\"]/div[4]/div/div[4]/form/div/input");

	
	By puppy4infoPageLocator = By.xpath("//*[@id=\"content\"]/div[2]/img"); //dog photo
	By adoptme4BtnLocator = By.xpath("//*[@id=\"content\"]/div[2]/div/form/div/input[1]");
	By puppy3infoPageLocator = By.xpath("//*[@id=\"content\"]/div[2]/img"); //dog photo
	By adoptme3BtnLocator = By.xpath("//*[@id=\"content\"]/div[2]/div/form/div/input[1]");
	By puppy1infoPageLocator = By.xpath("//*[@id=\"content\"]/div[2]/img"); //dog photo
	By adoptme1BtnLocator = By.xpath("//*[@id=\"content\"]/div[2]/div/form/div/input[1]");
	
	By yourlitterPageLocator = By.xpath("//*[@id=\"content\"]/div[2]/form[3]/div/input[2]"); //change your mind button
	By completeadoptionBtnLocator = By.xpath("//*[@id=\"content\"]/div[2]/form[1]/div/input");
	By adoptanotherBtnLocator = By.xpath("//*[@id=\"content\"]/div[2]/form[2]/div/input[1]");
	By changemindBtnLocator = By.xpath("//*[@id=\"content\"]/div[2]/form[3]/div/input[2]");
	By puppy4litterLocator = By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[1]/img"); //dog photo
	By puppy3litterLocator = By.xpath("//*[@id=\"content\"]/table/tbody/tr[7]/td[1]/img"); //dog photo
	By puppy1litterLocator = By.xpath("//*[@id=\"content\"]/table/tbody/tr[13]/td[1]/img"); //dog photo
	By puppy4namelitterLocator = By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]/h2");
	By puppy4breedlitterLocator = By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[3]/h2");
	By puppy4adoptamountlitterLocator = By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[4]/h2");
	
	By enterDetailsPageLocator = By.xpath("//*[@id=\"content\"]/div[2]/fieldset/legend");
	By nameLocator = By.name("order[name]");
	By addressLocator = By.id("order_address");
	By emailLocator = By.id("order_email");
	By paytypeDropdownListLocator = By.id("order_pay_type"); 
	By placeorderBtnLocator = By.xpath("//*[@id=\"new_order\"]/div[6]/input");
	
	By thankyouNoteLocator = By.id("notice");
	By caremptyNoteLocator = By.xpath("//*[@id=\"notice\"]");
	By adoptpuppyItemLocator = By.xpath("//*[@id=\"navlist\"]/li[1]/a");
	By learnItemLocator = By.xpath("//*[@id=\"navlist\"]/li[2]/a");
	By animalshelterItemLocator = By.xpath("//*[@id=\"navlist\"]/li[3]/a");
	By classifiedItemLocator = By.xpath("//*[@id=\"navlist\"]/li[4]/a");
	By msgboardItemLocator = By.xpath("//*[@id=\"navlist\"]/li[5]/a");
	By petnewsItemLocator = By.xpath("//*[@id=\"navlist\"]/li[6]/a");
	

	public AdoptOnePuppy(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void puppy4info() throws InterruptedException {
		click(viewdetailsBtn4Locator);
		Thread.sleep(2000);
		if(isDisplayed(puppy4infoPageLocator)) {
			click(adoptme4BtnLocator);
		}else {
			System.out.println("Brook info not retrieved");
		}
		
	}
	
	public void puppy3info() throws InterruptedException {
		click(viewdetailsBtn3Locator);
		Thread.sleep(2000);
		if(isDisplayed(puppy3infoPageLocator)) {
			click(adoptme3BtnLocator);
		}else {
			System.out.println("Hanna info not retrieved");
		}
		
	}
	
	public void puppy1info() throws InterruptedException {
		click(viewdetailsBtn1Locator);
		Thread.sleep(2000);
		if(isDisplayed(puppy1infoPageLocator)) {
			click(adoptme1BtnLocator);
		}else {
			System.out.println("Maggie Mae info not retrieved");
		}
	}
	public void yourlitterpageadoptanother() {
		if(isDisplayed(yourlitterPageLocator)) {
			click(adoptanotherBtnLocator);
		}else {
			System.out.println("Your Litter page not found");
		}
		
	}
	
	public void yourlitterpagechangemind() {
		if(isDisplayed(yourlitterPageLocator)) {
			click(changemindBtnLocator);
		}else {
			System.out.println("Your Litter page not found");
		}
		

		
	}
	
	public void yourlitterpagecheckout() {
		if(isDisplayed(yourlitterPageLocator)) {
			click(completeadoptionBtnLocator);
		}else {
			System.out.println("Your Litter page not found");
		}
		
	}
	
	public void enteryourdetails () {
		if(isDisplayed(enterDetailsPageLocator)) {
			type("John Doe", nameLocator);
			type("Test Address #1", addressLocator);
			type("john.doe@testmail.com", emailLocator);
		}else {
			System.out.println("Enter Details page not found");
		}
		
	}
	
	public String selectDropdownList_PayType() {
		Select selectList = new Select(findElement(paytypeDropdownListLocator));
		selectList.selectByVisibleText("Check");
		return getText(selectList.getFirstSelectedOption());
	}
	
	public void placeorder () {
		click(placeorderBtnLocator);

	}
	
	public boolean isThankyouMsgDisplayed() {
		return isDisplayed(thankyouNoteLocator);
	}
	
	public boolean isCaremptyMsgDisplayed() {
		return isDisplayed(caremptyNoteLocator);
	}
	
	public boolean IsAdoptPuppyItemDisplayed() {
		return isDisplayed(adoptpuppyItemLocator);
	}
	
	public boolean IsLearnItemDisplayed() {
		return isDisplayed(learnItemLocator);
	}
	
	public boolean IsAnimalShelterItemDisplayed() {
		return isDisplayed(animalshelterItemLocator);
	}
	
	public boolean IsClassifiedsItemDisplayed() {
		return isDisplayed(classifiedItemLocator);
	}
	
	public boolean IsMsgBoardsItemDisplayed() {
		return isDisplayed(msgboardItemLocator);
	}
	
	public boolean IsPetNewsItemDisplayed() {
		return isDisplayed(petnewsItemLocator);
	}
	
	
	public boolean ispuppy4LitterInfoDisplayed () {
		return isDisplayed(puppy4litterLocator);
	}
	
	public boolean ispuppy3LitterInfoDisplayed () {
		return isDisplayed(puppy3litterLocator);
	}
	
	public boolean ispuppy1LitterInfoDisplayed () {
		return isDisplayed(puppy1litterLocator);
	}
	
	public boolean ispuppy4NameLitterDisplayed () {
		return isDisplayed(puppy4namelitterLocator);
	
	}
	
	public boolean ispuppy4BreedLitterDisplayed () {
		return isDisplayed(puppy4breedlitterLocator);
	
	}
	
	public boolean ispuppy4adoptamountLitterDisplayed () {
		return isDisplayed(puppy4adoptamountlitterLocator);
	}
	

	
	
	
	
	
	
	
}

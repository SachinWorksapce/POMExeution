package com.spotify.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(linkText = "Featured Charts")
	WebElement fetureChart;

	@FindBy(xpath = "//a[contains(text(),'Featured Charts')]//ancestor::section[@aria-label='Featured Charts']/div//child::div[@data-encore-id='card']")
	WebElement desirdSong;
	@FindBy(xpath = "//span[text()='Add to Your Library']")
	WebElement addToLibrary;
	
}

package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AboutCityPom {

	

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.ViewGroup[1]/android.widget.ImageView")
	private WebElement MenuBtn;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android/android.view.ViewGroup[3]")
	private WebElement AboutCity;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widgetViewGroup[1]/android.widget.ImageView")
	private WebElement AboutCityBackBtn;

	public WebElement getAboutCityBackBtn() {
		return AboutCityBackBtn;
	}

	

	public WebElement getMenuBtn() {
		return MenuBtn;
	}

	public WebElement getAboutCity() {
		return AboutCity;
	}

}

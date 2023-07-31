package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
@FindBy(xpath="//div[text()='Add New']")
private WebElement AddnewBtn;

@FindBy(xpath="//div[@class='item createNewCustomer']")
private WebElement NewcustmrBtn;

@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
private WebElement entrCustmrnmefld;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement descriptnFld;


public WebElement getSelectcstmrDDbtn() {
	return selectcstmrDDbtn;
}

public WebElement getSelectcustmrTxt() {
	return selectcustmrTxt;
}

public WebElement getPrjctdscrptnTxt() {
	return prjctdscrptnTxt;
}

public WebElement getCrtprjctbtn() {
	return crtprjctbtn;
}

public WebElement getCrtdprjtTtl() {
	return crtdprjtTtl;
}

@FindBy(xpath="//div[text()='- Select Customer -' and @class]")
private WebElement selctcstmrDD;

@FindBy(xpath="//div[text()='Big Bang Company'and@class='itemRow cpItemRow ']")
private WebElement Bbcmpnybtn;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement crtcstmrbtn;

@FindBy(xpath="//div[text()='+ New Project']")
private WebElement newprjctbtn;

@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
private WebElement entrprjctFld;

@FindBy(xpath="//div[@class='leftContainer']/div/div[1]")
private WebElement crtedcstmrttle;

@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
private WebElement selectcstmrDDbtn;

@FindBy(xpath="//div[@class='searchItemList' and @style]/div[6]")
private WebElement selectcustmrTxt;

@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
private WebElement prjctdscrptnTxt;

@FindBy(xpath="//div[text()='Create Project']")
private WebElement crtprjctbtn;

@FindBy(xpath="//div[@class='leftContainer']/div[1]/div[1]")
private WebElement crtdprjtTtl;
 
public WebElement getNewprjctbtn() {
	return newprjctbtn;
}

public WebElement getEntrprjctFld() {
	return entrprjctFld;
}

public WebElement getCrtedcstmrttle() {
	return crtedcstmrttle;
}

public TaskList(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddnewBtn() {
	return AddnewBtn;
}

public WebElement getNewcustmrBtn() {
	return NewcustmrBtn;
}

public WebElement getEntrCustmrnmefld() {
	return entrCustmrnmefld;
}

public WebElement getDescriptnFld() {
	return descriptnFld;
}

public WebElement getSelctcstmrDD() {
	return selctcstmrDD;
}

public WebElement getBbcmpnybtn() {
	return Bbcmpnybtn;
}

public WebElement getCrtcstmrbtn() {
	return crtcstmrbtn;
}




}


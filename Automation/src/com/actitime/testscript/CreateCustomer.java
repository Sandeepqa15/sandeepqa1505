package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrack;
import com.actitime.POM.LoginPage;
import com.actitime.POM.TaskList;
import com.actitime.generic.BaseClassContent;
import com.actitime.generic.FileLib;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClassContent {
	@Test
	public void testcreatcustomer() throws EncryptedDocumentException, IOException, InterruptedException {
    FileLib f=new FileLib();
    String data = f.getExcelData("CreateCustomer", 1, 2);
    String data1=f.getExcelData("CreateCustomer", 1, 3);
    EnterTimeTrack e=new EnterTimeTrack(driver);
    e.setTask();
    TaskList t=new TaskList(driver);
    t.getAddnewBtn().click();
    t.getNewcustmrBtn().click();
    t.getEntrCustmrnmefld().sendKeys(data);
    t.getDescriptnFld().sendKeys(data1);
    t.getSelctcstmrDD().click();
    t.getBbcmpnybtn().click();
    t.getCrtcstmrbtn().click();
    Thread.sleep(3000);
    String created = t.getCrtedcstmrttle().getText();
    String actualrslt= data;
    Assert.assertEquals(actualrslt, created);
	}

}

package com.actitime.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrack;
import com.actitime.POM.TaskList;
import com.actitime.generic.BaseClassContent;
import com.actitime.generic.FileLib;

public class CreateProject extends BaseClassContent {

	@Test
	public void createProject() throws IOException {
		FileLib f=new FileLib();
		String data = f.getExcelData("CreateProject", 1, 1);
		String data1=f.getExcelData("CreateProject", 1, 2);
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setTask();
		TaskList t=new TaskList(driver);
		t.getAddnewBtn().click();
		t.getNewprjctbtn().click();
		t.getEntrprjctFld().sendKeys(data);
		t.getSelectcstmrDDbtn().click();
        t.getSelectcustmrTxt().click();
		t.getPrjctdscrptnTxt().sendKeys(data1);
		t.getCrtprjctbtn().click();
		
		
		
		
	}
}

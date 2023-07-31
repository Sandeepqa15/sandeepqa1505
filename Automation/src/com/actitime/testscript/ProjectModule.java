package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority = 1,invocationCount = 1)
	public void createflipCustomer() {
		Reporter.log("createflipCustomer", true);
	}
	@Test(priority = 2,dependsOnMethods = "createflipCustomer")
	public void modifyflipCustomer() {
		Reporter.log("modifyflipCustomer", true);
	}
	@Test(priority = 3,dependsOnMethods = {"createflipCustomer","modifyflipCustomer"})
	public void deleteflipCustomer() {
		Reporter.log("deleteflipCustomer", true);
	}
	@Test(priority =4 ,dependsOnMethods = "createflipCustomer")
	public void buyaproduct() {
		Reporter.log("buyaproduct", true);
	}
}

package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClassContent;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class DemoCustomer extends BaseClassContent {
@Test(groups = {"smokeTest","regressionTest"})
public void createcustomer() {
	Reporter.log("createcustomer",true);
}
@Test(groups = "smokeTest")
public void deletecustomer() {
	Reporter.log("delete customer",true);
}
}

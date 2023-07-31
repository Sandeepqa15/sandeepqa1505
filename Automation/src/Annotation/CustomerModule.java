package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser",true);
	}
    @AfterClass
    public void closeBrowser() {
    	Reporter.log("close browser",true);
    }
    @BeforeMethod
    public void login() {
    	Reporter.log("login",true);
    }
    @Test(priority=1,invocationCount = 2)
    public void editCustomer() {
    	Reporter.log("edit",true);
    }
    @Test
    public void registercustomer() {
    	Reporter.log("register",true);
    }
    @Test
    public void deletecustomer() {
    	Reporter.log("deleteC",true);
    }
}

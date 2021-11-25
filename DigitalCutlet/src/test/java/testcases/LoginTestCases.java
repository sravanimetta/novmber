package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginTestCases extends TestBase {
	@Test
	public void logintestcase1() {
		loginobj.setUsername("Admin");
		//loginobj.setPassword(" ");
		loginobj.getLoginbutton().click();
		String empty = loginobj.getUsernamecannotbeempty().getText();
		Assert.assertEquals(empty, "Username cannot be empty");
		
		
	}

}

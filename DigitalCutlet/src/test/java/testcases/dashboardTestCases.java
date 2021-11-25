package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class dashboardTestCases extends TestBase {
	@Test
	public void dashboardtestcase1() {
		dashboardobj.getApplyleave().click();
		dashboardobj.getAssignleave().click();
		dashboardobj.getLeavelist().click();
		dashboardobj.getTimesheet().click();
		dashboardobj.getMyleave().click();
		dashboardobj.getMytimesheet().click();
	}
	

}

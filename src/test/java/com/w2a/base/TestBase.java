package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.utilities.ExtentManager;

public class TestBase {
	public  ExtentReports rep=ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	public static void select() {
		test.log(LogStatus.INFO, "Selecting from dropdown at " );
		
	}

}

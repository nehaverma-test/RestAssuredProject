package crudoperations.com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AllureReportExample {
	
	
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify assert statement")
	@Test
	public void function1()
	{
		Assert.assertEquals(true, true);
	}

}

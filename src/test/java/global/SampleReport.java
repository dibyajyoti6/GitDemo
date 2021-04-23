package global;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleReport {
	ExtentReports extent;
	@BeforeTest
	public void config(){
		ExtentSparkReporter reporter=new ExtentSparkReporter
				(System.getProperty("user.dir")+"/Reports/index.html");
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Dibyajyoti Das");
	}

	@Test
	public void demo(){
		ExtentTest test= extent.createTest("Initial Demo");
		 System.out.println("passed");
		 test.addScreenCaptureFromBase64String("");
		 test.fail("Result do not match");
		 extent.flush();
	}

}

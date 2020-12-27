package util;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ExtentReports extends BaseUtil
{
    String fileName=reportLocation+"extentreport.html";

    public void ExtentReport(){
        extent=new com.aventstack.extentreports.ExtentReports();
        ExtentHtmlReporter extentReporter=new ExtentHtmlReporter(fileName) ;
        extentReporter.config().setTheme(Theme.DARK);
        extentReporter.config().setDocumentTitle("Test Report For Plaid");
        extentReporter.config().setEncoding("utf-8");
        extentReporter.config().setReportName("Test Report");

        extent.attachReporter(extentReporter);

    }

    public void ExtentReportScreenShot() throws IOException {
        File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // Files.copy(scr.toPath(),new File(reportLocation+"screenshot.png").toPath());
    }
}

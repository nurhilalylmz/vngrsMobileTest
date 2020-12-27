package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseUtil
{
    public AndroidDriver<MobileElement> driver;
    public ExtentReports extent;

    public static ExtentTest scenarioDef;
    public static ExtentTest features;
    public static String reportLocation= "src\\test\\java\\util";
}

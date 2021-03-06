

	//package com.sikuli.demo;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.sikuli.script.FindFailed;
	import org.sikuli.script.Pattern;
	import org.sikuli.script.Screen;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

	public class CalcSample {

	    public static void main(String[] args) throws FindFailed {

	    	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\John\\Selenium\\LatestChromeDriver_83\\chromedriver\\chromedriver.exe");
	        String filepath = "D:\\Guru99Demo\\";
	        String inputFilePath = "D:\\Guru99Demo\\";
	        Screen s = new Screen();
	        Pattern fileInputTextBox = new Pattern(filepath + "FileName.PNG");
	        Pattern openButton = new Pattern(filepath + "Open.PNG");
	        WebDriver driver;

	        // Open Chrome browser    
	        driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/image_upload/index.php");

	        // Click on Browse button and handle windows pop up using Sikuli
	        driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
	        s.wait(fileInputTextBox, 20);
	        s.type(fileInputTextBox, inputFilePath + "Test.docx");
	        s.click(openButton);

	        // Close the browser
	        driver.close();

	    }

	
	
}


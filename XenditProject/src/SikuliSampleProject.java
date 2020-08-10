import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.jbig2.TestImage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
//import com.sarxos.ocr.sikulix.util.ImageFrame;
public class SikuliSampleProject {

	public static String createImage(String filePath) throws TesseractException
	{
	File imgFile=new File(filePath);
	ITesseract instace=new Tesseract();
	instace.setDatapath("C:\\Users\\John\\eclipse-workspace\\XenditProject\\tessdata\\");
	String result=instace.doOCR(imgFile);
	return result;
	}
	public static void main(String[] args) throws ClassNotFoundException, FindFailed,TesseractException  {
		// TODO Auto-generated method stub
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\John\\Selenium\\LatestChromeDriver_83\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https:\\www.online-calculator.com\\full-screen-calculator\\");
	
		Screen screen=new Screen();
		//ScreenImage scrImgFile = screen.userCapture();
	    	
		//Pattern pattern=new Pattern("C:\\Users\\John\\eclipse-workspace\\XenditProject\\ImageLib\\GoogleSearch.PNG");
		Pattern pattern = null;
		pattern=new Pattern("D:\\Selenium\\CalcImage\\One.PNG");
		
		screen.wait(pattern,2000);
		
		screen.click(pattern);
		
		Pattern plus=new Pattern("D:\\Selenium\\CalcImage\\Plus.PNG");
		screen.click(plus);
		
		Pattern six=new Pattern("D:\\Selenium\\CalcImage\\Six.PNG");
		screen.click(six);
		
		Pattern equal=new Pattern("D:\\Selenium\\CalcImage\\Equal.PNG");
		screen.click(equal);
			
		String textData=SikuliSampleProject.createImage("C:\\Users\\John\\eclipse-workspace\\XenditProject\\ImageLib\\CalcImage\\Answer2.PNG");
		
		System.out.println("Addition Result: 1 + 6 = " + textData);

		pattern=new Pattern("D:\\Selenium\\CalcImage\\Five.PNG");
		screen.wait(pattern,2000);
		screen.click(pattern);
		Pattern minus=new Pattern("D:\\Selenium\\CalcImage\\Minus.PNG");
		screen.click(minus);
		Pattern four=new Pattern("D:\\Selenium\\CalcImage\\Four.PNG");
		screen.click(four);
		Pattern equal1=new Pattern("D:\\Selenium\\CalcImage\\Equal.PNG");
		screen.click(equal1);
		String textData1=SikuliSampleProject.createImage("C:\\Users\\John\\eclipse-workspace\\XenditProject\\ImageLib\\CalcImage\\Answer2.PNG");
		System.out.println("Subtraction Result: 5 - 4 = " + textData1);


		pattern=new Pattern("D:\\Selenium\\CalcImage\\Three.PNG");
		screen.wait(pattern,2000);
		screen.click(pattern);
		Pattern multiply=new Pattern("D:\\Selenium\\CalcImage\\Multiply.PNG");
		screen.click(multiply);
		Pattern Three=new Pattern("D:\\Selenium\\CalcImage\\Five.PNG");
		screen.click(Three);
		Pattern equal2=new Pattern("D:\\Selenium\\CalcImage\\Equal.PNG");
		screen.click(equal2);
		String textData2=SikuliSampleProject.createImage("C:\\Users\\John\\eclipse-workspace\\XenditProject\\ImageLib\\CalcImage\\Answer2.PNG");
		System.out.println("Multiplication Result: 3 * 5 = " + textData2);


		pattern=new Pattern("D:\\Selenium\\CalcImage\\Eight.PNG");
		screen.wait(pattern,2000);
		screen.click(pattern);
		Pattern division=new Pattern("D:\\Selenium\\CalcImage\\Division.PNG");
		screen.click(division);
		Pattern Two=new Pattern("D:\\Selenium\\CalcImage\\Two.PNG");
		screen.click(Two);
		Pattern equal3=new Pattern("D:\\Selenium\\CalcImage\\Equal.PNG");
		screen.click(equal3);
		String textData3=SikuliSampleProject.createImage("C:\\Users\\John\\eclipse-workspace\\XenditProject\\ImageLib\\CalcImage\\Answer2.PNG");
		System.out.println("Division Result: 8 / 2 = " + textData3);

		
		System.out.println("Automate Calculator_SikuliSampleProject completed)");
		
	}

}

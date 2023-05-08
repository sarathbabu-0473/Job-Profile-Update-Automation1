package advance;

import java.io.File;
import java.time.Duration;
import java.util.Scanner;

import org.apache.pdfbox.contentstream.operator.state.Save;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;
import zmq.util.Draft;

public class Naukri1 {
	
	WebDriver d;
	
	@FindBy(xpath ="//a[.='Login']")
	private WebElement Login_first; 
	@FindBy(xpath ="//button[.='Use OTP to Login']")
	private WebElement OTP_Login;


	@FindBy(xpath ="//input[@placeholder='Enter your 10 digit mobile number']")
	private WebElement Mobile_Num;

	@FindBy(xpath ="//button[.='Get OTP']")
	private WebElement Otp_Send;

	@FindBy(xpath ="//input[@placeholder='Enter OTP sent on your mobile number']")
	private WebElement OTP;


	@FindBy(xpath ="//button[.='Login']")
	private WebElement Login_Button;


	@FindBy(xpath ="(//a[@href='/mnjuser/profile'])[1]")
	private WebElement View_Profile;

	@FindBy(xpath ="//div[@class='crossIcon chatBot chatBot-ic-cross']")
	private WebElement Ai;

	@FindBy(xpath ="(//input[@class='fileUpload waves-effect waves-light btn-large'])[1]")
	private WebElement Update_Resume;

	@FindBy(xpath ="(//span[.='Edit']/../span[@class='edit icon'])[1]")
	private WebElement Resume_Headline;


	@FindBy(xpath ="//button[.='Save']")
	private WebElement Save;

	@FindBy(xpath ="(//span[.='Edit']/../span[@class='edit icon'])[2]")
	private WebElement Key_Skill;


	@FindBy(xpath ="(//span[.='Edit']/../span[@class='edit icon'])[3]")
	private WebElement Edit_Employment;

	@FindBy(xpath ="(//span[.='Edit']/../span[@class='col s2 icon edit'])[1]")
	private WebElement Degree;


	@FindBy(xpath ="(//span[.='Edit']/../span[@class='col s2 icon edit'])[2]")
	private WebElement HSC;


	@FindBy(xpath ="(//span[.='Edit']/../span[@class='col s2 icon edit'])[3]")
	private WebElement SSLC;


	@FindBy(xpath ="(//span[.='Edit']/../span[@class='col s1 icon edit right-align'])[1]")
	private WebElement MAnual_Testing;

	@FindBy(xpath ="(//span[.='Edit']/../span[@class='col s1 icon edit right-align'])[2]")
	private WebElement SQL;

	@FindBy(xpath ="(//span[.='Edit']/../span[@class='col s1 icon edit right-align'])[3]")
	private WebElement Selenium ;

	@FindBy(xpath ="(//span[.='Edit']/../span[@class='col s1 icon edit right-align'])[4]")
	private WebElement Core_Java;



	@FindBy(xpath ="(//span[.='Edit']/../..//span[@class='edit icon'])[4]")
	private WebElement Profile_Summary;

	@FindBy(xpath ="//div[@class='nI-gNb-drawer__bars']")
	private WebElement Logout_option;

	@FindBy(xpath ="//a[@title='Logout']")
	private WebElement Logout;

	

	// 5 time completed 20/apr/2023
	public void b() throws InterruptedException {

		Login_first.click();
		OTP_Login.click();
		Scanner s = new Scanner(System.in);
		Reporter.log("Enter The Mobile Number ",true);
		String mob = s.nextLine();
		Mobile_Num.sendKeys(mob);
		Otp_Send.click();

		Reporter.log("Enter OTP",true);
		String otp = s.nextLine();
		OTP.sendKeys(otp);
		Login_Button.click();
	

		View_Profile.click();
		//Ai.click();

		File f = new File("./data/Sarath_Babu_Ress_QA.pdf");
		String recivepath =	f.getAbsolutePath();
		Thread.sleep(6000);
		Update_Resume.sendKeys(recivepath);

		//	j.executeScript("window.scrollTo(0,450)");
		Thread.sleep(5000);
		Resume_Headline.click();
		Save.click();
		Reporter.log("Resume_Headline Update successfully----",true);
		
		Thread.sleep(3000);
		Key_Skill.click();
		Thread.sleep(3000);
		Save.click();
		Reporter.log("Key_Skill Update Successfully----",true);
		
		Thread.sleep(3000);
		Edit_Employment.click();
		Save.click();
		Reporter.log("Edit_Employment Update Successfully----",true);
		Thread.sleep(3000);
	
		Degree.click();
		Save.click();
		Reporter.log("Degree Update Successfully----",true);
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		HSC.click();
		Save.click();
		Reporter.log("HSC Update Successfully----",true);

		Thread.sleep(3000);
		SSLC.click();
		Save.click();
		Reporter.log("SSLC Update Successfully----",true);

		Thread.sleep(3000);
		MAnual_Testing.click();
		Save.click();
		Reporter.log("Manual_Testing Update Successfully----",true);
		
		Thread.sleep(3000);
		SQL.click();
		Save.click();
		Reporter.log("SQL Update Successfully----",true);
		
		Thread.sleep(3000);
		Selenium.click();
		Save.click();
		Reporter.log("Selenium Update Successfully----",true);

		Thread.sleep(3000);
		Core_Java.click();
		Save.click();
		Reporter.log("Core_Java Update Successfully----",true);
		
		Thread.sleep(3000);
		Profile_Summary.click();
		Save.click();
		Reporter.log("Profile_Summary  Update Successfully----",true);
		
		Logout_option.click();
		Thread.sleep(3000);
		
		Logout.click();
		Reporter.log("Logout  Update Successfully----",true);
		

	}
	
	@Test
	public void Update_Profile() throws InterruptedException {
		d = new EdgeDriver();
		d.get("https://naukri.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Naukri1 n = new Naukri1();
		PageFactory.initElements(d, n);
		n.b();






		/*
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,300);");

		d.findElement(By.xpath("//a[.='Login']")).click();
		d.findElement(By.xpath("//i[@class='naukicon cross ni-gnb-icn ni-gnb-icn-cross-drawer']")).click();

		j.executeScript("window.scrollBy(0,300);");

		d.findElement(By.xpath("//a[.='Login']")).click();
		d.findElement(By.xpath("//i[@class='naukicon cross ni-gnb-icn ni-gnb-icn-cross-drawer']")).click();

		j.executeScript("window.scrollBy(0,300);");

		d.findElement(By.xpath("//a[.='Login']")).click();
		d.findElement(By.xpath("//i[@class='naukicon cross ni-gnb-icn ni-gnb-icn-cross-drawer']")).click();
		j.executeScript("window.scrollBy(0,300);");

		d.findElement(By.xpath("//a[.='Login']")).click();
		d.findElement(By.xpath("//i[@class='naukicon cross ni-gnb-icn ni-gnb-icn-cross-drawer']")).click();



		//		j.executeScript("window.scrollBy(300,500);");

		//		
		 */



		/*
		 * JavascriptExecutor	j = (JavascriptExecutor)d;

		j.executeScript("window.scrollTo(0,500)");
		Thread.sleep(5000);
		j.executeScript("window.scrollTo(450,500)");
		Thread.sleep(5000);
		j.executeScript("window.scrollTo(500,550)");
		Thread.sleep(5000);
		j.executeScript("window.scrollTo(550,600)");
		Thread.sleep(5000);
		j.executeScript("window.scrollTo(600,700)");

		 */
		
		/*







		
		FindBy(xpath ="")
		private WebElement s;


			 */


	}





}

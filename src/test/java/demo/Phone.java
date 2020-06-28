package demo;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Testdata.Exceloperations;
import junitannotations.Camera;


public class Phone {

	static WebDriver driver;
	//public static void main(String[] args) throws Exception {
		 
		// TODO Auto-generated method stub
		//Phone obj = new Phone();
		//Camera lgn = new Camera();
		//obj.login();
		//obj.purchase();
		//lgn.login();
		//lgn.purchase();
		//obj.login();			

	//}
		
		@BeforeMethod
		
	public void login() throws Exception
	{
		 String Url = Exceloperations.getCellData(0,0);
		 String Username = Exceloperations.getCellData(0,1);
		 String Pwd =  Exceloperations.getCellData(0,2);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 System.out.println(Username);
		 System.out.println(Pwd);
		// TODO Auto-gener
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//*[@class = 'caret']")).click();
		driver.findElement(By.xpath("//*[text() = 'Login']")).click();
		driver.findElement(By.xpath("//*[@id = 'input-email']")).click();
		WebElement Uname = driver.findElement(By.xpath("//*[@id = 'input-email']"));
		Uname.sendKeys(Username);
		driver.findElement(By.xpath("//*[@id = 'input-password']")).click();
		WebElement Password = driver.findElement(By.xpath("//*[@id = 'input-password']"));
		Password.sendKeys(Pwd);
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
		
	}

@AfterMethod
public void exit() {
	
	driver.quit();
}
}


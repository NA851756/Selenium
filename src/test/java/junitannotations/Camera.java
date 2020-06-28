package junitannotations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Testdata.Exceloperations;

public class Camera {
	static WebDriver driver;
	public static void login() throws Exception
	{
	
		driver = new ChromeDriver();
		 String ApplicationUrl = Exceloperations.getCellData(0,0);
		 String Username = Exceloperations.getCellData(0,1);
		 String Pwd =  Exceloperations.getCellData(0,2);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 driver.get(ApplicationUrl);
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

	
	public void purchase()
	 {
		 driver.findElement(By.xpath("//*[@class = 'caret']")).click();
		 driver.findElement(By.xpath("//*[@id ='top-links']/ul[1]/li[2]/ul[1]/li[5]")).click();
		 WebElement Searchbox = driver.findElement(By.xpath("//*[@class = 'form-control input-lg']"));
			Searchbox.sendKeys("Canon");
			Searchbox.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//a[contains(text(), 'Canon')]")).click();
			driver.findElement(By.xpath("//*[@name = 'quantity']")).click();
			WebElement Qty = driver.findElement(By.xpath("//*[@name = 'quantity']"));
			Qty.clear();
			Qty.sendKeys("2");
			Qty.sendKeys(Keys.ENTER);
			
	 }
}

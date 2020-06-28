package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Testdata.Exceloperations;

public class Camerapurchase extends Phone {
	
    @Test(priority =1)
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

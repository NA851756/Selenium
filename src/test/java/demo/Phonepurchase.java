package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Phonepurchase extends Phone {

	@Test(priority =0)
	 public void purchase() throws InterruptedException
	 {
		driver.findElement(By.xpath("//*[@class = 'caret']")).click();
		driver.findElement(By.xpath("//*[@id ='top-links']/ul[1]/li[2]/ul[1]/li[5]")).click();
		
		WebElement Searchbox = driver.findElement(By.xpath("//*[@class = 'form-control input-lg']"));
		Searchbox.sendKeys("Desktops");
		Searchbox.sendKeys(Keys.ENTER);
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@name = 'category_id']")));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath("//*[@name = 'sub_category']")).click();
		driver.findElement(By.xpath("//*[@id = 'button-search']")).click();
		driver.findElement(By.xpath("//*[text() = 'Phones & PDAs']")).click();
		Select Sortby = new Select(driver.findElement(By.xpath("//*[@id= 'input-sort']")));
		Sortby.selectByIndex(4);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		List<WebElement>lis = driver.findElements(By.xpath("//div//following-sibling::button[3]"));
		int buttons = lis.size();
		for(int i =0; i<buttons;i++)
		{
			lis.get(i).click();
		}
		Thread.sleep(5000);
					

		driver.findElement(By.xpath("//*[contains(text(),'Product Compare')]")).click();
		driver.findElement(By.xpath("//table/tbody/tr/td[3]//a[contains(text(),'')]")).click();
		driver.findElement(By.xpath("//*[@id = 'button-cart']")).click();
				

		  boolean Error = driver.getPageSource().contains("Success: You have added");
		    if (Error == true)
		    {
		     System.out.print("Phone added Succesfully");
		    }
		    else
		    {
		     System.out.print("Phone not added ");
		    }
		
		driver.findElement(By.xpath("//*[@id = 'cart-total']")).click();
		
		driver.findElement(By.xpath("//*[text() = 'Checkout']")).click();
		
		

	}
	
	
}

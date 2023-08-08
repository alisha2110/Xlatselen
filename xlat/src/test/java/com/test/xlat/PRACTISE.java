package com.test.xlat;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PRACTISE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println("Title of the page is  "+driver.getTitle());
		driver.navigate().refresh();
       driver.findElement(By.id("APjFqb")).sendKeys("narendra modi");
       driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
       Thread.sleep(5000);
       List<WebElement> linklist = driver.findElements(By.tagName("a"));
       int s= linklist.size();
       System.out.println("size of the link is "+s);
      
       for(int i=0;i<s;i++) {
    	   String linkName =linklist.get(i).getText();
    	   System.out.println("Names of the link is "+linkName);
       
       }
       
      // driver.findElement(By.linkText("Images")).click();
       
       
	}

}

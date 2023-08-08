package com.test.milet;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class timlet {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();      //to maximise browser
		driver.get("https://www.google.co.in/"); //to open any url
		String title= driver.getTitle();
		System.out.println("Title of the page is    "+title);
		//driver.navigate().back();
		//driver.navigate().forward();
	//	driver.navigate().refresh();
		//driver.navigate().to("https://demoqa.com/alerts");
		//driver.close();//to close current url open in ur window
	//	driver.quit();
	
		//ALERT HANDLING
		
				
		//  driver.get("https://demoqa.com/alerts");
		 // driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		 // driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		//LOCATORS
		//driver.findElement(By.id("APjFqb")).sendKeys("java");
		//driver.findElement(By.name("q")).sendKeys("java");
		//driver.findElement(By.className("gLFyf")).sendKeys("narendra modi");
		//driver.findElement(By.id("APjFqb")).sendKeys("java");
		//driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);//IF u want click enter automatically(execute two code simultaneously)
		//System.out.println("Title of the page is "+driver.getTitle());
		//driver.findElement(By.linkText("Images")).click();
		//System.out.println("url of the image is "+driver.getTitle());
	//	driver.findElement(By.linkText("Gmail")).click();
		//System.out.println("url of the images is "+ driver.getCurrentUrl());
		//driver.findElement(By.linkText("Ima")).click();
		//System.out.println("url of the Ima is"+driver.getCurrentUrl());
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		int s=linklist.size();
		System.out.println("no of links available is"+s);
		for(int i=0;i<s;i++) {
			String linkName=linklist.get(i).getText();
			System.out.println(linkName);
			
		}
		
		
		/*WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("firstName")).sendKeys("ALISHA");
		driver.findElement(By.name("lastName")).sendKeys("Jaiswal");
		WebElement countrycode=driver.findElement(By.name("country"));
		Select s= new Select(countrycode);
		//s.selectByVisibleText("INDIA");
		s.selectByValue("ARGENTINA");*/
		

		
	
		
		
		

	}

}

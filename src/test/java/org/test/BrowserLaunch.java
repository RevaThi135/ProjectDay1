package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	
	public static void main(String[] args)throws AWTException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Robot r = new Robot();
		Actions a = new Actions(driver);
		r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyPress(KeyEvent.VK_ESCAPE);
        
		
	  WebElement pdsearch = driver.findElement(By.name("q"));
	 pdsearch.sendKeys("iphone");
	 
	 
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	  	
		
		List<WebElement>  pdlist = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (int i = 0; i <pdlist.size(); i++) {
		WebElement pd = pdlist.get(i);
		String p= pd.getText();
		System.out.println(p);
			
		}
		
		List<WebElement> pdprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int i = 0; i < pdprice.size(); i++) {
			WebElement pp = pdprice.get(i);
			String pr = pp.getText();
			System.out.println(pr);
		
			if (pr.contains("₹")) {
				pr=pr.replace("₹","");
				System.out.println(pr);
				
			}
			
			if(pr.contains(",")) {
				pr=pr.replace(",", "");
				
				System.out.println(pr);
			
			
		
			}
		int ii = Integer.parseInt(pr);
		System.out.println(ii);
		
			
		}
		
		List<String> product = new LinkedList<String>();
		product.add("APPLE iPhone 13 (Green, 128 GB)");
		product.add("APPLE iPhone 11 (Black, 64 GB)");
		product.add("APPLE iPhone 11 (White, 64 GB)");
		product.add("APPLE iPhone 13 (Blue, 128 GB)");
		product.add("APPLE iPhone 12 mini (Black, 64 GB)");
		product.add("APPLE iPhone 11 (Green, 64 GB)");
		product.add("APPLE iPhone 13 ((PRODUCT)RED, 128 GB)");
		product.add("APPLE iPhone 14 (Midnight, 256 GB)");
		product.add("APPLE iPhone 11 (Black, 128 GB)");
		product.add("APPLE iPhone 11 (White, 128 GB)");
		product.add("APPLE iPhone 12 mini (White, 64 GB)");
		product.add("APPLE iPhone 11 (Red, 128 GB)");
		product.add("APPLE iPhone 11 (Purple, 64 GB)");
		product.add("APPLE iPhone 12 mini (Black, 128 GB)");
		product.add("APPLE iPhone 14 (Starlight, 128 GB)");
		product.add("APPLE iPhone 11 (Red, 64 GB)");
		product.add("APPLE iPhone 12 mini (Blue, 64 GB)");
		product.add("APPLE iPhone 13 (Starlight, 128 GB)");
		product.add("APPLE iPhone 11 (Purple, 128 GB)");
		product.add("APPLE iPhone 14 (Purple, 256 GB)");
		product.add("APPLE iPhone 12 mini (White, 128 GB)");
		product.add("APPLE iPhone 14 (Midnight, 128 GB)");
		product.add("APPLE iPhone 13 (Green, 256 GB)");
		
		List<Integer> price = new LinkedList<Integer>();
		price.add(61999);
		price.add(38999);
		price.add(61999);
		price.add(38999);
		price.add(62999);
		price.add(37999);
		price.add(39999);
		price.add(61999);
		price.add(87490);
		price.add(45999);
		price.add(46999);
		price.add(37999);
		price.add(43999);
		price.add(39999);
		price.add(42999);
		price.add(77490);
		price.add(37999);
		price.add(37999);
		price.add(62999);
		price.add(45999);
		price.add(87490);
		price.add(42999);
		price.add(77490);
		price.add(69999);
		
		Collections.sort(price);
		System.out.println(price);
		
		Collections.sort(price,Collections.reverseOrder());
		System.out.println(price);
		
		System.out.println(Collections.max(price));
		System.out.println(Collections.min(price));
		
		for (int i = 0; i <price.size(); i++) {
			System.out.println(product.get(i)+"---"+price.get(i));
		}
	}
}
		
		
		
		
		
		
		
		
		
		


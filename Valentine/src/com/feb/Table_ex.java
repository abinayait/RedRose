package com.feb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Table_ex {

	WebDriver driver;
	Map<WebElement, Double> all_date=new HashMap<>();
	
	
	
	public void openWindow() {
	   driver=new ChromeDriver();
		driver.get("https://www.livechennai.com/gold_silverrate.asp");
		driver.manage().window().maximize();
	}

	public String tablegold(String gdate) throws InterruptedException {
		
		
		//Actions a = new Actions(driver);
		//a.sendKeys(Keys.PAGE_DOWN).build().perform();
		//div[@id='gold-tit']/following-sibling::*/tbody/tr/td/*[contains(text(),'25')]
		
		try {
		String day="//div[@id='gold-tit']/following-sibling::*/tbody/tr/td[1]/*[starts-with(normalize-space(),'"+ gdate +"')]/ancestor::tr/td[2]";
		WebElement price=driver.findElement(By.xpath(day));
		System.out.println(gdate +"-" + price.getText());
		return price.getText();
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println(gdate +"-" +" no price available");
			return "";
		}
	//	WebElement day25=driver.findElement(By.xpath("//div[@id='gold-tit']/following-sibling::*/tbody/tr[6]/td[1]"));
	//	System.out.println("..");
	//	WebElement day19=driver.findElement(By.xpath("//div[@id='gold-tit']/following-sibling::*/tbody/tr[12]/td[1]"));
	//	System.out.println("..");
	/*	//scroll up a page
		a.sendKeys(Keys.PAGE_UP).build().perform();
		
		
				JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebElement table=driver.findElement(By.xpath("https://www.livechennai.com/gold_silverrate.asp"));
		js.executeScript("arguments[0].scrollIntoView()", table);
	/9+*/
	}
	//	pu
		
	
	public List<WebElement> tablesilver() {
		List<WebElement>date=driver.findElements(By.xpath("//tbody/tr[1]/td[2][contains(text(),\"Silver\")]/ancestor::tbody[1]//td[1]"+""));
		
		return date; 
	}
	public String tablesilverValue() {
		String str=driver.findElement(By.xpath("//tbody/tr[1]/td[2][contains(text(),\"Silver\")]/ancestor::tbody[1]//td[3]")).getText();
		
		return str; 
	}
		public void textbox() {
	WebElement workfromhome=driver.findElement(By.xpath("//a[@href='https://www.livechennai.com/work_from_home_genuine.asp']"));
	workfromhome.click();
		}
		
		
		
//	Thread.sleep(2000);
/*	Actions a = new Actions(driver);
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
	WebElement name=driver.findElement(By.xpath("(//div[.='Your answer']//preceding-sibling::input[@type='text'])[1]"));
	
	name.sendKeys("abi");
	
*/	
	
	
	
	
	
}

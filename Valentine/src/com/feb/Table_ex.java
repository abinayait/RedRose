package com.feb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Table_ex {

	WebDriver driver;
	public void openWindow() {
	   driver=new ChromeDriver();
		driver.get("https://www.livechennai.com/gold_silverrate.asp");
		driver.manage().window().maximize();
	}

	public void table(String gdate) throws InterruptedException {
		
		
		//Actions a = new Actions(driver);
		//a.sendKeys(Keys.PAGE_DOWN).build().perform();
		//div[@id='gold-tit']/following-sibling::*/tbody/tr/td/*[contains(text(),'25')]
		String day="//div[@id='gold-tit']/following-sibling::*/tbody/tr/td/*[contains(text(),'"+ gdate +"')]/ancestor::tr/td[2]";
		WebElement price=driver.findElement(By.xpath(day));
		System.out.println(gdate+ price.getText());
	//	WebElement day25=driver.findElement(By.xpath("//div[@id='gold-tit']/following-sibling::*/tbody/tr[6]/td[1]"));
	//	System.out.println("..");
	//	WebElement day19=driver.findElement(By.xpath("//div[@id='gold-tit']/following-sibling::*/tbody/tr[12]/td[1]"));
	//	System.out.println("..");
	/*	//scroll up a page
		a.sendKeys(Keys.PAGE_UP).build().perform();
		
		
				JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebElement table=driver.findElement(By.xpath("https://www.livechennai.com/gold_silverrate.asp"));
		js.executeScript("arguments[0].scrollIntoView()", table);
	*/
	WebElement workfromhome=driver.findElement(By.xpath("//a[@href='https://www.livechennai.com/work_from_home_genuine.asp']"));
	workfromhome.click();
//	Thread.sleep(2000);
/*	Actions a = new Actions(driver);
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
	WebElement name=driver.findElement(By.xpath("(//div[.='Your answer']//preceding-sibling::input[@type='text'])[1]"));
	
	name.sendKeys("abi");
	
*/	
	
	
	
	
	}
}

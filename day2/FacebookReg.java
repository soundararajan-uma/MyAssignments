package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Uma");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("H");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8608976103");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("bk226");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		WebElement daydd= driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(daydd);
		sel.selectByValue("12");
		WebElement monthdd= driver.findElement(By.xpath("//select[@id='month']"));
		Select sel1=new Select(monthdd);
		sel1.selectByVisibleText("Mar");
		WebElement yeardd= driver.findElement(By.xpath("//select[@id='year']"));
		Select sel2=new Select(yeardd);
		sel2.selectByIndex(17);
				
	}

}
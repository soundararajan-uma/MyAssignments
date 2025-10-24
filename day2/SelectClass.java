package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
ChromeDriver driver=new ChromeDriver(options);
driver.get("http://leaftaps.com/opentaps");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.xpath("//a[contains(@style,'black')]")).click();
driver.findElement(By.xpath("//a[text()='Accounts']")).click();
driver.findElement(By.xpath("//a[text()='Create Account']")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("UmaSN");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
WebElement ownerdd=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
Select sel=new Select(ownerdd);
sel.selectByVisibleText("S-Corporation");
WebElement industrydd=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
Select sel1=new Select(industrydd);
sel1.selectByIndex(3);
WebElement sourcedd=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
Select sel2=new Select(sourcedd);
sel2.selectByValue("LEAD_EMPLOYEE");
WebElement marketdd=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
Select sel3=new Select(marketdd);
sel3.selectByIndex(6);
WebElement statedd=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
Select sel4=new Select(statedd);
sel4.selectByValue("TX");
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
System.out.println(text);
Thread.sleep(3000);
driver.close();
	}

}

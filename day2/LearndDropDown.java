package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearndDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Uma");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
WebElement sourcedd=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sel=new Select(sourcedd);
sel.selectByIndex(4);
WebElement marketdd=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select sel1=new Select(marketdd);
sel1.selectByVisibleText("Automobile");
WebElement ownerdd=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select sel2=new Select(ownerdd);
sel2.selectByValue("OWN_CCORP");
driver.findElement(By.className("smallSubmit")).click();
String title=driver.getTitle();
System.out.println(title);
Thread.sleep(4000);
driver.close();
	}

}

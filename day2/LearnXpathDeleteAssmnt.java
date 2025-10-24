package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpathDeleteAssmnt {

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
        driver.findElement(By.partialLinkText("SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.linkText("Phone")).click();
        driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("887");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
        driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
               if(text2.contains("No records to display")) {
        	System.out.println("Verified");
        }
        else {
        	System.out.println("Not Verified");
        }
               driver.close();
	}

}

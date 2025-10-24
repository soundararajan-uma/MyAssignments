package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnXpathEdit {

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
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("UmaH");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("U");
        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("umas@gmail.com");
        WebElement statedd1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select sel=new Select(statedd1);
        sel.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automation Testing");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        String title=driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
        driver.close();
	}

}

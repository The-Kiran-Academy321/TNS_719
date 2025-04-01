package com.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage_TestCases {

	@Test
	void testValidCredential()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/DATA_BACKUP/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	void testInValidCredential()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/DATA_BACKUP/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ABC@123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String errorMasssage=driver.findElement(By.id("email_error")).getText();
		Assert.assertEquals(errorMasssage, "Invalid Username !!!!");
	}
	@Test
	void testHeader()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/DATA_BACKUP/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		
		String HeaderText=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		Assert.assertEquals(HeaderText, "The Kiran Academy");
	}
}

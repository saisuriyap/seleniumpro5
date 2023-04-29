package com.example.demo.PROject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	System.out.print("switched");
	WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	Actions act= new Actions(driver);
	act.dragAndDrop(drag,drop).build().perform();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	WebElement btn=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[3]/a"));
	btn.click();
//	driver.quit();
	
}
}
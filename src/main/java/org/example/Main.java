package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Lecture\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://aa.com");
        driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[3]/div[1]/div/a/span[1]")).click();
        Select s;
        s = new Select(driver.findElement(By.xpath("//*[@id=\"countryCode\"]")));
        s.selectByValue("US");
        s = new Select(driver.findElement(By.xpath("//*[@id=\"stateCode\"]")));
        s.selectByValue("MO");

        //locators
        //ID, ClassName, Name, LinkText, Xpath, css
        //driver.findElement(By.id("email")).sendKeys("tkang@ucmo.edu");
        //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tkang@@@@");
        //driver.findElement(By.id("pass")).sendKeys("11222");
        //driver.findElement(By.name("login")).click();

        //tagname[@attribute name = value]
        //input[@id="pass"]
        //absoulte path vs relatvive path
        //relative path does not depend on parent node;

    }

}
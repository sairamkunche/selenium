package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Main {
    public static void main(String[] args){
        //set the chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Lecture\\Selenium\\chromedriver.exe");

        //create driver instance
        WebDriver driver = new ChromeDriver();

        //open the website
        driver.get("http://aa.com");

        //select round trip
        driver.findElement(By.xpath("//*[@id=\"bookingCheckboxContainer\"]/div[1]/div[1]/label/span[1]")).click();

        //click from button
        driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[3]/div[1]/div/a/span[1]")).click();
        Select s;

        //select the country dropdown
        s = new Select(driver.findElement(By.xpath("//*[@id=\"countryCode\"]")));

        //select US
        s.selectByValue("US");

        //select state dropdown
        s = new Select(driver.findElement(By.xpath("//*[@id=\"stateCode\"]")));

        //select Mo
        s.selectByValue("MO");

        //select CGI airport
        driver.findElement(By.xpath("//*[@id=\"airport_CGI\"]/span[1]")).click();

        //click to button
        driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[3]/div[2]/div/a/span[1]")).click();

        //select the country dropdown
        s = new Select(driver.findElement(By.xpath("//*[@id=\"countryCode\"]")));

        //select country
        s.selectByValue("US");

        //select the country dropdown
        s = new Select(driver.findElement(By.xpath("//*[@id=\"stateCode\"]")));

        //select state
        s.selectByValue("MO");

        //select airport
        driver.findElement(By.xpath("//*[@id=\"airport_COU\"]/span[1]")).click();

        //select passenger dropdown
        s = new Select(driver.findElement(By.xpath("//*[@id=\"flightSearchForm.adultOrSeniorPassengerCount\"]")));

        //select the no of passengers
        s.selectByValue("3");

        //select the start date input box
        WebElement dateBox = driver.findElement(By.xpath("//*[@id=\"aa-leavingOn\"]"));

        //set the start date
        dateBox.sendKeys("12/11/2022");

        //select the return date input box
        dateBox = driver.findElement(By.xpath("//*[@id=\"aa-returningFrom\"]"));

        //set the return date
        dateBox.sendKeys("12/16/2022");

        //click on search button
        driver.findElement(By.xpath("//*[@id=\"flightSearchForm.button.reSubmit\"]")).click();
    }

}
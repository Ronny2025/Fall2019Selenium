package com.automation.tests.day1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstSeleniumScript {

    public static void main(String[] args) {
        //set up Chrome dirver
        WebDriverManager.chromedriver().setup();
        //create chromedriver object
        ChromeDriver driver = new ChromeDriver();
        //open website
        driver.get("http://google.com");



    }


}

package org.testAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    public void setUp(){

        driver = new ChromeDriver();

        //maximise window
        driver.manage().window().maximize();

        //Navigate to the URL
        driver.get("https://ecommerce-playground.lambdatest.io/");
    }

    public void tearDown(){

        if(driver!= null){
            driver.quit();
        }
    }

}

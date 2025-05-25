package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class create_fund_page1 {
    private WebDriver driver;

    public create_fund_page1(WebDriver driver) {
        this.driver = driver;
    }
    public create_fund_page1 createFundPage1()
    {
        driver.findElement(By.xpath("//*[@id=\"#kt_aside_menu\"]/div[6]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"kt_wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //upload fund photo
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        WebElement input = driver.findElement(By.xpath("//input[@type='file']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display = 'block';", input);
        input.sendKeys("C:\\Users\\Masarat\\Desktop\\11.jpg");
        //-------uploading done------
        driver.findElement(By.id("translations_ar_name_inp")).sendKeys("صندوق البناء والتنمية");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TinyMCEHelper.injectIntoTinyMCE(driver, "translations_ar_description_inp",
                "<h1>صندوق للتنمية العقارية بيع شراء</h1><p>صندوق للتنمية العقارية بيع شراء</p>");
        driver.findElement(By.id("translations_ar_performance_conditions_inp")).sendKeys("translations_ar_performance_conditions_inp");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("translations_en_name_inp")).sendKeys("صندوق البناء والتنمية");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TinyMCEHelper.injectIntoTinyMCE(driver, "translations_en_description_inp",
                "<h1>صندوق للتنمية العقارية بيع شراء</h1><p>صندوق للتنمية العقارية بيع شراء</p>");
        driver.findElement(By.id("translations_en_performance_conditions_inp")).sendKeys("translations_ar_performance_conditions_inp");

        return new create_fund_page1(driver);

    }
}

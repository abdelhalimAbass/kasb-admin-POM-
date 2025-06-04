package org.example;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chooseFundType {


    public static void chooseFromDropdownInteractively(WebDriver driver) {
        Scanner scanner = new Scanner(System.in); // لإنه ياخد إدخال من المستخدم

        System.out.print("اكتب القيمة اللي عايز تختارها من الـ Dropdown: ");
        String userChoice = scanner.nextLine().toString(); // ياخد القيمة من المستخدم

        // نلاقي الـ dropdown ونعمل اختيار بناءً على القيمة اللي المستخدم دخلها
//        Select dropdown = new Select(driver.findElement(By.id("fund-type")));
//        dropdown.selectByValue(userChoice); // أو selectByVisibleText(userChoice) حسب اللي ظاهر للمستخدم

        if (userChoice=="close".toString()){
            driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[5]/div[1]/span[2]/span[1]/span")).click();
            WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement fundtype=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Private Close Ended')]")));
            fundtype.click();
        }  else
        //else if (userChoice=="open".)
        {
            driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[5]/div[1]/span[2]/span[1]/span")).click();
            WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement fundtype=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Public open ended')]")));
            fundtype.click();
            driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[5]/div[2]/span[2]/span[1]/span")).click();
            WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement transfareType=wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'manual')]")));
//By.id("select2-auto_transfer_inp-container")
            transfareType.click();
            driver.findElement(By.id("bench_mark_inp")).sendKeys("benchmark");
            WebElement lanuchDate=driver.findElement(By.id("launch_date_inp"));
            lanuchDate.sendKeys("06/06/2025");
            WebElement inceptionPrice=driver.findElement(By.id("inception_price_inp"));
            inceptionPrice.sendKeys("100");
            driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[7]/div[1]/span[2]/span[1]/span")).click();
            WebDriverWait waitLiq=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement liqudityDate=waitLiq.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Daily')]")));
            liqudityDate.click();
            driver.findElement(By.id("cut_of_time_inp")).sendKeys("11:59");
            WebElement totalIssuedUnit=driver.findElement(By.id("units_count_inp"));
            totalIssuedUnit.sendKeys("100");
            WebElement limitUnitForinv=driver.findElement(By.id("limit_units_investor_inp"));
            limitUnitForinv.sendKeys("50");
            WebElement NAV=driver.findElement(By.id("unit_price_inp"));
            NAV.sendKeys("100");
            WebElement minisub= driver.findElement(By.id("initial_investment_inp"));
            minisub.sendKeys("100");
            WebElement INCinv=driver.findElement(By.id("subsequent_investment_inp"));
            INCinv.sendKeys("100");
            WebElement fundDuration =driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[9]/div[3]/div/input"));
            fundDuration.sendKeys("10");
            driver.findElement(By.id("fund_fees_management_inp")).sendKeys("1");
            driver.findElement(By.id("fund_fees_subscription_inp")).sendKeys("1");
            driver.findElement(By.id("fund_fees_distribution_inp")).sendKeys("1");
            driver.findElement(By.id("fund_fees_admin_inp")).sendKeys("1");
            driver.findElement(By.id("fund_fees_performance_inp")).sendKeys("1");
            driver.findElement(By.id("fund_fees_redemption_inp")).sendKeys("1");
            driver.findElement(By.xpath("//*[@id=\"asset_classes_repeater\"]/div[1]/div/div/div/div[1]/span[2]/span[1]/span")).click();
            WebDriverWait waitass=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement asset=waitass.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),' Equity')]")));
            asset.click();
            driver.findElement(By.id("asset_classes_repeater_0_percentage_inp")).sendKeys("100");
            driver.findElement(By.id("next-btn")).click();





        }
        System.out.println("تم اختيار: " + userChoice);
    }



}

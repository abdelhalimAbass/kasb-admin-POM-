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
        String userChoice = scanner.nextLine(); // ياخد القيمة من المستخدم

        // نلاقي الـ dropdown ونعمل اختيار بناءً على القيمة اللي المستخدم دخلها
//        Select dropdown = new Select(driver.findElement(By.id("fund-type")));
//        dropdown.selectByValue(userChoice); // أو selectByVisibleText(userChoice) حسب اللي ظاهر للمستخدم

        if (userChoice==" 1"){
            driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[5]/div[1]/span[2]/span[1]/span")).click();
            WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement fundtype=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Private Close Ended')]")));
            fundtype.click();
        }  //else
        else if (userChoice==" 2")
        {
            driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[5]/div[1]/span[2]/span[1]/span")).click();
            WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement fundtype=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Public open ended')]")));
            fundtype.click();
        }
        System.out.println("تم اختيار: " + userChoice);
    }



}

package org.example;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://dashboard-smartsaving-beta.dafa.sa/admin/login");
        log_in(driver);


    }
    public static void log_in(WebDriver driver) {
        //WebDriver driver = new FirefoxDriver();
        //driver.get("https://dashboard-smartsaving-beta.dafa.sa/admin/login");
        driver.findElement(By.id("email_inp")).sendKeys("admin@example.com");
        driver.findElement(By.id("password_inp")).sendKeys("123123123");
        driver.findElement(By.id("submit-btn")).click();
    }
}
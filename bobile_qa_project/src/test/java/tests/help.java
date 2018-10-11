package tests;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import static org.openqa.selenium.OutputType.*;

@Test
public class help {
    ChromeDriver wd ;
    public void help() {

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://sandbox.bobile.com/admin/account/myapps");
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys("autests@bobile.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("123456");
        wd.findElement(By.id("login")).click();
        wd.findElement(By.xpath("//div[@id='createApp']")).click();
        if (!wd.findElement(By.name("smb-type")).isSelected()) {
            wd.findElement(By.name("smb-type")).click();
        }
        wd.findElement(By.xpath("//div[@class='register-screen']/div[1]/div[3]/div/div/div[2]/div/div")).click();
        wd.findElement(By.id("app-name")).click();
        wd.findElement(By.id("app-name")).clear();
        wd.findElement(By.id("app-name")).sendKeys("Service app");
        wd.findElement(By.id("select2-selectSubCategory-container")).click();
        wd.findElement(By.xpath("//div[@id='part1']/div[3]/div/div/div[3]/div/div")).click();
        wd.findElement(By.xpath("//div[@id='part3Elements']//span[.='No thanks, skip']")).click();
        wd.findElement(By.xpath("//div[@class='main-all']//span[.='Continue']")).click();
        wd.findElement(By.xpath("//div[@class='plansSwitcher']/div[1]/div/div/div[2]/div/div/div/div[1]/div/div/div[7]")).click();
        wd.findElement(By.xpath("//div[@class='subscription-left']/div[2]/div/div[4]/div/div[2]/div/div/div/div")).click();
        wd.findElement(By.xpath("//div[@class='popover-buttons']/div/div[1]/div")).click();
        wd.findElement(By.xpath("//div[@class='myapp-top']//span[.='Go to Workspace']")).click();
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}

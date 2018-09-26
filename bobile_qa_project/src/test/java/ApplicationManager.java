import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    //FirefoxDriver wd;
    ChromeDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        //wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite("https://sandbox.bobile.com/admin/credential/login/");
    }

    public void closeErrorMessage() {
        wd.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
    }

    public void clickLoginBtn() {
        wd.findElement(By.id("login")).click();
    }

    public void enterPassword(String password) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(password);
    }

    public void enterUserName(String username) {
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys(username);
    }

    public void openSite(String site) {
        wd.get(site);
    }

    public void stop() {
        wd.quit();
    }

    public void logout() {
        wd.findElement(By.xpath("//div[@class='col-md-2 col-md-offset-10 text-right']//div[@class='option-holder logOut float-left']")).click();
    }

    public void clickOnPlusBtn() {
        wd.findElement(By.xpath("//div[@id='createApp']")).click();
    }

    public void chooseBusinessType() {
        wait();
        wd.findElement(By.xpath("//input[@value='smb_services']")).click();

    }

    public void clickOnNextBtnStep1() {
        wd.findElement(By.xpath("//div[@class='second-btn register-btn advance-stage button-next-app-type']"));
    }

    public void fillAppName(String appname) {
        wait();
        wd.findElement(By.id("app-name")).click();
        wd.findElement(By.id("app-name")).clear();
        wd.findElement(By.id("app-name")).sendKeys(appname);
    }

    public void chooseAppCategory() {
        wd.findElement(By.id("select2-selectSubCategory-container")).click();
        //click on the container
        wd.findElement(By.xpath("//span[@aria-activedescendant='select2-selectSubCategory-result-88v5-73']")).click();
        //choose category (category id -73)
    }

    public void clickOnNextBtnStep2 (){
        wd.findElement(By.xpath("//div[@class='second-btn register-btn advance-stage button-next-business-type']")).click();
    }

    public void clickOnNoFacebookBtn() {
        wait();
        wd.findElement(By.xpath("//div[@class='second-btn login-btn clickAppName']")).click();
        //No thanks btn
    }

    public void clickOnContinueBtn() {
        wait();
        wd.findElement(By.xpath("//div[@class='second-btn workspace']")).click();
    }

    public void choosePlan() {
        wd.findElement(By.xpath("//div[@data-monthid='62']")).click();
    }
}

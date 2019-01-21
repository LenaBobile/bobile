package manager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;


public class AppCreationHelper {
    //FirefoxDriver wd;
    ChromeDriver wd;
    WebDriverWait wait;


    public AppCreationHelper(ChromeDriver wd) {
        this.wd = wd;
    }


    public void clickOnPlusBtn() {
        wd.findElement(By.xpath("//div[@id='createApp']")).click();
    }

    public void chooseBusinessType() {
        wait = new WebDriverWait(wd, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.smb-type-holder")));
        wd.findElement(By.cssSelector("div.smb-type-holder")).click();

    }

    public void clickOnNextBtnStep1() {
        wd.findElement(By.xpath("//div[@class='second-btn register-btn advance-stage button-next-app-type']")).click();
    }

    public void fillAppName(String appname) {
        wait = new WebDriverWait(wd, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("app-name")));

        wd.findElement(By.id("app-name")).click();
        wd.findElement(By.id("app-name")).clear();
        wd.findElement(By.id("app-name")).sendKeys(appname);

    }

    public void chooseAppCategory() {
        wd.findElement(By.id("select2-selectSubCategory-container")).click();
        //click on the container
        wd.findElement(By.xpath("//input[@type='search']")).sendKeys("Artists" + Keys.ENTER);
    }

    public void clickOnNextBtnStep2 (){
        wd.findElement(By.xpath("//div[@class='second-btn register-btn advance-stage button-next-business-type']")).click();
    }

    public void clickOnNoFacebookBtn() {
        wd.findElement(By.cssSelector("div.col-md-12 > div.left-box.grab-box>div.row>div.row>div.col-md-6>div.second-btn.login-btn.clickAppName > span:nth-child(1)")).click();
        //No thanks btn
    }

    public void clickOnContinueBtn() {
        wd.findElement(By.xpath("//div[@class='second-btn workspace']")).click();

    }

    public void choosePlan() throws AWTException, Exception {
        ((JavascriptExecutor)wd).executeScript("scroll(0,2000)");

        Wait(1000);
        ((JavascriptExecutor)wd).executeScript("$('div[data-monthid=35]').click()");
    }

    public void chooseSubscription() {
        wd.findElement(By.xpath("//div[@class='plan-select']//input[@class='monthSubscription']")).click();
    }

    public void clickStartTrial(){
        wd.findElement(By.xpath("//div[@class='plan-buy continueTrial select_subscription purchase']")).click();

    }

    public void confirmPurchase() {
        wd.findElement(By.xpath("//div[@class='popover-confirm popover-btn second-btn']")).click();
    }

    public void clickOnGoToWorkspace() {
        wait = new WebDriverWait(wd,80);
        wd.findElement(By.xpath("//div[@class='second-btn post-show-btn']")).click();
    }

    public void Wait(int millis) throws Exception {
        Thread.sleep(millis);
    }
}

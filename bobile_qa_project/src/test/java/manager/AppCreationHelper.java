package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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

        //wd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        //wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(wd, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.smb-type-holder")));
        wd.findElement(By.cssSelector("div.smb-type-holder")).click();
        //wd.findElement(By.cssSelector("input.radio-button-service")).click();
        //div[@class='element-input-wrapper part-title']//div[@class='row']//div[@class='row']//div[1]//div[1]//div[3]//div[1]
        //input[@value='smb_services']
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
        //wd.findElement(By.xpath("//span[@aria-activedescendant='select2-selectSubCategory-result-te1l-8']")).click();
        //choose category (category id -73)
    }

    public void clickOnNextBtnStep2 (){
        wd.findElement(By.xpath("//div[@class='second-btn register-btn advance-stage button-next-business-type']")).click();
    }

    public void clickOnNoFacebookBtn() {
        //wait = new WebDriverWait(wd, 30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='left-box grab-box']//div[@class='second-btn login-btn clickAppName']")));
        wd.findElement(By.cssSelector("div.col-md-12 > div.left-box.grab-box>div.row>div.row>div.col-md-6>div.second-btn.login-btn.clickAppName > span:nth-child(1)")).click();
        //No thanks btn
    }

    public void clickOnContinueBtn() {
        wait = new WebDriverWait(wd,80);
        wd.findElement(By.xpath("//div[@class='second-btn workspace']")).click();
    }

    public void choosePlan() {
        wd.findElement(By.xpath("//div[@data-monthid='62'][@xpath='2']")).click();
        //plan id - 62
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
}

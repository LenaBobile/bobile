package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private  AppCreationHelper appCreationHelper;
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
        wd.manage().window().maximize();
        openSite("https://sandbox.bobile.com/admin/credential/login/");
        appCreationHelper = new AppCreationHelper(wd);
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

    public void login(String username, String password) {
        enterUserName(username);
        enterPassword(password);
        clickLoginBtn();
    }

    public void logout() {
        wd.findElement(By.xpath("//div[@class='col-md-2 col-md-offset-10 text-right']//div[@class='option-holder logOut float-left']")).click();
    }


    public void clickonManageBtn(final String encryptedBiz) {
        //wd.findElement(By.xpath("//div[@class='second-btn manage-btn manageApp']")).click();
        wd.findElement(By.xpath("//div[@class='second-btn manage-btn manageApp'][@data-app='" + encryptedBiz + "']")).click();
    }

    public AppCreationHelper getAppCreationHelper() {
        return appCreationHelper;
    }

    public void clickonMobileShopModule() {
        wd.findElement(By.xpath("//a[contains(@href,'/admin/shop/')]//div[contains(@class,'system-section')]")).click();
    }

    public void clickOnAddNewProduct() {
        wd.findElement(By.xpath("//div[contains(@class,'add-img-product primary-btn hide-wizard-step-5')]")).click();
    }

    public void fillProductTitle() {
        wd.findElement(By.xpath("//input[@class='input-field wide productName requiredField']")).click();
        wd.findElement(By.xpath("//input[@class='input-field wide productName requiredField']")).clear();
        wd.findElement(By.xpath("//input[@class='input-field wide productName requiredField']")).sendKeys("Product title");
    }

    public void fillProductDescription() {
        wd.findElement(By.xpath("//textarea[@class='input-textarea productDesc requiredField']")).click();
        wd.findElement(By.xpath("//textarea[@class='input-textarea productDesc requiredField']")).clear();
        wd.findElement(By.xpath("//textarea[@class='input-textarea productDesc requiredField']")).sendKeys("Product description");
    }

    public void addProductImage() {
        wd.findElement(By.xpath("//a[@href='https://sandbox.bobile.com/admin/libs/filemanager/dialog.php?fldr=&iw=600&ih=400&iid=productImg&image_type=product_img&row_id=']")).click();
    }
}


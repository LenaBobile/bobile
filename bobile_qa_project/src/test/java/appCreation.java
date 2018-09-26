import org.openqa.selenium.*;
import org.testng.annotations.Test;


public class appCreation extends TestBase{

    @Test
            public void appCreation(){
        app.clickOnPlusBtn();
        app.chooseBusinessType();
        app.clickOnNextBtnStep1();
        app.fillAppName("Service app");
        app.chooseAppCategory();
        app.clickOnNextBtnStep2();
        app.clickOnNoFacebookBtn();
        app.clickOnContinueBtn();
        app.choosePlan();
        app.chooseSubscription();



        //div[@id='createApp']
        wd.findElement(By.xpath("//div[@class='register-screen']/div[1]/div[3]/div/div/div[2]/div/div")).click();



        wd.findElement(By.xpath("//div[@id='part3Elements']//span[.='No thanks, skip']")).click();
        wd.findElement(By.xpath("//div[@class='main-all']//span[.='Continue']")).click();
        wd.findElement(By.xpath("//div[@class='plansSwitcher']/div[1]/div/div/div[2]/div/div/div/div[1]/div/div/div[7]")).click();
        wd.findElement(By.xpath("//div[@class='subscription-left']/div[2]/div/div[4]/div/div[2]/div/div/div/div")).click();
        wd.findElement(By.xpath("//div[@class='popover-buttons']/div/div[1]/div")).click();
        wd.findElement(By.xpath("//div[@class='myapp-top']//span[.='Go to Workspace']")).click();
        wd.quit();
    }

}

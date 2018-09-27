import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class appCreation extends TestBase {

    @BeforeMethod

    public void login() {
        app.login("autests@bobile.com", "123456");
    }

    @Test

    public void appCreation() {

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
        app.clickStartTrial();
        app.confirmPurchase();
        app.clickOnGoToWorkspace();

    }

}

import org.testng.annotations.*;

public class login extends TestBase {

    @BeforeMethod

    @Test
    public void login() {
        app.enterUserName("lenadag@bobile.com");
        app.enterPassword("123456");
        app.clickLoginBtn();
        app.logout();
    }

    @Test
    public void loginWithEmptyFields (){
        app.openSite("https://sandbox.bobile.com/admin/credential/login/");
        app.enterUserName("");
        app.enterPassword("");
        app.clickLoginBtn();
        app.closeErrorMessage();
    }

    @Test
    public void loginWithWrongParametr (){
        app.openSite("https://sandbox.bobile.com/admin/credential/login/");
        app.enterUserName("lenadag@bobile.com");
        app.enterPassword("Y");
        app.clickLoginBtn();
        app.closeErrorMessage();
    }

}

package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;

public class ProductCreation extends TestBase {



    @BeforeMethod

    public void login() {
    app.login("autests@bobile.com", "123456");
    }


    @Test

    public void ManageApp(){

        app.clickonManageBtn("5iVhYpc5vEXu74hDGPAOu@**@HnwNXMY8SYYc0IggGXSFg=");
        app.clickonMobileShopModule();
        app.clickOnAddNewProduct();
        app.fillProductTitle();
        app.fillProductDescription();
        app.addProductImage();

    }
}

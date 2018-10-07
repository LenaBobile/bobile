import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class manageApp extends TestBase {

    ChromeDriver wd;

    @BeforeMethod

    public void login() {
        app.login("crazyio2005@gmail.com", "123456");
    }


    @Test

    public void ManageApp(){
      wd.findElement(By.xpath("//div[@class='second-btn manage-btn manageApp']")).click();

    }
}

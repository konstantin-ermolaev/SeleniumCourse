import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void firstTest() {

        By fldLogin = By.name("username");
        By fldPass = By.name("password");
        By chkbxRememberMe = By.name("remember_me");
        By btnSubmit = By.name("login");

        driver.get("http://localhost/litecart/admin");
        driver.findElement(fldLogin).clear();
        driver.findElement(fldLogin).sendKeys("anyUser");
        driver.findElement(fldPass).clear();
        driver.findElement(fldPass).sendKeys("anyPass");
        driver.findElement(chkbxRememberMe).click();
        driver.findElement(btnSubmit).click();
    }

    @After
    public void stop(){
        driver.quit();
        driver =  null;
    }
}
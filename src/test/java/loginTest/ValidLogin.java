package loginTest;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;


public class ValidLogin {

    WebDriver driver;
    Logger log;
    LoginPage loginPage;
    HomePage homePage;

    @Before
    public void SetUp() {
        File fileFF = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        log = Logger.getLogger(getClass());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }


    @Test
    public void ValidLogin (){
        loginPage.OpenPage();
        //loginPage.openLoginPage("https://github.com/login");
        loginPage.InputLoginName("shmidtjulia");
        loginPage.InputPass("Prk42037");
        loginPage.ClickSubmitButton();
        String s1 = homePage.getTitle();
        System.out.println(s1);

    }

    @After
    public void TearDown(){

        driver.quit();
    }
}

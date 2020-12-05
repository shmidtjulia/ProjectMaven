package pages;

import libs.ActionsWithWebElements;
import libs.ConfigData;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {
    //input[@id='login_field']
    //String LoginNameInputId = "login_field";
    String LoginNameXpath = "//input[@id='login_field']";
    By LoginNameInputId = By.id("login_field");

    //input[@id='password']
    //String PassInputID = "password";
    By PassInputID = By.id("password");

    //*[@name='commit']
    //String ButtonSubmitType = "commit";
    By ButtonSubmitType = By.name("commit");

    @FindBy(id = "login_field")
    WebElement InputLoginElement;

    @FindBy(id = "password")
    WebElement InputPassElement;

    @FindBy(name = "commit")
    WebElement SubmitButton;

    // Подключение логов и подключение к драйверам браузера с помощью Селениум библиотек
    public LoginPage (WebDriver driver){
        super(driver);

    }

    public void openLoginPage(String link){
        try {
            driver.get(link);
            log.info("Page is opened");
        }
        catch (Exception ex) {
            log.error("Page doesn`t open" + ex);
        }
    }

    public void InputLoginName(String login){
        actionsWithWebElements.InputToTextField(InputLoginElement, login);

            ///driver.findElement(LoginNameInputId).clear();
            ///driver.findElement(LoginNameInputId).sendKeys(login);
            ///log.info("Login is inputed");

    }

    public void InputPass (String pass){
        actionsWithWebElements.InputToTextField(InputPassElement, pass);

            //driver.findElement(PassInputID).clear();
            //driver.findElement(PassInputID).sendKeys(pass);
            //log.info("Password is inputed");
    }

    public void ClickSubmitButton (){
        actionsWithWebElements.ClickToElements(SubmitButton);
           //driver.findElement(ButtonSubmitType).click();
            //log.info("Submit button is clicked");
    }

    public void OpenPage (){
        try{
            driver.get(ConfigData.getCfgValue("base_url")+"/login");
            log.info("Page login was opened");
        }
        catch (Exception ex){
            log.error("Can not open URL");
            //Assert.fail("Can not open URL");
        }
    }
    public void loginUser(String login, String pass){

        OpenPage();
        InputLoginName(login);
        InputPass(pass);
        ClickSubmitButton();
    }

}

package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy(xpath = "//h2[contains(text(),'Discover interesting projects and people to popula')]")
    protected WebElement RepositoryBlock;

    @FindBy(xpath = "//div[@id='dashboard-repos-container']//div[@id='repos-container']/h2/a")
    protected WebElement repositoryNewButton;


    String repository = "//div[@id='dashboard-repos-container']//div[@id='repos-container']";

    public HomePage(WebDriver driver){
        super(driver);

    }

    public void checkVisibilityRepositoryButton(){
        Assert.assertTrue("Button is not visible", repositoryNewButton.isDisplayed());
    }


    public String getTitle (){

        return driver.getTitle();
    }

    protected void checkTitle (String title){

        Assert.assertEquals ("Title not expected", getTitle(), title);
    }

    public void checkZagolovok(String zagolovokText){
        Assert.assertEquals("Zagolovok is not ", RepositoryBlock.getText(), zagolovokText);
    }



}

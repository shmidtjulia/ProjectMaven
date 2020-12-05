package pages;

import  org.junit.Assert;
import libs.ActionsWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.awt.print.PageFormat;

// В этом классе мы храним все то, что относится ко ВСЕМ страницам

public class ParentPage {

        WebDriver driver;
        Logger log;
        ActionsWithWebElements actionsWithWebElements;

    @FindBy(xpath = "//h2[contains(text(),'Discover interesting projects and people to popula')]")
    protected WebElement RepositoryBlock;

    public ParentPage (WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        actionsWithWebElements = new ActionsWithWebElements(driver);
        PageFactory.initElements(driver, this); //Превращает элементы by в элементы webelements
    }

    public String getTitle (){

        return driver.getTitle();
    }

    protected void checkTitle (String title){

        Assert.assertEquals ("Title not expected", getTitle(), title);
    }

    protected void checkZagolovok(String zagolovokText){
        Assert.assertEquals("Zagolovok is not ", RepositoryBlock.getText(), zagolovokText);
    }

}

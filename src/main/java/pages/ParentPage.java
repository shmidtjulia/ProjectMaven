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


    public ParentPage (WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        actionsWithWebElements = new ActionsWithWebElements(driver);
        PageFactory.initElements(driver, this); //Превращает элементы by в элементы webelements
    }
}

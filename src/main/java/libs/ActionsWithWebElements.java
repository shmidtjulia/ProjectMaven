package libs;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ActionsWithWebElements {
    WebDriver driver;
    Logger log;

    public ActionsWithWebElements(WebDriver driver){
        this.driver = driver;
        log = Logger.getLogger(getClass());
    }

    /**
     * This method Input text value to the text field
     * @param element
     * @param value
     */
    public void InputToTextField(WebElement element, String value){
        try {
            element.clear();
            element.sendKeys(value);
            log.info(value + "is inputed to" + element);
        }
        catch(Exception ex){
            log.error("Login isn`t input" + ex);
        }
    }

    /**
     * This method click to the web element
     * @param elements
     */
    public void ClickToElements(WebElement elements){
        try {
            elements.click();
            log.info("Submit button is clicked");
        }
        catch (Exception ex){
            log.error("Submit button isn`t clicked" + ex);

        }
    }

    /**
     * This method check is element present and enabled
     * @param element
     * @return
     */
    public boolean isElementPresent(WebElement element){

        return (element.isDisplayed() && element.isEnabled()) ;
    }

    /**
     * This method select visible text from drop down list
     * @param elementDD
     * @param textForSelect
     */

    public void selectItemInDropDownByVisibleText(WebElement elementDD, String textForSelect){
        try {
            Select optionsFromDD= new Select (elementDD);
            optionsFromDD.selectByVisibleText(textForSelect);
            log.info(textForSelect + "was selected in DD");
        }
        catch (Exception e){
            log.error("Cannot work with element");
            //Assert.error("Cannot work with element");
        }
    }

    /**
     * This method select visible text from drop down list
     * @param elementDD
     * @param valueInDD
     */

    public void selectItemInDropDownByValue (WebElement elementDD, String valueInDD){
        try {
            Select optionsFromDD= new Select (elementDD);
            optionsFromDD.selectByValue(valueInDD);
            log.info(valueInDD + "was selected in DD");
        }
        catch (Exception e){
            log.error("Cannot work with element");
            //Assert.error("Cannot work with element");
        }
    }

    /**
     * This method checked/unchecked box
     * @param element
     * @param neededState
     */
    public void selectCheckBox (WebElement element, boolean neededState){
        try {
            if ((element.isSelected() && (!neededState))||(!element.isSelected() && neededState)){
                element.click();
            }
        }catch (Exception ex){
            log.error("Exception " + ex);
        }
    }

}

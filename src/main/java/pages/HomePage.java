package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage {


    String Rerository = "//div[@id='dashboard-repos-container']//div[@id='repos-container']";

    public HomePage(WebDriver driver){
        super(driver);

    }


}

package pages;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    public void goToHome(){
        getDriver().navigate().to("https://www.saucedemo.com");
    }
}

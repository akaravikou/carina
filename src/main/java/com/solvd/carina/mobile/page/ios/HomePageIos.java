package com.solvd.carina.mobile.page.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.mobile.component.Dropdown;
import com.solvd.carina.mobile.page.common.OnlinerAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageIos extends OnlinerAbstractPage {

    @FindBy(className = "onliner_logo")
    private ExtendedWebElement logo;

    public HomePageIos(WebDriver driver) {
        super(driver);
    }

    @Override
    public ExtendedWebElement getAnimation() {
        return null;
    }

    @Override
    public Dropdown getDropdown() {
        return null;
    }

    public void logoIsPresent() {
        logo.isPresent();
    }


}

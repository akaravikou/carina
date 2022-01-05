package com.solvd.carina.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.web.component.Dropdown;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class OnlinerAbstractPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@class, 'state_animated')]")
    private ExtendedWebElement animation;

    @FindBy(xpath = "//*[@class='b-main-navigation']//li[2]//*[contains(@class, 'dropdown-grid')]")
    private Dropdown dropdown;

    public OnlinerAbstractPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getAnimation() {
        return animation;
    }

    public Dropdown getDropdown() {
        return dropdown;
    }
}

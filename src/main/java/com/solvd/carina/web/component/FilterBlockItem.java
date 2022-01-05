package com.solvd.carina.web.component;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FilterBlockItem extends AbstractUIObject {

    @FindBy(xpath = ".//input[@type='checkbox']")
    private ExtendedWebElement checkbox;

    @FindBy(xpath = ".//*[contains(@class,'checkbox-text')]")
    private ExtendedWebElement labelText;

    public FilterBlockItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickCheckbox() {
        checkbox.click();
    }

    public void checkCheckBox() {
        checkbox.check();
    }

    public ExtendedWebElement getCheckbox() {
        return checkbox;
    }

    public ExtendedWebElement getLabelText() {
        return labelText;
    }

    public String getElementLabel() {
        return labelText.getText();
    }
}

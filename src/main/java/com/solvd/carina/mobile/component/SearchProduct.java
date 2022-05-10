package com.solvd.carina.mobile.component;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends AbstractUIObject {

    @FindBy(xpath = ".//div[@class='product__title']//a[@class='product__title-link']")
    private ExtendedWebElement itemTitle;

    public SearchProduct(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getItemTitle() {
        return itemTitle;
    }

    public String getItemTitleText() {
        return itemTitle.getText();
    }
}

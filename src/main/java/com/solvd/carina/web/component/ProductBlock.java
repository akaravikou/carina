package com.solvd.carina.web.component;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductBlock extends AbstractUIObject {

    public ProductBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = ".//*[contains(@class,'product__title')]")
    private ExtendedWebElement title;

    public ExtendedWebElement getTitleText() {
        return title;
    }

    public String getTitle() {
        return title.getText();
    }
}

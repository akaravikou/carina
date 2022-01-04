package com.solvd.carina.web.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterBlock extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(@class, 'checkbox-item')]")
    private List<FilterBlockItem> filterBlockItems;

    public FilterBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<FilterBlockItem> getFilterBlockItems() {
        return filterBlockItems;
    }
}

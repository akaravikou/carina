package com.solvd.carina.web.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.solvd.carina.web.components.CatalogBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends OnlinerAbstractPage {

    @FindBy(xpath="//*[@class='catalog-bar__list']")
    private CatalogBar catalogBar;

    public CatalogPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("catalog_url"));
    }

    public CatalogBar getCatalogBar() {
        return catalogBar;
    }
}

package com.solvd.carina.web;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.web.components.FilterBlock;
import com.solvd.carina.web.components.ProductBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends AbstractPage {

    @FindBy(id = "schema-filter")
    private FilterBlock filterBlock;

    @FindBy(xpath = "//div[@id='schema-products']")
    private List<ProductBlock> productBlocks;

    public ProductPage(WebDriver driver) {
        super(driver);
    }
}

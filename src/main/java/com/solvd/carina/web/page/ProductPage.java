package com.solvd.carina.web.page;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.web.component.FilterBlock;
import com.solvd.carina.web.component.ProductBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends OnlinerAbstractPage {

    @FindBy(id = "schema-filter")
    private FilterBlock filterBlock;

    @FindBy(xpath = "//*[@id='schema-products']")
    private List<ProductBlock> productBlocks;

    @FindBy(xpath="//*[@class = 'schema-order__link']")
    private ExtendedWebElement popularButton;

    @FindBy(xpath = "//*[@id='fast-search']//input[@type='text']")
    private ExtendedWebElement search;

    @FindBy(xpath = "//*[contains(@class,'b-main-navigation__text') and text()='Каталог']")
    private ExtendedWebElement catalogButton;

    public ProductPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("catalog_url")+"/motorcycle");
    }

    public FilterBlock getFilterBlock() {
        return filterBlock;
    }

    public List<ProductBlock> getProductBlocks() {
        return productBlocks;
    }

    public ExtendedWebElement getPopularButton() {
        return popularButton;
    }

    public void TypeInSearch(String searchItem){
        search.type(searchItem,10l);
    }

    public ExtendedWebElement getCatalogButton() {
        return catalogButton;
    }

    public void catalogButtonClick() {
        catalogButton.click();
    }
}

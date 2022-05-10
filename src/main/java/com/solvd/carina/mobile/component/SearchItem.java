package com.solvd.carina.mobile.component;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchItem extends AbstractUIObject {

    @FindBy(xpath = "//*[@id='search-page']//li[contains(@class, 'search__result')]")
    private List<SearchProduct> searchProducts;

    public SearchItem(WebDriver driver) {
        super(driver);
        String rootSearchFrame = "//*[@class='modal-iframe']";
        setRootElement(driver.findElement(By.xpath(rootSearchFrame)));
    }

    public List<SearchProduct> getSearchProducts() {
        return searchProducts;
    }
}

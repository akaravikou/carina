package com.solvd.carina.web.service;

import com.solvd.carina.web.component.SearchItem;
import com.solvd.carina.web.component.SearchProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchItemService {

    private final SearchItem searchItem;

    public SearchItemService(WebDriver webDriver) {
        this.searchItem = new SearchItem(webDriver);
    }

    public void switchWait() {
        searchItem.getDriver().switchTo().frame(searchItem.getRootElement());
        Wait<WebDriver> webDriverWait = new WebDriverWait(searchItem.getDriver(), 20L);
        webDriverWait.until(webDriver -> !searchItem.getSearchProducts().isEmpty());
    }

    public List<SearchProduct> getSearchProducts() {
        return searchItem.getSearchProducts();
    }
}

package com.solvd.carina.mobile.page.android;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.mobile.component.Dropdown;
import com.solvd.carina.mobile.component.FilterBlock;
import com.solvd.carina.mobile.component.ProductBlock;
import com.solvd.carina.mobile.page.common.OnlinerAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = OnlinerAbstractPage.class)
public class ProductPage extends OnlinerAbstractPage implements IMobileUtils {

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

    @Override
    public ExtendedWebElement getAnimation() {
        return null;
    }

    @Override
    public Dropdown getDropdown() {
        return null;
    }

    @Override
    public void logoIsPresent() {

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

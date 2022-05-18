package com.solvd.carina.mobile.page.android;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.mobile.component.CatalogBar;
import com.solvd.carina.mobile.component.Dropdown;
import com.solvd.carina.mobile.page.common.OnlinerAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = OnlinerAbstractPage.class)
public class CatalogPage extends OnlinerAbstractPage implements IMobileUtils {

    @FindBy(xpath="//*[@class='catalog-bar__list']")
    private CatalogBar catalogBar;

    public CatalogPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("catalog_url"));
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

    public CatalogBar getCatalogBar() {
        return catalogBar;
    }
}

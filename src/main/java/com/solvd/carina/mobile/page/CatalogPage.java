package com.solvd.carina.mobile.page;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.mobile.component.CatalogBar;
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

    public CatalogBar getCatalogBar() {
        return catalogBar;
    }
}

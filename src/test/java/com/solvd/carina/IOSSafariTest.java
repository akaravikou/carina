package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.mobile.page.ios.HomePageIos;
import org.testng.annotations.Test;

public class IOSSafariTest implements IAbstractTest {

    @Test
    public void safariTest() {
        HomePageIos homePageIos = new HomePageIos(getDriver());
        homePageIos.openURL("https://www.onliner.by/");

        homePageIos.logoIsPresent();
    }
}

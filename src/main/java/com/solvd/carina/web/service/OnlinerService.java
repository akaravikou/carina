package com.solvd.carina.web.service;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.web.page.OnlinerAbstractPage;
import org.openqa.selenium.WebDriver;

public class OnlinerService {

    private final OnlinerAbstractPage onlinerAbstractPage;

    public OnlinerService(WebDriver webDriver) {
        this.onlinerAbstractPage = new OnlinerAbstractPage(webDriver);
    }

    public void getStateAnimation (int seconds){
        ExtendedWebElement extendedWebElement = onlinerAbstractPage.getAnimation();
        extendedWebElement.waitUntilElementDisappear(20L);
    }
}
package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.web.ProductPage;
import com.solvd.carina.web.components.FilterBlock;
import com.solvd.carina.web.components.ProductBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class OnlinerWebTest implements IAbstractTest {

    @Test
    public void verifyFilterTest() {
        ProductPage productPage = new ProductPage(getDriver());
        productPage.open();
        FilterBlock filterBlock = productPage.getFilterBlock();
        Assert.assertTrue(filterBlock.isUIObjectPresent(),"Filter block doesn't present");

        filterBlock.getFilterBlockItems().stream()
                .filter(filterBlockItem -> "Kawasaki".equals(filterBlockItem.getLabelText()))
                .findFirst()
                .orElseThrow(() ->new RuntimeException("Can't find this block item"))
                .clickCheckbox();

        Wait<WebDriver> wait = new WebDriverWait(getDriver(), 10);
        wait.until(driver -> !driver.findElement(By.xpath("//*[contains(@class, 'state_animated')]")).isDisplayed());

       List<ProductBlock> productBlocks = productPage.getProductBlocks();
        SoftAssert searchAssert = new SoftAssert();
       productBlocks.forEach(productBlock ->
           searchAssert.assertTrue(productBlock.getTitle().toLowerCase().contains("kawasaki"))
        );

       searchAssert.assertAll();


    }
}

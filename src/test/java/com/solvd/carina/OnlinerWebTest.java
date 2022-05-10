package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.mobile.page.CatalogPage;
import com.solvd.carina.mobile.page.OnlinerAbstractPage;
import com.solvd.carina.mobile.component.Dropdown;
import com.solvd.carina.mobile.component.SearchProduct;
import com.solvd.carina.mobile.service.OnlinerService;
import com.solvd.carina.mobile.page.ProductPage;
import com.solvd.carina.mobile.component.FilterBlock;
import com.solvd.carina.mobile.component.ProductBlock;
import com.solvd.carina.mobile.service.SearchItemService;
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
        Assert.assertTrue(filterBlock.isUIObjectPresent(), "Filter block doesn't present");
        filterBlock.getFilterBlockItems().stream()
                .filter(filterBlockItem -> "Kawasaki".equals(filterBlockItem.getElementLabel()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Can't find this block item"))
                .clickCheckbox();
        OnlinerService onlinerService = new OnlinerService(getDriver());
        onlinerService.getStateAnimation(20);
        List<ProductBlock> productBlocks = productPage.getProductBlocks();
        SoftAssert searchAssert = new SoftAssert();
        productBlocks.forEach(productBlock ->
                searchAssert.assertTrue(productBlock.getTitle().toLowerCase().contains("kawasaki"))
        );
        searchAssert.assertAll();
    }

    @Test
    public void verifyPopularButtonTest() {
        ProductPage productPage = new ProductPage(getDriver());
        productPage.open();
        Assert.assertTrue(productPage.getPopularButton().isClickable(10), "Popular button isn't clickable");
    }

    @Test
    public void verifyCatalogPageTest(){
        ProductPage productPage = new ProductPage(getDriver());
        productPage.open();
        productPage.catalogButtonClick();

        OnlinerService onlinerService = new OnlinerService(getDriver());
        onlinerService.getStateAnimation(20);

        CatalogPage catalogPage = new CatalogPage(getDriver());
        Assert.assertTrue(catalogPage.getCatalogBar().isUIObjectPresent(), "Page doesn't load.");
    }

    @Test
    public void verifySearchTest() {
        ProductPage productPage = new ProductPage(getDriver());
        productPage.open();
        productPage.TypeInSearch("yamaha");

        SearchItemService searchItemService = new SearchItemService(getDriver());
        searchItemService.switchWait();
        List<SearchProduct> searchProducts = searchItemService.getSearchProducts();
        Assert.assertFalse(searchProducts.isEmpty(), "No products with this title.");

        SoftAssert softAssert = new SoftAssert();
        searchProducts.forEach(searchProduct -> softAssert.assertTrue(searchProduct.getItemTitleText().toLowerCase().contains("yamaha")));
        softAssert.assertAll();
    }

    @Test
    public void verifyDropDownTest() {
        ProductPage productPage = new ProductPage(getDriver());
        productPage.open();
        OnlinerAbstractPage onlinerAbstractPage = new OnlinerAbstractPage(getDriver());
        Dropdown dropdown = onlinerAbstractPage.getDropdown();
        Assert.assertTrue(dropdown.isUIObjectPresent());
    }
}

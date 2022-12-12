package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuPageTest extends BaseTest {
    TopMenuPage topMenuPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        topMenuPage = new TopMenuPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToComputer() {
        topMenuPage.selectMenu("Computers");
        Assert.assertEquals(topMenuPage.verifyComputer(), "Computers", "Error Message not displayed");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToElectronics() {
        topMenuPage.selectMenu("Electronics");
        Assert.assertEquals(topMenuPage.verifyElectronics(), "Electronics", "Error Message not displayed");
    }

    @Test(groups ={"regression"})
    public void verifyUserShouldNavigateToApparel() {
        topMenuPage.selectMenu("Apparel");
        Assert.assertEquals(topMenuPage.verifyApparel(), "Apparel", "Error Message not displayed");
    }
}

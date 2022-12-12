package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class TopMenuPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement getComputer;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/electronics']")
    WebElement getElectronics;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/apparel']")
    WebElement getApparel;



    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        try {
            for (WebElement options : menuList) {
                if (options.getText().equals(menu)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        }
    }


    public String verifyComputer() {
        Reporter.log("verifyComputer" + getComputer.toString());
        return getTextFromElement(getComputer);
    }

    public String verifyElectronics() {
        Reporter.log("verifyElectronics" + getElectronics.toString());
        return getTextFromElement(getElectronics);
    }

    public String verifyApparel() {
        Reporter.log("verifyApparel" + getApparel.toString());
        return getTextFromElement(getApparel);
    }

}

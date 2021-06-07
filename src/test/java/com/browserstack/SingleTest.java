package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("https://www.hotstar.com/");
        WebElement element = driver.findElement(By.id("searchField"));
        element.sendKeys("Hotstar");
        element.submit();
        Thread.sleep(5000);

        Assert.assertEquals("Hotstar - Google Search", driver.getTitle());
    }
}

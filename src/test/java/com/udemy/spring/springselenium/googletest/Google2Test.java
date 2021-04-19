package com.udemy.spring.springselenium.googletest;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import com.udemy.spring.springselenium.page.google.GooglePage;
import com.udemy.spring.springselenium.kelvin.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.springframework.test.util.AssertionErrors.assertTrue;

public class Google2Test extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenshotService screenshotService;

    @Test
    public void googleTest() throws IOException {

        this.googlePage.goTo();
        assertTrue("We are at the correct Page", this.googlePage.isAt());

        this.googlePage.acceptCookieMessage();

        this.googlePage.getSearchComponent().search("selenium");
        assertTrue("Did not find Google Search page", this.googlePage.getSearchResult().isAt());
        assertTrue("Did not get at least 2 results as expected", this.googlePage.getSearchResult().getCount() > 2);
        this.screenshotService.takeScreenShot();
        this.googlePage.close();
    }

}
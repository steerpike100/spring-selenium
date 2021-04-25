package com.udemy.spring.springselenium.page.google.flights;

import com.udemy.spring.springselenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class FlightPage extends Base {

    @FindBy(css = "span[jsname='iSelEd']")
    private List<WebElement> elements;

    public void goTo(final String url){
        this.driver.get(url);
    }

    public List<String> getLabels(){
        this.elements
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.elements.isEmpty());
    }
}

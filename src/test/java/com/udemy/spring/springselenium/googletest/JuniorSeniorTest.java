package com.udemy.spring.springselenium.googletest;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import com.udemy.spring.springselenium.googletest.scope.JuniorEngineer;
import com.udemy.spring.springselenium.googletest.scope.SeniorEngineer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class JuniorSeniorTest extends SpringBaseTestNGTest {

    @Autowired
    private JuniorEngineer junior;

    @Autowired
    private SeniorEngineer senior;

    @Test
    public void scopeTest() {

        this.junior.setAmount(100);
        System.out.println("Junior: " + this.junior.getSalary().getAmount());
        this.senior.setAmount(200);
        System.out.println("Senior: " + this.senior.getSalary().getAmount());
        System.out.println("Junior: " + this.junior.getSalary().getAmount());

    }
}

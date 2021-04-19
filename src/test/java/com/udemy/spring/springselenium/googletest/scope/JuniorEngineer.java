package com.udemy.spring.springselenium.googletest.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JuniorEngineer {

    @Autowired
    private Salary salary;

    public Salary getSalary() {
        return salary;
    }


    public void setAmount(int amount){
        this.salary.setAmount(amount);
    }
}

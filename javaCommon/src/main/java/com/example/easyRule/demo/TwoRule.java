package com.example.easyRule.demo;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "能否被2整除", description = "能否被2整除，如果可以打印出 number is '偶数'")
public class TwoRule {

    @Condition
    public boolean condition(@Fact("num") int num) {
        return num % 2 == 0;
    }

    @Action
    public void action(@Fact("num") int num) {
        System.out.println(String.format("%s is '偶数'", num));
    }
}

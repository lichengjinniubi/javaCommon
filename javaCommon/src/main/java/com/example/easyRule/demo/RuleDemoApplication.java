package com.example.easyRule.demo;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

public class RuleDemoApplication {



    public static void main(String[] args) {
        RulesEngine rulesEngine = new DefaultRulesEngine();

        Rules rules = new Rules();
        rules.register(new TwoRule());

        Facts facts = new Facts();
        facts.put("num",10);

        rulesEngine.fire(rules, facts);
    }
}

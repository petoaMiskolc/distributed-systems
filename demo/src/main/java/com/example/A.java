package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by berci on 2016.09.12..
 */
@Component
public class A {

    Greeter g;

    @Autowired
    public A(Greeter g) {
        this.g = g;
    }

    public void hello() {
        g.hello();
    }
}

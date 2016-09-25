package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by berci on 2016.09.12..
 */
public class B implements Greeter {

    public void hello() {
        System.out.println("Hello bello");
    }
}

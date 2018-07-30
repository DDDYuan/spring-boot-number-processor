package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class SpringBootApp implements ApplicationRunner {
    private final NumberProcessor numberProcessor;

    @Autowired
    public SpringBootApp(NumberProcessor numberProcessor) {
        this.numberProcessor = numberProcessor;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(numberProcessor.process(new Scanner(System.in).nextLine()));
    }
}

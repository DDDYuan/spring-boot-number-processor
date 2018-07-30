package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Profile("divide")
@Component
public class DivideProcessor implements Processor {
    private final int divisor;

    @Autowired
    public DivideProcessor(@Value("${processor.divisor}")int divisor) {
        this.divisor = divisor;
    }

    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().map(number -> number / this.divisor).collect(Collectors.toList());
    }
}

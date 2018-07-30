package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Profile("multiply")
@Component
public class MultiplyProcessor implements Processor {
    private final int multiplier;

    @Autowired
    public MultiplyProcessor(@Value("${processor.multiplier}") int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().map(number -> number * this.multiplier).collect(Collectors.toList());
    }
}

package com.thoughtworks.training.springbootapp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Profile("even")
@Component
public class EvenFilter implements Processor {

    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
    }
}

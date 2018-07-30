package com.thoughtworks.training.springbootapp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Profile("odd")
@Component
public class OddFilter implements Processor {
    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
    }
}

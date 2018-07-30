package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Profile("plus")
@Component
public class PlusProcessor implements Processor {
    private final int append;

    @Autowired
    public PlusProcessor(@Value("${processor.plus}") int append) {
        this.append = append;
    }

    @Override
    public List<Integer> process(List<Integer> input) {
        return input.stream().map(number -> number + this.append).collect(Collectors.toList());
    }
}

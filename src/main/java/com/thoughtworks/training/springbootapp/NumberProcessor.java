package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class NumberProcessor {
    private final List<Processor> processorList;

    @Autowired
    NumberProcessor(List<Processor> processors) {
        this.processorList = processors;
    }

    public String process(String input) {
        List<Integer> values = Arrays.stream(input.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        for (Processor processor : this.processorList) {
            values = processor.process(values);
        }
        return String.join(" ", values.stream().map(String::valueOf).collect(Collectors.toList()));
    }
}

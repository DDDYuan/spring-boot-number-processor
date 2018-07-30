package com.thoughtworks.training.springbootapp;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Processor {
    List<Integer> process(List<Integer> input);
}

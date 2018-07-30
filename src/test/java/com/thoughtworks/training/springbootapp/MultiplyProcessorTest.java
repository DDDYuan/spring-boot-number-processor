package com.thoughtworks.training.springbootapp;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MultiplyProcessorTest {

    @Test
    public void shouldMultiplyList() {
        assertThat(new MultiplyProcessor(2).process(Arrays.asList(1, 2, 3)), is(Arrays.asList(2, 4, 6)));
    }
}
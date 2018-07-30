package com.thoughtworks.training.springbootapp;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlusProcessorTest {
    @Test
    public void shouldPlusOneToList() {
        assertThat(new PlusProcessor(1).process(Arrays.asList(1, 2, 3)), is(Arrays.asList(2, 3, 4)));
    }

    @Test
    public void shouldMinusOneToList() {
        assertThat(new PlusProcessor(-1).process(Arrays.asList(2, 3, 4)), is(Arrays.asList(1, 2, 3)));
    }
}
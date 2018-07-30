package com.thoughtworks.training.springbootapp;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EvenFilterTest {
    @Test
    public void shouldFilterEven() {
        assertThat(new EvenFilter().process(Arrays.asList(1, 2, 3, 4, 5)), is(Arrays.asList(1, 3, 5)));
    }
}
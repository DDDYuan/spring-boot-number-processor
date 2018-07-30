package com.thoughtworks.training.springbootapp;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OddFilterTest {

    @Test
    public void shouldFilterOdd() {
        assertThat(new OddFilter().process(Arrays.asList(1, 2, 3, 4, 5)), is(Arrays.asList(2, 4)));
    }
}
package com.thoughtworks.training.springbootapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAppApplicationTests {
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Autowired
    private SpringBootApp springBootApp;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(originalOut));
    }

    @Test
    public void shouldListNumbersCorrectly() {
        System.setIn(new ByteArrayInputStream("1 2 3 4 5".getBytes()));
        springBootApp.run(new DefaultApplicationArguments(new String[]{}));
        assertThat(out.toString(), is("3 5 7\n"));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }
}

package com.thoughtworks.training.springbootapp;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.internal.InOrderImpl;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class NumberProcessorTest {
    @Test
    public void shouldProcessAllProcessors() {
        Processor processor1 = mock(Processor.class);
        Processor processor2 = mock(Processor.class);
        when(processor1.process(Arrays.asList(1, 2, 3, 4, 5))).thenReturn(Arrays.asList(1, 3, 5));
        when(processor2.process(Arrays.asList(1, 3, 5))).thenReturn(Arrays.asList(2, 4, 6));
        InOrder inOrder = new InOrderImpl(Arrays.asList(processor1, processor2));
        NumberProcessor numberProcessor = new NumberProcessor(Arrays.asList(processor1, processor2));

        assertThat(numberProcessor.process("1 2 3 4 5"), is("2 4 6"));
        inOrder.verify(processor1, times(1)).process(Arrays.asList(1, 2, 3, 4, 5));
        inOrder.verify(processor2, times(1)).process(Arrays.asList(1, 3, 5));
    }
}

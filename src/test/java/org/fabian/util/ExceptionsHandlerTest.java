package org.fabian.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.fabian.util.ExceptionsHandler.PRICE_NOT_FOUND;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExceptionsHandlerTest {

    private ExceptionsHandler exceptionsHandler;

    @BeforeEach
    public void setUp() {
        exceptionsHandler = new ExceptionsHandler();
    }

    @Test
    public void badRequest_shouldReturnPriceNotFound() {
        //Given
        //When
        final String result = exceptionsHandler.badRequest(new RuntimeException());
        //Then
        assertThat(result, is(PRICE_NOT_FOUND));
    }
}

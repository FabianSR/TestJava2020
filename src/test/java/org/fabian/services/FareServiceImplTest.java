package org.fabian.services;

import org.fabian.domain.model.Brand;
import org.fabian.domain.model.Fare;
import org.fabian.domain.model.Product;
import org.fabian.persistence.FareDao;
import org.fabian.persistence.mapper.FareDomainToFareEntityMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class FareServiceImplTest {

    @Mock
    private FareDomainToFareEntityMapper mapperMock;
    @Mock
    private FareDao fareDaoMock;
    @InjectMocks
    private FareServiceImpl pruebaController;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(mapperMock.mapToFareDomain(any(org.fabian.persistence.entities.Fare.class))).thenReturn(new Fare());
    }

    @Test
    public void getFare_withCorrectFare_shouldReturnFareFound() {
        //Given
        when(fareDaoMock.findAllByBrandBrandIdAndProductProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(any(), any(), any(), any())).thenReturn(Collections.singletonList(new org.fabian.persistence.entities.Fare()));
        //When
        final Fare result = pruebaController.getFare(getFilledFare());
        //Then
        assertThat(result, is(not(nullValue())));
        verify(fareDaoMock, atLeastOnce()).findAllByBrandBrandIdAndProductProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(any(), any(), any(), any());
        verify(mapperMock, atLeastOnce()).mapToFareDomain(any());
    }

    @Test
    public void getFare_withFareWithWrongBrandId_shouldThrowRuntimeException() {
        //Given
        when(fareDaoMock.findAllByBrandBrandIdAndProductProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(any(), any(), any(), any())).thenReturn(Collections.EMPTY_LIST);
        //Then, When
        assertThrows(IllegalArgumentException.class, () -> pruebaController.getFare(getFilledFare()));
    }

    private Fare getFilledFare() {
        final Fare inputFare = new Fare();
        inputFare.setBrand(new Brand());
        inputFare.setProduct(new Product());
        return inputFare;
    }
}

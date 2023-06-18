package controller;

import org.fabian.controller.FareController;
import org.fabian.controller.mapper.FareDtoToFareDomainMapper;
import org.fabian.domain.model.Fare;
import org.fabian.services.FareService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class FareControllerTest {

    @Mock
    private FareService fareServiceMock;
    @Mock
    private FareDtoToFareDomainMapper mapperMock;

    @InjectMocks
    private FareController fareController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getFare_shouldCallToService() {
        //Given
        //When
        fareController.getFare(null);
        //Then
        verify(mapperMock, atLeastOnce()).mapToFareDomain(any());
        verify(mapperMock, atLeastOnce()).mapToFareDto(any());
        verify(fareServiceMock, atLeastOnce()).getFare(any());
    }
}

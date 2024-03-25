package com.flight.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTest {
    
    private Flight flight;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;

    @BeforeEach
    void setUp() {
        // Setting up a flight with known parameters before each test
        departureDate = LocalDateTime.of(2024, Month.MARCH, 14, 10, 0);
        arrivalDate = LocalDateTime.of(2024, Month.MARCH, 14, 12, 0);
        flight = new Flight("AB123", "New York", "London", departureDate, arrivalDate);
    }

    @Test
    void testFlightConstructor() {
        assertEquals("AB123", flight.getFlightNo());
        assertEquals("New York", flight.getOrigin());
        assertEquals("London", flight.getDestination());
        assertEquals(departureDate, flight.getDepartureDate());
        assertEquals(arrivalDate, flight.getArrivalDate());
    }

    @Test
    void testFlightNoSetterAndGetter() {
        flight.setFlightNo("CD456");
        assertEquals("CD456", flight.getFlightNo());
    }

    @Test
    void testOriginSetterAndGetter() {
        flight.setOrigin("Los Angeles");
        assertEquals("Los Angeles", flight.getOrigin());
    }

    @Test
    void testDestinationSetterAndGetter() {
        flight.setDestination("Tokyo");
        assertEquals("Tokyo", flight.getDestination());
    }

    @Test
    void testDepartureDateSetterAndGetter() {
        LocalDateTime newDepartureDate = LocalDateTime.of(2024, Month.MARCH, 15, 11, 0);
        flight.setDepartureDate(newDepartureDate);
        assertEquals(newDepartureDate, flight.getDepartureDate());
    }

    @Test
    void testArrivalDateSetterAndGetter() {
        LocalDateTime newArrivalDate = LocalDateTime.of(2024, Month.MARCH, 15, 13, 30);
        flight.setArrivalDate(newArrivalDate);
        assertEquals(newArrivalDate, flight.getArrivalDate());
    }
    
    // More test cases can be added to test business logic methods if they were defined.
}


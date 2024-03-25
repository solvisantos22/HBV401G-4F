package com.flight.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void testPassengerCreationAndGetters() {
        Passenger passenger = new Passenger("John Doe", "1234567890");
        assertEquals("John Doe", passenger.getName());
        assertEquals("1234567890", passenger.getSocialSecurityNo());
    }

    @Test
    void testPassengerSetters() {
        Passenger passenger = new Passenger("John Doe", "1234567890");
        
        passenger.setName("Jane Doe");
        passenger.setSocialSecurityNo("3213213212");
        
        assertEquals("Jane Doe", passenger.getName());
        assertEquals("3213213212", passenger.getSocialSecurityNo());
    }
}

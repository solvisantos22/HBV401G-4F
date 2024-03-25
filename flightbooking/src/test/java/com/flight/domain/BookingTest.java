package com.flight.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookingTest {

    private Booking booking;
    private User user;
    private Flight flight1;
    private Flight flight2;
    private Passenger passenger1;
    private Passenger passenger2;

    @BeforeEach
    void setUp() {
        user = new User("Alice Johnson", 1, "alice@example.com", 123456789);
        
        flight1 = new Flight("FL100", "CityA", "CityB",
                LocalDateTime.of(2024, 1, 1, 10, 30),
                LocalDateTime.of(2024, 1, 1, 12, 30));
        
        flight2 = new Flight("FL200", "CityB", "CityC",
                LocalDateTime.of(2024, 1, 2, 13, 30),
                LocalDateTime.of(2024, 1, 2, 15, 30));
        
        passenger1 = new Passenger("John Doe", "1111111111");
        passenger2 = new Passenger("Jane Smith", "2222222222");

        List<Flight> flights = new ArrayList<>(Arrays.asList(flight1));
        List<Passenger> passengers = new ArrayList<>(Arrays.asList(passenger1));

        booking = new Booking("BK001", user, flights, passengers);
    }

    @Test
    void testBookingConstructorAndGetter() {
        assertEquals("BK001", booking.getBookingNo());
        assertEquals(user, booking.getUser());
        assertTrue(booking.getFlights().contains(flight1));
        assertTrue(booking.getPassengers().contains(passenger1));
    }

    @Test
    void testSetBookingNo() {
        booking.setBookingNo("BK002");
        assertEquals("BK002", booking.getBookingNo());
    }

    @Test
    void testSetUser() {
        User newUser = new User("Bob Brown", 2, "bob@example.com", 987654321);
        booking.setUser(newUser);
        assertEquals(newUser, booking.getUser());
    }

    @Test
    void testAddFlight() {
        booking.addFlight(flight2);
        assertTrue(booking.getFlights().contains(flight2));
        assertEquals(2, booking.getFlights().size());
    }

    @Test
    void testAddPassenger() {
        booking.addPassenger(passenger2);
        assertTrue(booking.getPassengers().contains(passenger2));
        assertEquals(2, booking.getPassengers().size());
    }
}


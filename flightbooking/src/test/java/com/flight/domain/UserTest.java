package com.flight.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

class UserTest {

    private User user;
    private Booking booking1;
    private Booking booking2;

    @BeforeEach
    void setUp() {
        user = new User("John Doe", 1, "johndoe@example.com", 1234567);

        Passenger passenger1 = new Passenger("John Smith", "1234567");
        Passenger passenger2 = new Passenger("Jane Doe", "07654321");


        List<Passenger> passengersList1 = Arrays.asList(passenger1);
        List<Passenger> passengersList2 = Arrays.asList(passenger2);

    
        LocalDateTime departure1 = LocalDateTime.of(2024, 3, 14, 10, 0);
        LocalDateTime arrival1 = LocalDateTime.of(2024, 3, 14, 12, 0);
        Flight flight1 = new Flight("FL123", "New York", "London", departure1, arrival1);

        LocalDateTime departure2 = LocalDateTime.of(2024, 3, 16, 15, 0);
        LocalDateTime arrival2 = LocalDateTime.of(2024, 3, 16, 17, 0);
        Flight flight2 = new Flight("FL456", "London", "Paris", departure2, arrival2);

        
        List<Flight> flightsList1 = Arrays.asList(flight1);
        List<Flight> flightsList2 = Arrays.asList(flight2);
        
        booking1 = new Booking("BK1001", user, flightsList1, passengersList1);
        booking2 = new Booking("BK1002", user, flightsList2, passengersList2);

    }

    @Test
    void testUserCreationAndGetters() {
        assertEquals("John Doe", user.getName());
        assertEquals(1, user.getUserId());
        assertEquals("johndoe@example.com", user.getEmail());
        assertEquals(1234567, user.getPhone());
        assertNotNull(user.getBookings());
        assertTrue(user.getBookings().isEmpty());
    }

    @Test
    void testUserSetters() {
        user.setName("Jane Doe");
        user.setUserId(2);
        user.setEmail("janedoe@example.com");
        user.setPhone(7654321);

        assertEquals("Jane Doe", user.getName());
        assertEquals(2, user.getUserId());
        assertEquals("janedoe@example.com", user.getEmail());
        assertEquals(7654321, user.getPhone());
    }


    @Test
    void testAddAndCancelBooking() {
        user.addBooking(booking1);
        System.out.println(user);
        assertEquals(1, user.getBookings().size());

        user.addBooking(booking2);
        assertTrue(user.getBookings().contains(booking2));
        assertEquals(2, user.getBookings().size());

        user.cancelBooking(booking1);
        assertFalse(user.getBookings().contains(booking1));
        assertEquals(1, user.getBookings().size());

        user.cancelBooking(booking2);
        assertFalse(user.getBookings().contains(booking2));
        assertTrue(user.getBookings().isEmpty());
    }

}


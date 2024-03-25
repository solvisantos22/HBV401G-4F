package com.flight.domain;
import java.util.List;

public class Booking {
    private List<Passenger> passengers;
    private List<Flight> flights;
    private User user;
    private String bookingNo;
    
    public Booking(String bookingNo, User user, List<Flight> flights, List<Passenger> passengers) {
        this.bookingNo = bookingNo;
        this.user = user;
        this.flights = flights;
        this.passengers = passengers;
    }

    // Getters and Setters
    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }
    
    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }
    
}

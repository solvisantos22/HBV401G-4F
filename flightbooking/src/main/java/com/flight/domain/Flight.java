package com.flight.domain;
import java.time.LocalDateTime;

public class Flight {
    private String flightNo;
    private String origin;
    private String destination;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;

    public Flight(String flightNo, String origin, String destination, LocalDateTime departureDate, LocalDateTime arrivalDate) {
        this.flightNo = flightNo;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    // Getters and setters
    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    
    @Override
    public String toString() {
        return "Flight{" + "\n" +
                "flightNo=" + flightNo + "\n" +
                "origin=" + origin + "\n" +
                "destination='" + destination + "\n" +
                "departureDate=" + departureDate + "\n" +
                "arrivalDate=" + arrivalDate + "\n" +
                '}';
    }
}


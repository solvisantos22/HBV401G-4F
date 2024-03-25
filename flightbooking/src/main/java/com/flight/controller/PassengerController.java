package com.flight.controller;


import com.flight.domain.Passenger;
import com.flight.database.PassengerDB;

public class PassengerController {
    private final PassengerDB passengerDB;

    public PassengerController(PassengerDB passengerDB) {
        this.passengerDB = passengerDB;
    }

    public Passenger findPassenger(String socialSecurityNo) {
        return passengerDB.selectBySocialSecurityNo(socialSecurityNo);
    }

    public void createPassenger(Passenger passenger) {
        if (passengerDB.selectBySocialSecurityNo(passenger.getSocialSecurityNo()) != null) {
            passengerDB.insert(passenger);
        } else {
        
        }
    }

    public void deletePassenger(Passenger passenger) {
        passengerDB.delete(passenger);
    }

}


package com.flight.database;

import com.flight.domain.Passenger;
import java.util.ArrayList;
import java.util.List;

public class PassengerDB {
    private List<Passenger> passengers = new ArrayList<>();

    public PassengerDB() {
        passengers = new ArrayList<>();
    }

    public Passenger selectBySocialSecurityNo(String socialSecurityNo) {
        for (Passenger passenger : passengers) {
            if (passenger.getSocialSecurityNo().equals(socialSecurityNo)) {
                System.out.println("Fundin:" + passenger);
                return passenger;
            }
        }
        return null;
    }

    public void insert(Passenger passenger) {

        passengers.add(passenger);
    }

    public void delete(Passenger passenger) {
        if (passenger != null) {
            passengers.removeIf(p -> p.getSocialSecurityNo().equals(passenger.getSocialSecurityNo()));
        }
    }

    public List<Passenger> getAllPassengers() {
        return new ArrayList<>(passengers);
    }
}

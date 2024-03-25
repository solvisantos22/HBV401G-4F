package com.flight.database;

import com.flight.domain.Passenger;
import java.util.ArrayList;
import java.util.List;


public class PassengerDB {

    private List<Passenger> passengerList = new ArrayList<>();

    public void insert(Passenger passenger) {
        passengerList.add(passenger);
    }

    public void delete(Passenger passenger) {
        passengerList.remove(passenger);
    }

    public Passenger selectBySocialSecurityNo(String socialSecurityNo) {
        return passengerList.stream()
                .filter(p -> p.getSocialSecurityNo().equals(socialSecurityNo))
                .findFirst()
                .orElse(null);
    }

    public List<Passenger> selectAll() {
        return new ArrayList<>(passengerList);
    }
}

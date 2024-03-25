package com.flight.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int userId;
    private String email;
    private int phone;
    private List<Booking> bookings;

    public User(String name, int userId, String email, int phone) {
        this.name = name;
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.bookings = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        if (!bookings.contains(booking)) {
            bookings.add(booking);
        }
    }

    public void cancelBooking(Booking booking) {
        bookings.remove(booking);
    }

    @Override
    public String toString() {
        return "User{" + "\n" +
                "name=" + name + "\n" +
                "userId=" + userId +
                "email=" + email + "\n" +
                "phone=" + phone + "\n" +
                "bookings=" + bookings + "\n" +
                "}";
    }

}


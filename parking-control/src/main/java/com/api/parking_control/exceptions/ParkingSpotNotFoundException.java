package com.api.parking_control.exceptions;

public class ParkingSpotNotFoundException extends RuntimeException {
    public ParkingSpotNotFoundException(String message) {
        super(message);
    }
}
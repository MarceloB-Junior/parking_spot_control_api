package com.api.parking_control.exceptions;

public class ParkingSpotNumberAlreadyInUseException extends RuntimeException {
    public ParkingSpotNumberAlreadyInUseException(String message) {
        super(message);
    }
}
package com.api.parking_control.exceptions;

public class LicensePlateAlreadyInUseException extends RuntimeException {
    public LicensePlateAlreadyInUseException(String message) {
        super(message);
    }
}
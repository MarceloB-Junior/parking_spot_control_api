package com.api.parking_control.exceptions;

import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ParkingSpotNotFoundException.class)
    public ResponseEntity<String> handleParkingSpotNotFound(@NotNull ParkingSpotNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(LicensePlateAlreadyInUseException.class)
    public ResponseEntity<String> handleLicensePlateAlreadyInUse(@NotNull LicensePlateAlreadyInUseException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(ParkingSpotNumberAlreadyInUseException.class)
    public ResponseEntity<String> handleParkingSpotNumberAlreadyInUse(@NotNull ParkingSpotNumberAlreadyInUseException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(ApartmentBlockConflictException.class)
    public ResponseEntity<String> handleApartmentBlockConflict(@NotNull ApartmentBlockConflictException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }
}

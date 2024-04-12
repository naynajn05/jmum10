//Program to demonstrate User Defined Exception class
package com.tns.test;

public class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("Invalid age.");
    }

    InvalidAgeException(String message) {
        super(message);
    }
}









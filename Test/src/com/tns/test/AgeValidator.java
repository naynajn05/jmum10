//Program to demonstrate user defined exception handling
package com.tns.test;

public class AgeValidator {
      static void validateAge(int age) throws InvalidVoterException  {
      if (age<18) {
           throw new InvalidVoterException("Invalid age. You are not eligible to vote.");
       }
    } 
}



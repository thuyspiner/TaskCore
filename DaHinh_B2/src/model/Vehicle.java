package model;


public abstract class Vehicle {
 protected double ticketPrice;
 protected int numberOfSeats;

 public Vehicle(double ticketPrice, int numberOfSeats) {
     this.ticketPrice = ticketPrice;
     this.numberOfSeats = numberOfSeats;
 }

 public abstract void printTicket();
}

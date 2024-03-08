package model;


public class Car extends Vehicle {
 private String type;

 public Car(double ticketPrice, int numberOfSeats, String type) {
     super(ticketPrice, numberOfSeats);
     this.type = type;
 }

 @Override
 public void printTicket() {
     System.out.println("Vé car:");
     System.out.println("Giá vé: " + ticketPrice);
     System.out.println("Số ghế ngồi: " + numberOfSeats);
     System.out.println("Loại xe: " + type);
 }
}



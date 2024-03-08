package model;

public class Train extends Vehicle {
 private int numberOfCoaches;

 public Train(double ticketPrice, int numberOfSeats, int numberOfCoaches) {
     super(ticketPrice, numberOfSeats);
     this.numberOfCoaches = numberOfCoaches;
 }

 @Override
 public void printTicket() {
     System.out.println("Vé tàu:");
     System.out.println("Giá vé: " + ticketPrice);
     System.out.println("Số ghế ngồi: " + numberOfSeats);
     System.out.println("Số toa tàu: " + numberOfCoaches);
 }
}


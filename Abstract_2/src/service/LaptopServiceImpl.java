package service;


import model.Laptop;

import java.util.Scanner;

public class LaptopServiceImpl implements LaptopService {
 @Override
 public void input(Laptop lt) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Nhập laptop ID:");
     int id = scanner.nextInt();
     lt.setId(id);
     scanner.nextLine(); 
     System.out.println("Nhập laptop CPU:");
     String cpu = scanner.nextLine();
     lt.setCpu(cpu);
     System.out.println("Nhập laptop RAM:");
     int ram = scanner.nextInt();
     lt.setRam(ram);
     scanner.nextLine(); 
     System.out.println("Nhập laptop VGA:");
     String vga = scanner.nextLine();
     lt.setVga(vga);
 }

 @Override
 public void info(Laptop lt) {
     System.out.println("Thông tin laptop:");
     System.out.println("ID: " + lt.getId());
     System.out.println("CPU: " + lt.getCpu());
     System.out.println("RAM: " + lt.getRam());
     System.out.println("VGA: " + lt.getVga());
 }
}


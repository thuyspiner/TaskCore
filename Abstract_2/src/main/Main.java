package main;

import model.Laptop;
import service.LaptopService;
import service.LaptopServiceImpl;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(0, null, 0, null);
        LaptopService laptopService = new LaptopServiceImpl();

        laptopService.input(laptop);
        laptopService.info(laptop);
    }
}
package service;

import model.Address;

import java.util.Scanner;

public class AddressServiceImpl implements AddressService {
    @Override
    public void input(Address address) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã địa chỉ");
        int id = scanner.nextInt();
        address.setId(id);
        scanner.nextLine(); 
        System.out.println("Nhập địa chỉ:");
        String street = scanner.nextLine();
        address.setStreet(street);
        System.out.println("Nhập thành phố:");
        String city = scanner.nextLine();
        address.setCity(city);
    }

    @Override
    public void info(Address address) {
        System.out.println("Nhập thông tin địa chỉ chi tiết");
        System.out.println("ID: " + address.getId());
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
    }
}
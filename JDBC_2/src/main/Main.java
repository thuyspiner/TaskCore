package main;

import java.util.List;

import dao.*;
import model.Bill;
import model.Product;

import java.sql.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	        Scanner scanner = new Scanner(System.in);
    	        ProductDAO productDao = new ProductDAOImpl();
    	        BillDAO billDao = new BillDAOImpl();

    	        while (true) {
    	            System.out.println("Menu");
    	            System.out.println("1. Tạo đơn hàng mới");
    	            System.out.println("2. Thoát");
    	            System.out.print("Chọn: ");
    	            int choice = scanner.nextInt();
    	            scanner.nextLine(); 

    	            switch (choice) {
    	                case 1:
    	                    System.out.print("Nhập ID sản phẩm: ");
    	                    int productId = scanner.nextInt();
    	                    scanner.nextLine(); 
    	                    System.out.print("Nhập số lượng: ");
    	                    int quantity = scanner.nextInt();
    	                    scanner.nextLine();

    	                    Product product = productDao.getProductById(productId);
    	                    if (product == null) {
    	                        System.out.println("Không tìm thấy sản phẩm với ID " + productId);
    	                        break;
    	                    }

    	                    if (product.getQuantity() < quantity) {
    	                        System.out.println("Không đủ số lượng sản phẩm trong kho!");
    	                        break;
    	                    }

    	                    double price = product.getPrice();
    	                    Date buyDate = new Date(System.currentTimeMillis()); 
    	                    Bill bill = new Bill(quantity, price, null, productId, buyDate);
    	                    boolean success = billDao.addBill(bill);

    	                    if (success) {
    	                        System.out.println("Đã tạo đơn hàng thành công!");
    	                        int newQuantity = product.getQuantity() - quantity;
    	                        product.setQuantity(newQuantity);
    	                        boolean updateSuccess = productDao.updateProduct(product);
    	                        if (updateSuccess) {
    	                            System.out.println("Cập nhật số lượng sản phẩm thành công!");
    	                        } else {
    	                            System.out.println("Cập nhật số lượng sản phẩm không thành công!");
    	                        }
    	                    } else {
    	                        System.out.println("Không thể tạo đơn hàng!");
    	                    }
    	                    break;
    	                case 2:
    	                    System.out.println("Đã thoát chương trình.");
    	                    System.exit(0);
    	                    break;
    	                default:
    	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
    	            }
    	        }
    	    
    	

    }
}






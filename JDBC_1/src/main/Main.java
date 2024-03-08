package main;

import java.util.List;
import java.util.Scanner;

import dao.CategoryDao;
import dao.ProductDao;
import model.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        CategoryDao categoryDao = new CategoryDao();
       
        ProductDao productDao = new ProductDao();

        
        System.out.println("category name: ");
        String categoryName = scanner.nextLine();
        Category category = new Category(categoryName);
        categoryDao.addCategory(category);

       
        System.out.println("product name: ");
        String productName = scanner.nextLine();
        System.out.println("product quantity: ");
        int productQuantity = scanner.nextInt();
        System.out.println("product price: ");
        double productPrice = scanner.nextDouble();
        System.out.println("category ID for product: ");
        int categoryId = scanner.nextInt();
        Product product = new Product(productName, productQuantity, productPrice, categoryId);
        productDao.addProduct(product);

        
        List<Product> allProducts = productDao.getAllProducts();
        System.out.println("All product:");
        for (Product p : allProducts) {
            System.out.println("Product ID: " + p.getId() + ", Name: " + p.getName() + ", Quantity: " + p.getQuantity() + ", Price: " + p.getPrice() + ", Category ID: " + p.getCategoryId());
        }

       
        System.out.println("Nhập ID danh mục để nhận sản phẩm: ");
        int catId = scanner.nextInt();
        List<Product> productsByCategory = productDao.getProductsByCategoryId(catId);
        System.out.println("Sản phẩm trong danh mục ID " + catId + ":");
        for (Product p : productsByCategory) {
            System.out.println("Product ID: " + p.getId() + ", Name: " + p.getName() + ", Quantity: " + p.getQuantity() + ", Price: " + p.getPrice() + ", Category ID: " + p.getCategoryId());
        }

        scanner.close();
    }
}


       

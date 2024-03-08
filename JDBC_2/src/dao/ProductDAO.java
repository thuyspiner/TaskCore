package dao;

import model.Product;


public interface ProductDAO {
    Product getProductById(int id);
    boolean updateProduct(Product product);
}


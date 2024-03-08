package dao;

import dao.DBConnection;
import model.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public Product getProductById(int id) {
        String sql = "SELECT id, name, quantity, price, categoryId FROM Product WHERE id = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int productId = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int quantity = resultSet.getInt("quantity");
                    double price = resultSet.getDouble("price");
                    int categoryId = resultSet.getInt("categoryId");
                    return new Product(productId, name, quantity, price, categoryId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateProduct(Product product) {
        String sql = "UPDATE Product SET quantity = ? WHERE id = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, product.getQuantity());
            preparedStatement.setInt(2, product.getProductId());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

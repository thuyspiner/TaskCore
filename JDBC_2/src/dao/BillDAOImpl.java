package dao;


import dao.DBConnection;
import model.Bill;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillDAOImpl implements BillDAO {


	    @Override
	    public boolean addBill(Bill bill) {
	        String sql = "INSERT INTO Bill (quantity, price, product_id, buy_date) VALUES (?, ?, ?, ?)";
	        try (Connection connection = DBConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	            preparedStatement.setInt(1, bill.getQuantitys());
	            preparedStatement.setDouble(2, bill.getPrice());
	            preparedStatement.setInt(3, bill.getProductId()); 
	            preparedStatement.setDate(4, new java.sql.Date(bill.getBuyDate().getTime()));
	            int rowsAffected = preparedStatement.executeUpdate();
	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

}


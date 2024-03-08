package model;

import java.util.Date;

import java.sql.*;

public class Bill {
    private int quantitys;
    private double price;
    private String product;
    private int productId;
    private Date buyDate;
    public Bill() {
    	
    }
	public Bill(int quantitys, double price, String product, int productId, Date buyDate) {
		super();
		this.quantitys = quantitys;
		this.price = price;
		this.product = product;
		this.productId = productId;
		this.buyDate = buyDate;
	}
	public int getQuantitys() {
		return quantitys;
	}
	public void setQuantitys(int quantitys) {
		this.quantitys = quantitys;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	
	
    
}


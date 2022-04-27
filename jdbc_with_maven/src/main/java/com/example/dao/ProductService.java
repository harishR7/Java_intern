package com.example.dao;
import java.sql.*;
import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.example.entity.*;

public class ProductService {
	
	private Connection con;
	

	public ProductService(Connection con) {
		super();
		this.con=con;
	}
	
	
	
	
	public List<Product> findAll(){
		
		List<Product> productList=new ArrayList<Product>();
		String sql="select * from harish_product";
		try(PreparedStatement pstmt= con.prepareStatement(sql)){
			
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			
			int productId=rs.getInt("product_id");
			String productName=rs.getString("product_name");
			double price =rs.getDouble("price");
			
			Product prod=new Product(productId, productName, price);
			productList.add(prod);
		}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	
	
	
	public int addproduct(Product product) {
		int rowAdded=0;
		String sql="insert into  harish_product values(?,?,?)";
		try(PreparedStatement pstmt= con.prepareStatement(sql)){
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			
			rowAdded=pstmt.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}

	
	
	
	
	public int deleteById(int id) {
		int rowsDeleted=0;
		
		String sql="Delete from harish_product where  product_id=?";
		try(PreparedStatement pstmt =con.prepareStatement(sql)){
			
			pstmt.setInt(1, id);
			rowsDeleted=pstmt.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return rowsDeleted;
		
		
	}
	
	
	
	
	
	
	public Optional<Product> findbyId(int id){
		Optional<Product>obj=Optional.empty();
		
		
		String sql="select * from harish_product where product_id=?";
		
		try(PreparedStatement ptsmt= con.prepareStatement(sql)){
			
			ptsmt.setInt(1, id);
			
			ResultSet rs=ptsmt.executeQuery();
			
			
			if(rs.next()) {
				
				int productId=rs.getInt("product_id");
				String productName=rs.getString("product_name");
				double price =rs.getDouble("price");
				
				Product prod= new Product(productId, productName, price);
				obj=Optional.of(prod);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return obj;  
	}
	
	
	public int updatepriceByName (String productName,double newPrice) {
		
		int rowUpdate=0;
		String sql="update harish_product set price =? where product_name=?";
		try( PreparedStatement ptsmt=con.prepareStatement(sql)){
			
			ptsmt.setDouble(1, newPrice);
			ptsmt.setString(2,productName);
			
			rowUpdate=ptsmt.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowUpdate;
	}
	
}

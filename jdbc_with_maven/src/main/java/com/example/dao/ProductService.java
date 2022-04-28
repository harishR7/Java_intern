package com.example.dao;
import java.sql.*;
import java.util.*;



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
	
	
	public void usingtxn(Product prd1,Product prd2) {
		String sql="insert into harish_product values(?,?,?)";
		
		try(PreparedStatement loanpstmt=con.prepareStatement(sql)){
			
			con.setAutoCommit(false);
			loanpstmt.setInt(1, prd1.getProductId());
			loanpstmt.setString(2, prd1.getProductName());
			loanpstmt.setDouble(3, prd1.getPrice());
			
			int rowAdded=loanpstmt.executeUpdate();
			loanpstmt.setInt(1, prd2.getProductId());
			loanpstmt.setString(2, prd2.getProductName());
			loanpstmt.setDouble(3, prd2.getPrice());
			int rowAdded2=loanpstmt.executeUpdate();
			
			if(prd2.getPrice()>prd1.getPrice()) {
				con.commit();
			}
			else {
				con.rollback();
			}
			
			
			System.out.println("Row Add="+rowAdded+","+rowAdded2);
			
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void usingtxnWithCatchException(Product prd1,Invoice invoice) {
		String prosql="insert into harish_product values(?,?,?)";
		String invoicesql="insert into harish_invoice values(?,?,?,?)";
		
		try(PreparedStatement propstmt=con.prepareStatement(prosql);
				PreparedStatement invoicepstmt=con.prepareStatement(invoicesql)
				){
			
			con.setAutoCommit(false);
			propstmt.setInt(1, prd1.getProductId());
			propstmt.setString(2, prd1.getProductName());
			propstmt.setDouble(3, prd1.getPrice());
			
			int rowAdded=propstmt.executeUpdate();
			invoicepstmt.setInt(1, invoice.getInvoiceNumber());
			invoicepstmt.setString(2, invoice.getInvoiceCusName());
			invoicepstmt.setInt(3, invoice.getQuality());
			invoicepstmt.setInt(4, invoice.getProductRef());
			int rowAdded2=invoicepstmt.executeUpdate();
			
			con.commit();
			
			System.out.println("Row Add="+rowAdded+","+rowAdded2);
			
		}
		
		catch(SQLException e) {
			e.printStackTrace();
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
}

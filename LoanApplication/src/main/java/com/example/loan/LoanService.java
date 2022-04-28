package com.example.loan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.example.CrudRepository;
import com.example.customer.Customer;

public class LoanService implements CrudRepository<LoanApplication>  {
	
	private Connection con;

	public LoanService(Connection con) {
		super();
		// TODO Auto-generated constructor stub
		this.con=con;
	}
////////////////////////////////////////////////////////////////////////////////////////////
	public int add(LoanApplication obj) {
		int rowAdded=0;
		String sql="insert into harish_load_application values(?,?,?)";
		String sql1=" insert into harish_customer values(?,?,?,?)";
		
		try(PreparedStatement ptsmt =con.prepareStatement(sql);
			PreparedStatement ptsmt1=con.prepareStatement(sql1)){
				ptsmt1.setInt(1, obj.getCustomer().getCustomerId());
				ptsmt1.setString(2, obj.getCustomer().getCustomerName());
				ptsmt1.setLong(3, obj.getCustomer().getPhoneNumber());
				ptsmt1.setDouble(4, obj.getCustomer().getCreditScore());
				
				ptsmt1.executeUpdate();
				
				ptsmt.setLong(1,obj.getApplicationNumber() );
				ptsmt.setInt(2, obj.getCustomer().getCustomerId());
				ptsmt.setDouble(3, obj.getLoanAmount());
				
				rowAdded=ptsmt.executeUpdate();
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}
///////////////////////////////////////////////////////////////////////////////////////////
	public List<LoanApplication> findAll() {
		
		
		// TODO Auto-generated method stub
		List<LoanApplication>list=new ArrayList<LoanApplication>();
		
		
		String sql="Select * from harish_customer cus left outer join harish_load_application ap on cus.customer_id=ap.customer";
		
		try(PreparedStatement ptsmt=con.prepareStatement(sql)){
			
			ResultSet rs=ptsmt.executeQuery();
			while(rs.next()) {
			// customer details
			int customerId=rs.getInt("customer_id");
			String customerName=rs.getString("customer_name");
			long phoneNumber =rs.getLong("phone_number");
			double creditScore=rs.getDouble("credit_score");
			//loan details
			long applicationNumber=rs.getLong("application_number");
			double loanAmount=rs.getDouble("loan_amount");
			
			
			
			Customer customer=new Customer(customerId, customerName, phoneNumber, creditScore);
			LoanApplication loan=new LoanApplication(applicationNumber, customer, loanAmount);
			
			list.add(loan);
			
				
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
////////////////////////////////////////////////////////////////////////////////////////////
	public LoanApplication findById(int id) {
		
	String sql="Select * from harish_customer cus left outer join harish_load_application ap on cus.customer_id=ap.customer where customer_id=?";
	LoanApplication obj=null;
	try(PreparedStatement ptsmt=con.prepareStatement(sql)){
		 ptsmt.setInt(1,id );
		ResultSet rs=ptsmt.executeQuery();
		if(rs.next()) {
			
			int customerId=rs.getInt("customer_id");
			String customerName=rs.getString("customer_name");
			long phoneNumber =rs.getLong("phone_number");
			double creditScore=rs.getDouble("credit_score");
			
			//loan details
			long applicationNumber=rs.getLong("application_number");
			double loanAmount=rs.getDouble("loan_amount");
			
			
			Customer customer=new Customer(customerId, customerName, phoneNumber, creditScore);
			 obj=new LoanApplication(applicationNumber, customer, loanAmount);
			
		}
	}
	catch(SQLException e) {
		
	}
		return obj;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int remove(int id) {
		// TODO Auto-generated method stub
		String sql="delete from harish_load_application where application_number=?";
		int rowRemove=0;
		try(PreparedStatement ptsmt=con.prepareStatement(sql)){
			ptsmt.setLong(1, id);
			rowRemove=ptsmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return rowRemove;
	}

	public int update(int Id, LoanApplication member) {
		String updateSql="update  harish_load_application set loan_amount=? where application_number =?";
		int rowUpdated=0;
		try(PreparedStatement updateptsmt=con.prepareStatement(updateSql)){
			
			updateptsmt.setDouble(1, member.getLoanAmount());
			updateptsmt.setInt(2,Id);
			rowUpdated=updateptsmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return rowUpdated;
	}

}

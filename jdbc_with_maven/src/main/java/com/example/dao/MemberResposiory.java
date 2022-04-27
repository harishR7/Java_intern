package com.example.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRespository;

public class MemberResposiory implements CrudRespository<Member> {
	
	private Connection con;

	public MemberResposiory(Connection con) {
		super();
		this.con=con;
	}

	public int add(Member obj) {
		int rowAdded=0;
		String sql="insert into harish_member values( ?,?,?,?,?,?,?,?)";
		try(PreparedStatement ptsmt =con.prepareStatement(sql)){
		    ptsmt.setInt(1, obj.getMemberId());
		    ptsmt.setString(2, obj.getMemberName());
		    ptsmt.setString(3, obj.getMemberAddress());
		    ptsmt.setDate(4, Date.valueOf(obj.getAccountpenDate()));
		    ptsmt.setString(5, obj.getMemberShipType());
		    ptsmt.setDouble(6, obj.getFeesPaid());
		    ptsmt.setInt(7, obj.getMaxBookAllowed());
		    ptsmt.setDouble(8, obj.getPenaltyAmount());
		  
		    
		    rowAdded=ptsmt.executeUpdate();
		    
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	public List<Member> findAll() {
		
		
		String sql="Select * from harish_member";
		List<Member> list=new ArrayList<>();
		try(PreparedStatement ptsmt=con.prepareStatement(sql)){
			
			ResultSet rs= ptsmt.executeQuery();
			
			while(rs.next()) {
				
				
				int memberId = rs.getInt("MEMBER_ID");
				String memberName=rs.getString("MEMBER_NAME");
				String memberAddress=rs.getString("MEMBER_ADDRESS");
		       LocalDate accountpenDate=rs.getDate("ACC_OPEN_DATE").toLocalDate();
		//		LocalDate accountpenDate=rs.getDate(Date.valueOf("ACC_OPEN_DATE"));
				String memberShipType=rs.getString("MEMBERSHIP_TYPE");
				Double feesPaid=rs.getDouble("FEE_PAID");
				int maxBookAllowed=rs.getInt("MAX_BOOK_ALLOWED");
				double penaltyAmount =rs.getDouble("PENALTY_AMOUNT");
				
				
				
				Member mem=new Member(memberId, memberName, memberAddress, accountpenDate, memberShipType, feesPaid, maxBookAllowed, penaltyAmount);
				list.add(mem);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int remove(int id) {
		
		int removeRow=0;
		
		String sql="DELETE from harish_member where MEMBER_ID=?";
		
		try(PreparedStatement ptsmt=con.prepareStatement(sql))
		{
			ptsmt.setInt(1, id);
			removeRow=ptsmt.executeUpdate();
		}
		catch( SQLException e) {
			e.printStackTrace();
		}
		
		return removeRow;
	}

	public Member findById(int id) {
		
		
		
		String sql="select *from  harish_member where MEMBER_ID=? ";
		Member mem=null;
		try (PreparedStatement ptsmt =con.prepareStatement(sql)){
			
			ptsmt.setInt(1, id);
			ResultSet rs=ptsmt.executeQuery();
			
			if(rs.next()) {
				
				int memberId= rs.getInt("MEMBER_ID");
				String memberName =rs.getString("MEMBER_NAME");
				LocalDate accountpenDate=rs.getDate("ACC_OPEN_DATE").toLocalDate();
				String memberAddress=rs.getString("MEMBERSHIP_TYPE");
				String memberShipType=rs.getString("MEMBERSHIP_TYPE");
				Double feesPaid=rs.getDouble("FEE_PAID");
				int maxBookAllowed=rs.getInt("MAX_BOOK_ALLOWED");
				double penaltyAmount =rs.getDouble("PENALTY_AMOUNT");
				
				 mem=new Member(memberId, memberName, memberAddress, 
						 accountpenDate, memberShipType, feesPaid,
                         maxBookAllowed, penaltyAmount);
				 
			}
			
		} 
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return mem;
		
		
	}

	public int update(int Id, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

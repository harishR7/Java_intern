package com.example.entity;

import java.time.LocalDate;

public class Member {
	
	private int memberId;
	private String memberName;
	private String memberAddress;
	private LocalDate accountpenDate;
	private String  memberShipType;
	private double feesPaid;
	private int maxBookAllowed;
	private double penaltyAmount;
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Member(int memberId, String memberName, String memberAddress, LocalDate accountpenDate,
			String memberShipType, double feesPaid, int maxBookAllowed, double penaltyAmount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.accountpenDate = accountpenDate;
		this.memberShipType = memberShipType;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
	}


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getMemberAddress() {
		return memberAddress;
	}


	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}


	public LocalDate getAccountpenDate() {
		return accountpenDate;
	}


	public void setAccountpenDate(LocalDate accountpenDate) {
		this.accountpenDate = accountpenDate;
	}


	public String getMemberShipType() {
		return memberShipType;
	}


	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}


	public double getFeesPaid() {
		return feesPaid;
	}


	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}


	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}


	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}


	public double getPenaltyAmount() {
		return penaltyAmount;
	}


	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}


	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberAddress=" + memberAddress
				+ ", accountpenDate=" + accountpenDate + ", memberShipType=" + memberShipType + ", feesPaid=" + feesPaid
				+ ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}
	
	
	
	
	
	
}

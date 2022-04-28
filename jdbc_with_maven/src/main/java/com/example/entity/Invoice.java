package com.example.entity;

public class Invoice {
	
	private int invoiceNumber;
	private String invoiceCusName;
	private int quality;
	private int productRef;
	
	
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Invoice(int invoiceNumber, String invoiceCusName, int i, int productRef) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.invoiceCusName = invoiceCusName;
		this.quality = i;
		this.productRef = productRef;
	}


	public int getInvoiceNumber() {
		return invoiceNumber;
	}


	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}


	public String getInvoiceCusName() {
		return invoiceCusName;
	}


	public void setInvoiceCusName(String invoiceCusName) {
		this.invoiceCusName = invoiceCusName;
	}


	public int getQuality() {
		return quality;
	}


	public void setQuality(int quality) {
		this.quality = quality;
	}


	public int getProductRef() {
		return productRef;
	}


	public void setProductRef(int productRef) {
		this.productRef = productRef;
	}


	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", invoiceCusName=" + invoiceCusName + ", quality=" + quality
				+ ", productRef=" + productRef + "]";
	}
	
	
	
	
	
}

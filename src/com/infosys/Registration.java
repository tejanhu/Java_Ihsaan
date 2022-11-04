package com.infosys;

public class Registration {

	private String customerName;
	private String panCardNo;
	private int voterId;
	private String passportNo;
	private int licenseNo;
	private long[] telephoneNo;

	Registration(String customerName, String passportNo, long[] telephoneNo) {
		this.customerName = customerName;
		this.passportNo = passportNo;
		this.telephoneNo = telephoneNo;
	}

	Registration(String customerName, int licenseNo, String panCardNo, long[] telephoneNo) {
		this.customerName = customerName;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
		this.telephoneNo = telephoneNo;
	}

	Registration(String customerName, int voterId, int licenseNo, long[] telephoneNo) {
		this.customerName = customerName;
		this.voterId = voterId;
		this.licenseNo = licenseNo;
		this.telephoneNo = telephoneNo;
	}

	Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo) {
		this.customerName = customerName;
		this.panCardNo = panCardNo;
		this.voterId = voterId;
		this.telephoneNo = telephoneNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

	public long[] getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(long[] telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

}

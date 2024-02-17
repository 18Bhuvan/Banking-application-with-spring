package com.bhuvan.model;

public class Openaccount {

	private  long acno;
	private  String name;
	private  String password;
	private  double amount;
    private  String address;
    private  long mobile_no;
	public Openaccount() {
		super();
	}
	public Openaccount(long acno, String name, String password, double amount, String address, long mobile_no) {
		super();
		this.acno = acno;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobile_no = mobile_no;
	}
	/**
	 * @return the acno
	 */
	public long getAcno() {
		return acno;
	}
	/**
	 * @param acno the acno to set
	 */
	public void setAcno(long acno) {
		this.acno = acno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the mobile_no
	 */
	public long getMobile_no() {
		return mobile_no;
	}
	/**
	 * @param mobile_no the mobile_no to set
	 */
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "Openaccount [acno=" + acno + ", name=" + name + ", password=" + password + ", amount=" + amount
				+ ", address=" + address + ", mobile_no=" + mobile_no + "]";
	}
    
    
    
	
	
}

package com.storemanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StoreDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storeId;

	private String storeName;

	private String address1;

	private String address2;

	private String state;

	private String country;

	private String pincode;

	private String phone;

	private String email;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public StoreDetail() {
	}

	public StoreDetail(String storeName, String address1, String address2, String state, String country,
			String pincode, String phone, String email) {
		super();
		this.storeName = storeName;
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.phone = phone;
		this.email = email;
	}

}

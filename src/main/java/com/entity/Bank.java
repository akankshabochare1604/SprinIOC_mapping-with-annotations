package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	@Value("101")
	 private int id;
	@Value("BOM")
	 private String name;
	@Value("Nationalize")
	 private String type;
	@Value("Pune")
	 private String address;
	
	
	public Bank() {
	
	}


	public Bank(int id, String name, String type, String address) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", type=" + type + ", address=" + address + "]";
	}

	
	
}

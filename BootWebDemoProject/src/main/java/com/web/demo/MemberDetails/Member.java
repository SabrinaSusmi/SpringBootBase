package com.web.demo.MemberDetails;

public class Member {
	
	String name, designation, address, password;
	
	public Member() {
    }

	public Member(String name, String designation, String address, String password) {
		super();
		this.name = name;
		this.designation = designation;
		this.address = address;
		this.password = password;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getDesignation() {
		return designation;
	}

	protected void setDesignation(String designation) {
		this.designation = designation;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", designation=" + designation + ", address=" + address + ", password="
				+ password + "]";
	}

    

}

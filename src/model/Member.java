package model;

import java.util.Date;

public class Member {
	// ȸ�� ������ �����ϴ� �ڹ� ��
	// ���̵�, ��й�ȣ, �̸�, �ּ�, �̸���, ���Գ�¥
	private String id;
	private String password;
	private String name;
	private String address;
	private String email;
	private Date regDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + ", email="
				+ email + ", regDate=" + regDate + "]";
	}
}

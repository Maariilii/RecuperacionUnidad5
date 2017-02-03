package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="cuustomers")
public class Cuustomer {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50)
	private String name;
	@Column(length=30)
	private String address;
	@Column(length=30)
	private String phone;
	@Column(length=30)
	private String mobile;
	@Column(length=30)
	private String fax;
	@Column(length=30)
	private String email;
	@Column(length=30)
	private String webpage;
	@Column(length=30)
	private String previousbalance;
	@Column(length=30)
	private String debit;
	@Column(length=30)
	private String credit;
	@Column(length=30)
	private String currentbalance;
	
	
	
	public Cuustomer(String name, String address, String phone, String mobile, String fax, String email,
			String webpage, String previousbalance, String debit, String credit, String currentbalance) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.fax = fax;
		this.email = email;
		this.webpage = webpage;
		this.previousbalance = previousbalance;
		this.debit = debit;
		this.credit = credit;
		this.currentbalance = currentbalance;
	}


	public Cuustomer() {
		this("","","","","","","","","","","");
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getWebpage() {
		return webpage;
	}


	public void setWebpage(String webpage) {
		this.webpage = webpage;
	}


	public String getPreviousbalance() {
		return previousbalance;
	}


	public void setPreviousbalance(String previousbalance) {
		this.previousbalance = previousbalance;
	}


	public String getDebit() {
		return debit;
	}


	public void setDebit(String debit) {
		this.debit = debit;
	}


	public String getCredit() {
		return credit;
	}


	public void setCredit(String credit) {
		this.credit = credit;
	}


	public String getCurrentbalance() {
		return currentbalance;
	}


	public void setCurrentbalance(String currentbalance) {
		this.currentbalance = currentbalance;
	}


	@Override
	public String toString() {
		return "Cuustomer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", mobile="
				+ mobile + ", fax=" + fax + ", email=" + email + ", webpage=" + webpage + ", previousbalance="
				+ previousbalance + ", debit=" + debit + ", credit=" + credit + ", currentbalance=" + currentbalance
				+ "]";
	}

}

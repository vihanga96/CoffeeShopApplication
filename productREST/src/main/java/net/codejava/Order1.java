package net.codejava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order1 {

	private Integer oid;
	private String item;
	private String address;
	private Integer quan;
	
	public Order1(Integer oid, String item, String address, Integer quan) {
		super();
		this.oid = oid;
		this.item = item;
		this.address = address;
		this.quan = quan;
	}
	
	public Order1() {
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getOid() {
		return oid;
		
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getQuan() {
		return quan;
	}
	public void setQuan(Integer quan) {
		this.quan = quan;
	}
	
	}

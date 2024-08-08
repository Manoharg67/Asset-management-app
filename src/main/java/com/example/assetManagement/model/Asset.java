package com.example.assetManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "asset_inventory")
public class Asset {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String type;
	private Date purchaseDate;
	private String location;
	private String status;
	private Double value;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Asset(Long id, String name, String type, Date purchaseDate, String location, String status, Double value) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.purchaseDate = purchaseDate;
		this.location = location;
		this.status = status;
		this.value = value;
	}
	public Asset() {
		super();
	}
	@Override
	public String toString() {
		return "Asset [id=" + id + ", name=" + name + ", type=" + type + ", purchaseDate=" + purchaseDate
				+ ", location=" + location + ", status=" + status + ", value=" + value + "]";
	}
	
	// getters and setters

}

package com.example.assetManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "asset_inventory")
public class Asset {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String type;
    private String status;

    // Default constructor
    public Asset() {
    }

    // Parameterized constructor
    public Asset(String type, String status) {
        this.type = type;
        this.status = status;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public Asset(UUID id, String type, String status) {
		this.id = id;
		this.type = type;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Asset [id=" + id + ", type=" + type + ", status=" + status + "]";
	}
	

}

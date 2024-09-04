package com.example.assetManagement.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendors")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String contractStatus;  // Active, Expired, etc.

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Vendor(UUID id, String name, String contractStatus) {
        this.id = id;
        this.name = name;
        this.contractStatus = contractStatus;
    }

    @Override
    public String toString() {
        return "Vendor [id=" + id + ", name=" + name + ", contractStatus=" + contractStatus + "]";
    }
    

}


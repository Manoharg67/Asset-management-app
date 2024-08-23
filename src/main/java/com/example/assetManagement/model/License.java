package com.example.assetManagement.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "licenses")
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;
    private String licenseName;
    private String subscriptionStatus;

    public License() {
    }

    public License(String licenseName, String subscriptionStatus) {
        this.licenseName = licenseName;
        this.subscriptionStatus = subscriptionStatus;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getLicenseName() {
        return licenseName;
    }
    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }
    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }
    public void setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }
    public License(UUID id, String licenseName, String subscriptionStatus) {
        this.id = id;
        this.licenseName = licenseName;
        this.subscriptionStatus = subscriptionStatus;
    }
    @Override
    public String toString() {
        return "License [id=" + id + ", licenseName=" + licenseName + ", subscriptionStatus=" + subscriptionStatus
                + "]";
    }
    

}

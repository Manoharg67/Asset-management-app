package com.example.assetManagement.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String invoiceNumber;
    private String paymentStatus;  // Paid, Due, Past Due, etc.
    private double amount;

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Payment(UUID id, String invoiceNumber, String paymentStatus, double amount) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment [id=" + id + ", invoiceNumber=" + invoiceNumber + ", paymentStatus=" + paymentStatus
                + ", amount=" + amount + "]";
    }


}


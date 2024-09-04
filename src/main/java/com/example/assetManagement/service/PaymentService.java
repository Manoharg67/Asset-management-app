package com.example.assetManagement.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.assetManagement.model.Payment;
import com.example.assetManagement.repository.PaymentRepository;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Page<Payment> getPayments(Pageable pageable) {
        return paymentRepository.findAll(pageable);
    }

    public long countPaymentsByPaymentStatus(String paymentStatus) {
        return paymentRepository.countByPaymentStatus(paymentStatus);
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(UUID id) {
        paymentRepository.deleteById(id);
    }
}


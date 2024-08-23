package com.example.assetManagement.repository;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assetManagement.model.License;

@Repository
public interface LicenseRepository extends JpaRepository<License, UUID>{
        Page<License> findAll(Pageable pageable);
    long countBySubscriptionStatus(String subscriptionStatus);
}

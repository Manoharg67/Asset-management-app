package com.example.assetManagement.repository;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assetManagement.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, UUID> {
    Page<Vendor> findAll(Pageable pageable);
    long countByContractStatus(String contractStatus);
}

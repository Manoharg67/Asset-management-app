package com.example.assetManagement.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.assetManagement.model.Vendor;
import com.example.assetManagement.repository.VendorRepository;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;

    public Page<Vendor> getVendors(Pageable pageable) {
        return vendorRepository.findAll(pageable);
    }

    public long countVendorsByContractStatus(String contractStatus) {
        return vendorRepository.countByContractStatus(contractStatus);
    }

    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public void deleteVendor(UUID id) {
        vendorRepository.deleteById(id);
    }
}


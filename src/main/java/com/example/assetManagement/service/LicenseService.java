package com.example.assetManagement.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.assetManagement.model.License;
import com.example.assetManagement.repository.LicenseRepository;

@Service
public class LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    public Page<License> getLicenses(Pageable pageable) {
        return licenseRepository.findAll(pageable);
    }

    public long countLicensesBySubscriptionStatus(String subscriptionStatus) {
        return licenseRepository.countBySubscriptionStatus(subscriptionStatus);
    }

    public License saveLicense(License license) {
        return licenseRepository.save(license);
    }

    public void deleteLicense(UUID id) {
        licenseRepository.deleteById(id);
    }
}

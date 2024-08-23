package com.example.assetManagement.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.assetManagement.model.License;
import com.example.assetManagement.service.LicenseService;

@RestController
@RequestMapping("/api/licenses")
public class LicenseController {
    @Autowired
    private LicenseService licenseService;

    @GetMapping
    public Page<License> getLicenses(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return licenseService.getLicenses(pageable);
    }

    @GetMapping("/count")
    public long countLicenses(@RequestParam String subscriptionStatus) {
        return licenseService.countLicensesBySubscriptionStatus(subscriptionStatus);
    }

    @PostMapping
    public License createLicense(@RequestBody License license) {
        return licenseService.saveLicense(license);
    }

    @DeleteMapping("/{id}")
    public void deleteLicense(@PathVariable UUID id) {
        licenseService.deleteLicense(id);
    }
}

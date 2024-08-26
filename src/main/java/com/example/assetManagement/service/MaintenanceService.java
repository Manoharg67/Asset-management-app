package com.example.assetManagement.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.assetManagement.model.Maintenance;
import com.example.assetManagement.repository.MaintenanceRepository;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    public Page<Maintenance> getMaintenances(Pageable pageable) {
    return maintenanceRepository.findAll(pageable);
    }

    public long countMaintenancesByStatus(String maintenanceStatus) {
        return maintenanceRepository.countByMaintenanceStatus(maintenanceStatus);
    }

    public Maintenance saveMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    public void deleteMaintenance(UUID id) {
        maintenanceRepository.deleteById(id);
    }
}

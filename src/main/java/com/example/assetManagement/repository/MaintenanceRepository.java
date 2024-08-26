package com.example.assetManagement.repository;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assetManagement.model.Maintenance;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, UUID> {
    Page<Maintenance> findAll(Pageable pageable);
    long countByMaintenanceStatus(String maintenanceStatus);
}

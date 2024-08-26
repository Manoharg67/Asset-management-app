package com.example.assetManagement.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.assetManagement.model.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, UUID> {

    @Query("SELECT COUNT(a) FROM Asset a")
    long countAllAssets();

    @Query("SELECT COUNT(a) FROM Asset a WHERE a.status = 'Active'")
    long countActiveAssets();

    @Query("SELECT COUNT(a) FROM Asset a WHERE a.status = 'Inactive'")
    long countInactiveAssets();

    @Query("SELECT COUNT(a) FROM Asset a WHERE a.status = 'Under Maintenance'")
    long countUnderMaintenanceAssets();
}

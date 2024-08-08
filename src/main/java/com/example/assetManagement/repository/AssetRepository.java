package com.example.assetManagement.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assetManagement.model.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, UUID> {

}

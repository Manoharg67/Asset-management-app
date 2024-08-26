package com.example.assetManagement.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.assetManagement.dto.AssetStatusCountsDTO;
import com.example.assetManagement.model.Asset;
import com.example.assetManagement.repository.AssetRepository;

@Service
public class AssetService {
	
	@Autowired
    private AssetRepository assetRepository;

    public List<Asset> getAllAssets(int page, int size) {
        return assetRepository.findAll(PageRequest.of(page, size)).getContent();
    }

    public Asset getAssetById(UUID id) {
        return assetRepository.findById(id).orElse(null);
    }

    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public Asset updateAsset(UUID id, Asset assetDetails) {
        Asset asset = assetRepository.findById(id).orElse(null);
        if (asset != null) {
            asset.setType(assetDetails.getType());
            asset.setStatus(assetDetails.getStatus());
            return assetRepository.save(asset);
        }
        return null;
    }

    public void deleteAsset(UUID id) {
        assetRepository.deleteById(id);
    }

    public AssetStatusCountsDTO getAssetStatusCounts() {
        long assetCount = assetRepository.countAllAssets();
        long activeCount = assetRepository.countActiveAssets();
        long inactiveCount = assetRepository.countInactiveAssets();
        long underMaintenanceCount = assetRepository.countUnderMaintenanceAssets();

        return new AssetStatusCountsDTO(assetCount, activeCount, inactiveCount, underMaintenanceCount);
    }

}

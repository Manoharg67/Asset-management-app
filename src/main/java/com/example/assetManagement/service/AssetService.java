package com.example.assetManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assetManagement.model.Asset;
import com.example.assetManagement.repository.AssetRepository;

@Service
public class AssetService {
	
	@Autowired
	private AssetRepository assetRepository;
	
	public Asset saveAsset(Asset asset) {
		return assetRepository.save(asset);
	}
	
	public List<Asset> getAllAssets() {
		return assetRepository.findAll();
	}
	
	public Optional<Asset> getAssetById(Long id) {
		return assetRepository.findById(id);
	}
	
	public void deleteAsset(long id) {
		assetRepository.deleteById(id);
	}
	
    public long getTotalAssets() {
        return assetRepository.count();
    }

}

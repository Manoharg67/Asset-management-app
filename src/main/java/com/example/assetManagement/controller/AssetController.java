package com.example.assetManagement.controller;

import java.util.List;
import java.util.Optional;

import com.example.assetManagement.model.Asset;
import com.example.assetManagement.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("assets")
public class AssetController {

	@Autowired
	private AssetService assetService;
	
	@PostMapping
	public Asset createAsset(@RequestBody Asset asset) {
		return assetService.saveAsset(asset);
	}
	
	@GetMapping
	public List<Asset> getAllAsset() {
		return assetService.getAllAssets();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Asset> getAssetById(@PathVariable Long id) {
		Optional<Asset> asset = assetService.getAssetById(id);
		return asset.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Asset> updateAsset(@PathVariable Long id, @RequestBody Asset assetDetails) {
        Optional<Asset> asset = assetService.getAssetById(id);
        if (asset.isPresent()) {
            Asset updatedAsset = asset.get();
            updatedAsset.setName(assetDetails.getName());
            updatedAsset.setType(assetDetails.getType());
            updatedAsset.setPurchaseDate(assetDetails.getPurchaseDate());
            updatedAsset.setLocation(assetDetails.getLocation());
            updatedAsset.setStatus(assetDetails.getStatus());
            updatedAsset.setValue(assetDetails.getValue());
            return ResponseEntity.ok(assetService.saveAsset(updatedAsset));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAsset(@PathVariable Long id) {
        if (assetService.getAssetById(id).isPresent()) {
            assetService.deleteAsset(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
    @GetMapping("/count")
    public long getTotalAssets() {
        return assetService.getTotalAssets();
    }
}

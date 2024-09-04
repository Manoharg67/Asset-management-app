package com.example.assetManagement.controller;

import java.util.*;

import com.example.assetManagement.dto.AssetStatusCountsDTO;
import com.example.assetManagement.model.Asset;
import com.example.assetManagement.service.AssetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assets")
@CrossOrigin(origins = "http://localhost:3000")
public class AssetController {

	 @Autowired
    private AssetService assetService;

    @GetMapping
    public Page<Asset> getAllAssets(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "100") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return assetService.getAllAssets(pageable);
    }

    @GetMapping("/{id}")
    public Asset getAssetById(@PathVariable UUID id) {
        return assetService.getAssetById(id);
    }

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset) {
        return assetService.createAsset(asset);
    }

    @PutMapping("/{id}")
    public Asset updateAsset(@PathVariable UUID id, @RequestBody Asset assetDetails) {
        return assetService.updateAsset(id, assetDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteAsset(@PathVariable UUID id) {
        assetService.deleteAsset(id);
    }

    @GetMapping("/counts")
    public AssetStatusCountsDTO getAssetCounts() {
        return assetService.getAssetStatusCounts();
    }
}

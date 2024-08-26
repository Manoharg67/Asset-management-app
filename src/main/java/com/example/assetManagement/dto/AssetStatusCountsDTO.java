package com.example.assetManagement.dto;

public class AssetStatusCountsDTO {
    private long assetCount;
    private long activeCount;
    private long inactiveCount;
    private long underMaintenanceCount;

    public AssetStatusCountsDTO(long assetCount, long activeCount, long inactiveCount, long underMaintenanceCount) {
        this.assetCount = assetCount;
        this.activeCount = activeCount;
        this.inactiveCount = inactiveCount;
        this.underMaintenanceCount = underMaintenanceCount;
    }

    // Getters and Setters
    public long getAssetCount() {
        return assetCount;
    }

    public void setAssetCount(long assetCount) {
        this.assetCount = assetCount;
    }

    public long getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(long activeCount) {
        this.activeCount = activeCount;
    }

    public long getInactiveCount() {
        return inactiveCount;
    }

    public void setInactiveCount(long inactiveCount) {
        this.inactiveCount = inactiveCount;
    }

    public long getUnderMaintenanceCount() {
        return underMaintenanceCount;
    }

    public void setUnderMaintenanceCount(long underMaintenanceCount) {
        this.underMaintenanceCount = underMaintenanceCount;
    }
}

package com.example.assetManagement.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String maintenanceTask;
    private String maintenanceStatus;

    public Maintenance() {
    }

    public Maintenance(String maintenanceTask, String maintenanceStatus) {
        this.maintenanceTask = maintenanceTask;
        this.maintenanceStatus = maintenanceStatus;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaintenanceTask() {
        return maintenanceTask;
    }

    public void setMaintenanceTask(String maintenanceTask) {
        this.maintenanceTask = maintenanceTask;
    }

    public String getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(String maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }

    @Override
    public String toString() {
        return "Maintenance [id=" + id + ", maintenanceTask=" + maintenanceTask + ", maintenanceStatus=" + maintenanceStatus + "]";
    }
}

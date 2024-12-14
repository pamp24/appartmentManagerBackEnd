package com.appartmentManager.Building;

import com.appartmentManager.Resident.ResidentRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Log
@RestController
@RequestMapping("/buildings")
public class BuildingController {

    private final BuildingRepository buildingRepository;

    @Autowired
    public BuildingController(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }
    @Autowired
    private ResidentRepository residentRepository;

    // Get all buildings
    @GetMapping
    public List<BuildingEntity> getAllBuildings() {
        return buildingRepository.findAll();
    }

    // Get building by ID
    @GetMapping("/{id}")
    public ResponseEntity<BuildingEntity> getBuildingById(@PathVariable Long id) {
        return buildingRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new building
    @PostMapping
    public BuildingEntity createBuilding(@RequestBody BuildingEntity building) {
        return buildingRepository.save(building);
    }

    // Update a building
    @PutMapping("/{id}")
    public ResponseEntity<BuildingEntity> updateBuilding(
            @PathVariable Long id, @RequestBody BuildingEntity buildingDetails) {

        return buildingRepository.findById(id)
                .map(existingBuilding -> {
                    existingBuilding.setName(buildingDetails.getName());
                    existingBuilding.setAddress(buildingDetails.getAddress());
                    existingBuilding.setAddressNumber(buildingDetails.getAddressNumber());
                    existingBuilding.setNumberOfFloors(buildingDetails.getNumberOfFloors());
                    existingBuilding.setNumberOfApartments(buildingDetails.getNumberOfApartments());
                    existingBuilding.setBuildingSquareMeters(buildingDetails.getBuildingSquareMeters());
                    existingBuilding.setYearBuilt(buildingDetails.getYearBuilt());
                    existingBuilding.setType(buildingDetails.getType());
                    existingBuilding.setOwner(buildingDetails.getOwner());
                    existingBuilding.setAmenities(buildingDetails.getAmenities());
                    existingBuilding.setBuildingManager(buildingDetails.getBuildingManager());
                    return ResponseEntity.ok(buildingRepository.save(existingBuilding));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete a resident
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResident(@PathVariable Long id) {
        if (residentRepository.existsById(id)) {
            residentRepository.deleteById(id);
            return ResponseEntity.noContent().build();  // 204 No Content
        } else {
            return ResponseEntity.notFound().build();  // 404 Not Found if resident doesn't exist
        }
    }
}

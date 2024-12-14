package com.appartmentManager.Resident;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/residents")
public class ResidentController {

    @Autowired
    private ResidentRepository residentRepository;

    // Get all residents
    @GetMapping
    public List<ResidentEntity> getAllResidents() {
        return residentRepository.findAll();
    }

    // Get a single resident by ID
    @GetMapping("/{id}")
    public ResidentEntity getResidentById(@PathVariable Long id) {
        return residentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resident not found with id: " + id));
    }

    // Create a new resident
    @PostMapping
    public ResidentEntity createResident(@RequestBody ResidentEntity residentEntity) {
        return residentRepository.save(residentEntity);
    }

    // Update an existing resident
    @PutMapping("/{id}")
    public ResidentEntity updateResident(@PathVariable Long id, @RequestBody ResidentEntity updatedResident) {
        return residentRepository.findById(id).map(resident -> {
            resident.setName(updatedResident.getName());
            resident.setAppartment(updatedResident.getAppartment());
            resident.setAppartmentInstance(updatedResident.getAppartmentInstance());
            resident.setElevatorInstance(updatedResident.getElevatorInstance());
            resident.setHeatingInstance(updatedResident.getHeatingInstance());
            resident.setIndividual(updatedResident.getIndividual());
            resident.setBoiler(updatedResident.getBoiler());
            resident.setCommon(updatedResident.getCommon());
            resident.setElevatorExpense(updatedResident.getElevatorExpense());
            resident.setHeatingExpense(updatedResident.getHeatingExpense());
            resident.setIndividualExpense(updatedResident.getIndividualExpense());
            resident.setBoilerExpense(updatedResident.getBoilerExpense());
            resident.setClosed(updatedResident.getClosed());
            resident.setSpecial(updatedResident.getSpecial());
            resident.setOwners(updatedResident.getOwners());
            resident.setEqualParts(updatedResident.getEqualParts());
            resident.setIssuance(updatedResident.getIssuance());
            resident.setAutonomous(updatedResident.getAutonomous());
            resident.setRounded(updatedResident.getRounded());
            resident.setTotal(updatedResident.getTotal());
            return residentRepository.save(resident);
        }).orElseThrow(() -> new RuntimeException("Resident not found with id: " + id));
    }

    // Delete a resident
    @DeleteMapping("/{id}")
    public String deleteResident(@PathVariable Long id) {
        residentRepository.deleteById(id);
        return "Resident with id: " + id + " has been deleted!";
    }
}

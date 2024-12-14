package com.appartmentManager.Building;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "building_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuildingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String addressNumber;

    @Column(nullable = false)
    private Integer numberOfFloors;

    @Column(nullable = false)
    private Integer numberOfApartments;  // Corrected typo from 'Appartments'

    @Column(nullable = false)
    private Double buildingSquareMeters;

    @Column(nullable = false)
    private Integer yearBuilt;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String owner;

    @Column(nullable = false)
    private Boolean isUnderConstruction;

    @ElementCollection
    @CollectionTable(name = "building_amenities", joinColumns = @JoinColumn(name = "building_id"))
    @Column(name = "amenity")
    private List<String> amenities;

    @Column(nullable = false)
    private String buildingManager;

    //Getters
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getAddressNumber() {
        return addressNumber;
    }
    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }
    public Integer getNumberOfApartments() {
        return numberOfApartments;
    }
    public Double getBuildingSquareMeters() {
        return buildingSquareMeters;
    }
    public Integer getYearBuilt() {
        return yearBuilt;
    }
    public String getType() {
        return type;
    }
    public String getOwner() {
        return owner;
    }
    public List<String> getAmenities() {
        return amenities;
    }
    public String getBuildingManager() {
        return buildingManager;
    }
    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setNumberOfApartments(Integer numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    public void setBuildingSquareMeters(Double buildingSquareMeters) {
        this.buildingSquareMeters = buildingSquareMeters;
    }

    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setUnderConstruction(Boolean underConstruction) {
        isUnderConstruction = underConstruction;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public void setBuildingManager(String buildingManager) {
        this.buildingManager = buildingManager;
    }
}


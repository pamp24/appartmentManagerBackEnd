package com.appartmentManager.Resident;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "resident_entity")
public class ResidentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String appartment;
    private Integer appartmentInstance;
    private Integer elevatorInstance;
    private Integer heatingInstance;
    private Integer individual;
    private Integer boiler;
    private Integer common;
    private Integer elevatorExpense;
    private Integer heatingExpense;
    private Integer individualExpense;
    private Integer boilerExpense;
    private Integer closed;
    private Integer special;
    private Integer owners;
    private Integer equalParts;
    private Integer issuance;
    private Integer autonomous;
    private Integer rounded;
    private Integer total;

    public Long getId() {
        return id;
    }

//    Getters
    public String getName() {
        return name;
    }

    public String getAppartment() {
        return appartment;
    }

    public Integer getAppartmentInstance() {
        return appartmentInstance;
    }

    public Integer getElevatorInstance() {
        return elevatorInstance;
    }

    public Integer getHeatingInstance() {
        return heatingInstance;
    }

    public Integer getIndividual() {
        return individual;
    }

    public Integer getBoiler() {
        return boiler;
    }

    public Integer getCommon() {
        return common;
    }

    public Integer getElevatorExpense() {
        return elevatorExpense;
    }

    public Integer getHeatingExpense() {
        return heatingExpense;
    }

    public Integer getIndividualExpense() {
        return individualExpense;
    }

    public Integer getBoilerExpense() {
        return boilerExpense;
    }

    public Integer getClosed() {
        return closed;
    }

    public Integer getSpecial() {
        return special;
    }

    public Integer getOwners() {
        return owners;
    }

    public Integer getEqualParts() {
        return equalParts;
    }

    public Integer getIssuance() {
        return issuance;
    }

    public Integer getAutonomous() {
        return autonomous;
    }

    public Integer getRounded() {
        return rounded;
    }

    public Integer getTotal() {
        return total;
    }
//    setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }

    public void setAppartmentInstance(Integer appartmentInstance) {
        this.appartmentInstance = appartmentInstance;
    }

    public void setElevatorInstance(Integer elevatorInstance) {
        this.elevatorInstance = elevatorInstance;
    }

    public void setHeatingInstance(Integer heatingInstance) {
        this.heatingInstance = heatingInstance;
    }

    public void setIndividual(Integer individual) {
        this.individual = individual;
    }

    public void setBoiler(Integer boiler) {
        this.boiler = boiler;
    }

    public void setCommon(Integer common) {
        this.common = common;
    }

    public void setElevatorExpense(Integer elevatorExpense) {
        this.elevatorExpense = elevatorExpense;
    }

    public void setHeatingExpense(Integer heatingExpense) {
        this.heatingExpense = heatingExpense;
    }

    public void setIndividualExpense(Integer individualExpense) {
        this.individualExpense = individualExpense;
    }

    public void setBoilerExpense(Integer boilerExpense) {
        this.boilerExpense = boilerExpense;
    }

    public void setClosed(Integer closed) {
        this.closed = closed;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public void setOwners(Integer owners) {
        this.owners = owners;
    }

    public void setEqualParts(Integer equalParts) {
        this.equalParts = equalParts;
    }

    public void setIssuance(Integer issuance) {
        this.issuance = issuance;
    }

    public void setAutonomous(Integer autonomous) {
        this.autonomous = autonomous;
    }

    public void setRounded(Integer rounded) {
        this.rounded = rounded;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}

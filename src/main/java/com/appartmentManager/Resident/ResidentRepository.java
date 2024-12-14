package com.appartmentManager.Resident;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends JpaRepository<ResidentEntity, Long> {
}

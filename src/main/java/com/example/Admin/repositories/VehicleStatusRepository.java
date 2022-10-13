package com.example.Admin.repositories;

import com.example.Admin.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository <VehicleStatus,Integer> {
}

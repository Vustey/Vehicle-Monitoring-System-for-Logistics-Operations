package org.example.vmsproject.repository;

import org.example.vmsproject.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}

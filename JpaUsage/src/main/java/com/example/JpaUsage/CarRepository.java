package com.example.JpaUsage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {

    List<Car> findAll();
    Optional<Car> findById(UUID uuid);
    List<Car> findAllByBrand(String brand);
    List<Car> findAllByModelIgnoreCase(String model);
    @Override
    boolean existsById(UUID uuid);
}

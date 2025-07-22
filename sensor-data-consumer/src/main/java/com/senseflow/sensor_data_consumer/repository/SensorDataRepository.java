package com.senseflow.sensor_data_consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senseflow.sensor_data_consumer.model.SensorData;

@Repository
public interface SensorDataRepository extends JpaRepository<SensorData, Long> {
}

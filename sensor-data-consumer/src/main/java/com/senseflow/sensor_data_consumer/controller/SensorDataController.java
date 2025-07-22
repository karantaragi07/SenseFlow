package com.senseflow.sensor_data_consumer.controller;

import com.senseflow.sensor_data_consumer.model.SensorData;
import com.senseflow.sensor_data_consumer.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensor-data")
public class SensorDataController {

    @Autowired
    private SensorDataRepository sensorDataRepository;

    @GetMapping
    public List<SensorData> getAllSensorData() {
        return sensorDataRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SensorData> getSensorDataById(@PathVariable Long id) {
        return sensorDataRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

package com.senseflow.sensor_data_consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.senseflow.sensor_data_consumer.model.SensorData;
import com.senseflow.sensor_data_consumer.repository.SensorDataRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class SensorDataConsumer {

    private final SensorDataRepository repository;

    @KafkaListener(topics = "sensor-data", groupId = "sensor-group", containerFactory = "kafkaListenerContainerFactory")
    public void consume(SensorData data) {
        log.info("Consumed sensor data: {}", data);
        repository.save(data);
    }
}

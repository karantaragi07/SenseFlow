package com.senseflow.sensor_simulator.simulator;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.senseflow.sensor_simulator.model.SensorData;
import com.senseflow.sensor_simulator.service.SensorProducer;

@Component
public class SensorSimulator {

    private static final Logger logger = LoggerFactory.getLogger(SensorSimulator.class);


    private final SensorProducer producer;
    private final Random random = new Random();

    public SensorSimulator(SensorProducer producer) {
        this.producer = producer;
    }

    @Scheduled(fixedRate = 5000) // every 5 seconds
    public void generateAndSendData() {
        SensorData data = new SensorData(
            UUID.randomUUID().toString(),               // random sensor ID
            20 + random.nextDouble() * 10,              // temperature: 20–30 °C
            40 + random.nextDouble() * 20,              // humidity: 40–60 %
            LocalDateTime.now()                         // current timestamp
        );

        producer.sendSensorData(data);
        logger.info("Sent sensor data: {}", data.getSensorId());

    }
}

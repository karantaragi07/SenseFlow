package com.senseflow.sensor_simulator.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import com.senseflow.sensor_simulator.model.SensorData;



public class SensorConsumer {
  private static final Logger logger = LoggerFactory.getLogger(SensorConsumer.class);

    @KafkaListener(topics = "sensor-data", groupId = "sensor-group")
    public void consume(ConsumerRecord<String, SensorData> record) {
        SensorData data = record.value();
        logger.info("✅ Received SensorData -> ID: {}, Temp: {}, Humidity: {}, Time: {}",
            data.getSensorId(),
            data.getTemperature(),
            data.getHumidity(),
            data.getTimestamp());
}
}

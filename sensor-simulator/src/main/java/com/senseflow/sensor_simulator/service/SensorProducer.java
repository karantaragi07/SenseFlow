package com.senseflow.sensor_simulator.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.senseflow.sensor_simulator.model.SensorData;


@Service
public class SensorProducer {
	
	private static final String TOPIC ="sensor-data-topic";
	private final KafkaTemplate<String, SensorData> kafkaTemplate;
	
	public SensorProducer(KafkaTemplate<String, SensorData> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendSensorData(SensorData data) {
		kafkaTemplate.send(TOPIC, data.getSensorId(), data);
	}

}

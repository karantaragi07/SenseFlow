package com.senseflow.sensor_simulator.model;

import java.time.LocalDateTime;

public class SensorData {
	private String sensorId;
	private double temperature;
	private double humidity;
	private LocalDateTime timestamp;
	
	public SensorData()   {}

	public SensorData(String sensorId, double temperature, double humidity, LocalDateTime timestamp) {
		this.sensorId = sensorId;
		this.temperature = temperature;
		this.humidity = humidity;
		this.timestamp = timestamp;
	}

	
	
	public String getSensorId() {
		return sensorId;
	}
	
	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public double getTemperature() {
		return temperature;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}
	
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}
	
	
	
	


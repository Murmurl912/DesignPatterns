package patterns.observer.java;

import patterns.observer.weather.Observer;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

public class WeatherData extends Observable {
    private final Object temperatureLock = new Object();
    private float temperature;

    private final Object humidityLock = new Object();
    private float humidity;

    private final Object pressureLock = new Object();
    private float pressure;

    public WeatherData() {

    }


    public float getTemperature() {
        synchronized (temperatureLock) {
            return temperature;
        }
    }

    public float getPressure() {
        synchronized (pressureLock) {
            return pressure;
        }
    }

    public float getHumidity() {
        synchronized (humidityLock) {
            return humidity;
        }
    }

    public void setPressure(float pressure) {
        synchronized (pressureLock) {
            this.pressure = pressure;
        }
        onMeasurementChanges();
    }

    public void setTemperature(float temperature) {
        synchronized (temperatureLock) {
            this.temperature  = temperature;
        }
        onMeasurementChanges();
    }

    public void setHumidity(float humidity) {
        synchronized (humidityLock) {
            this.humidity = humidity;
        }
        onMeasurementChanges();
    }

    private void onMeasurementChanges() {
        setChanged(); // state that status has changed
        this.notifyObservers();
    }
}

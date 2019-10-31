package patterns.observer.weather;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {

    private final Object observerLock = new Object();

    private Set<Observer> observers;

    private final Object temperatureLock = new Object();
    private float temperature;

    private final Object humidityLock = new Object();
    private float humidity;

    private final Object pressureLock = new Object();
    private float pressure;

    public WeatherData() {
        observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer == null) {
            return;
        }
        synchronized (observerLock) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer == null) {
            return;
        }
        synchronized (observerLock) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        synchronized (observerLock) {
            for(Observer observer : observers){
                observer.update(getTemperature(), getHumidity(), getPressure());
            }
        }
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
        notifyObserver();
    }


}

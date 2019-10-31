package patterns.observer.java;

import patterns.observer.weather.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humdity;
    private float pressure;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            this.temp = ((WeatherData) o).getTemperature();
            this.humdity = ((WeatherData) o).getHumidity();
            this.pressure = ((WeatherData) o).getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(
                "Current condition: " + temp + "F degrees, " + humdity + "% humdity, " + pressure + " kpa");
    }
}

package patterns.observer.weather;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humdity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humdity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println(
                "Current condition: " + temp + "F degrees, " + humdity + "% humdity, " + pressure + " kpa");
    }
}

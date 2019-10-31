package patterns.observer.weather;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentConditionDisplay display = new CurrentConditionDisplay(data);

        data.setHumidity(80); data.setTemperature(90); data.setPressure(30.4f);
        data.setHumidity(40); data.setTemperature(60); data.setPressure(29);

    }
}

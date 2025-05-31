package gameMechanics.Weather;

public class Weather {

    public enum WeatherType {
        SUNNY,
        RAINY,
        SNOWY,
        WINDY,
        CLOUDY
    }

    private WeatherType currentWeather;

    public Weather(WeatherType initialWeather) {
        this.currentWeather = initialWeather;
    }

    public WeatherType getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(WeatherType newWeather) {
        this.currentWeather = newWeather;
    }

    @Override
    public String toString() {
        return "Current weather is: " + currentWeather.name();
    }
    
}

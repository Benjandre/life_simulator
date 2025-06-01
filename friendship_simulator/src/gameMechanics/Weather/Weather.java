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

    public Weather(WeatherType currentWeather) {
        this.currentWeather = currentWeather;
    }

    public WeatherType getCurrentWeather() {
        return currentWeather;
    }

    public void changeWeather(WeatherType newWeather) {
        currentWeather = newWeather;
    }
    
}

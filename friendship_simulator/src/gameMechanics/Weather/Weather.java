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
        if (newWeather == currentWeather) {
            System.out.println("The weather is already " + newWeather + ".");
            return;
        } else if (newWeather == null) {
            throw new IllegalArgumentException("Weather type cannot be null");
        } else {
            currentWeather = newWeather;
            System.out.println("The weather has changed from " + currentWeather + " to " + newWeather + ".");
        }
        
    }
    
}

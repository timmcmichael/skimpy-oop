/* 
 * This class represents a weather record for a specific date, logging the 
 * high temperature and average wind speed.
 * 
 */
public class WeatherRecord {
    // Constructors
    public WeatherRecord() { // "parameterless" constructor
        date = "2025-01-01";
        highTemperature = 0;
        averageWindSpeed = 0.0;
    }

    public WeatherRecord(String date) {
        this.date = date;
        this.highTemperature = 0;
        this.averageWindSpeed = 0.0;
    }

    public WeatherRecord(String date, int highTemperature, double averageWindSpeed) {
        this.date = date;
        this.highTemperature = highTemperature;
        this.averageWindSpeed = averageWindSpeed;
    }

    // Fields
    private String date;
    private int highTemperature;
    private double averageWindSpeed;

    // Getters
    public String getDate() {
        return date;
    }

    public int getHighTemperature() {
        return highTemperature;
    }

    public double getAverageWindSpeed() {
        return averageWindSpeed;
    }

    public String getDescription() {
        if (this.highTemperature > 90) {
            return "Hot";
        } else if (this.highTemperature > 70) {
            return "Warm";
        } else if (this.highTemperature > 50) {
            return "Cool";
        } else {
            return "Cold";
        }
    }

    // Setters and Mutators
    public void setDate(String date) {
        this.date = date;
    }

    public void setHighTemperature(int highTemperature) {
        this.highTemperature = highTemperature;
    }

    public void setAverageWindSpeed(double averageWindSpeed) {
        this.averageWindSpeed = averageWindSpeed;
    }
}

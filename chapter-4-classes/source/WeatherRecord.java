/* 
 * This class represents a weather record for a specific date, logging the 
 * high temperature and average wind speed.
 * 
 */
public class WeatherRecord {
    private String date;
    private int highTemperature;
    private double averageWindSpeed;
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHighTemperature() {
        return highTemperature;
    }

    public void setHighTemperature(int highTemperature) {
        this.highTemperature = highTemperature;
    }

    public double getAverageWindSpeed() {
        return averageWindSpeed;
    }

    public void setAverageWindSpeed(double averageWindSpeed) {
        this.averageWindSpeed = averageWindSpeed;
    }
}

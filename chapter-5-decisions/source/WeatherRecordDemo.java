/*
 * This driver class tests/demonstrates the WeatherRecordDemo class.
 * 
 * NOTE: This program appears in multiple sections of the eBook and/or accompanying videos. This version demonstrates concepts from the _Decisions_ chapter.
 * 
 */

public class WeatherRecordDemo {

    public static void main(String[] args) {
        // Instantiate two objects
        WeatherRecord day1 = new WeatherRecord();
        WeatherRecord day2 = new WeatherRecord("1998-01-25");
        WeatherRecord day3 = new WeatherRecord("2024-10-03", 65, 15.0);

        // Set field values for both instances
        day1.setDate("2024-10-01");
        day1.setHighTemperature(87);
        day1.setAverageWindSpeed(11.5);

        day2.setHighTemperature(95);
        day2.setAverageWindSpeed(8.25);

        // Output field values for both instances

        System.out.println("Date: " + day1.getDate());
        System.out.println("High Temperature: " + day1.getHighTemperature());
        System.out.println("Average Wind Speed: " + day1.getAverageWindSpeed());
        System.out.println("Temperature Description: " + day1.getTempDescription());
        System.out.println("Full Description: " + day1.getFullDescription());

        System.out.println("------------------------------");

        System.out.println("Date: " + day2.getDate());
        System.out.println("High Temperature: " + day2.getHighTemperature());
        System.out.println("Average Wind Speed: " + day2.getAverageWindSpeed());
        System.out.println("Temperature Description: " + day2.getTempDescription());
        System.out.println("Full Description: " + day2.getFullDescription());

        System.out.println("------------------------------");

        System.out.println("Date: " + day3.getDate());
        System.out.println("High Temperature: " + day3.getHighTemperature());
        System.out.println("Average Wind Speed: " + day3.getAverageWindSpeed());
        System.out.println("Temperature Description: " + day3.getTempDescription());
        System.out.println("Full Description: " + day3.getFullDescription());
    }
}
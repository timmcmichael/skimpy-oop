/*
 * This class represents a single record sold in a record store. It uses nested if statements to determine the price of the record based on genre and subgenre.
 * 
 */

public class VinylRecord {
    private String title;
    private String artist;
    private String genre;
    private String subgenre;
    private double price;

    // Getters

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public double getPrice() {
        return price;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}
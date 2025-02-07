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

    public void setGenre(String genre, String subgenre) {
        this.genre = genre;
        this.subgenre = subgenre;
        if (this.genre.equals("Rock")) {
            if (this.subgenre.equals("Classic Rock")) {
                this.price = 20.0;
            } else if (this.subgenre.equals("Hard Rock")) {
                this.price = 25.0;
            } else {
                this.price = 15.0;
            }
        } else if (this.genre.equals("Blues")) {
            if (this.subgenre.equals("Chicago Blues")) {
                this.price = 30.0;
            } else if (this.subgenre.equals("Delta Blues")) {
                this.price = 35.0;
            } else {
                this.price = 25.0;
            }
        } else {
            this.price = 10.0;
        }
    }
}
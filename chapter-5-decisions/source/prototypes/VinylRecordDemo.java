/*
 * This program demonstrates the VinylRecord class.
 */
public class VinylRecordDemo {

    public static void main(String[] args) {
        /* VinylRecord record1 = new VinylRecord();
        record1.setTitle("The Dark Side of the Moon");
        record1.setArtist("Pink Floyd");
        record1.setGenre("Rock", "Classic Rock");
        System.out.println("Title: " + record1.getTitle());
        System.out.println("Artist: " + record1.getArtist());
        System.out.println("Genre: " + record1.getGenre());
        System.out.println("Subgenre: " + record1.getSubgenre());
        System.out.println("Price: $" + record1.getPrice());
        
        VinylRecord record2 = new VinylRecord();
        record2.setTitle("Moanin' in the Moonlight");
        record2.setArtist("Howlin' Wolf");
        record2.setGenre("Blues", "Chicago Blues");
        System.out.println("Title: " + record2.getTitle());
        System.out.println("Artist: " + record2.getArtist());
        System.out.println("Genre: " + record2.getGenre());
        System.out.println("Subgenre: " + record2.getSubgenre());
        System.out.println("Price: $" + record2.getPrice()); */

        VinylRecord record1 = new VinylRecord("Layla and Other Assorted Love Songs", "Derek and the Dominos", "Rock",
                "Classic Rock");
        System.out.println(record1.getTitle() + ": $" + record1.getPrice());

        VinylRecord record2 = new VinylRecord("Is This It?", "The Strokes", "Rock", "Indie Rock");
        System.out.println(record2.getTitle() + ": $" + record2.getPrice());

        VinylRecord record3 = new VinylRecord("Smokestack Lightning", "Howlin' Wolf", "Blues", "Chicago Blues");
        System.out.println(record3.getTitle() + ": $" + record3.getPrice());

    }

}

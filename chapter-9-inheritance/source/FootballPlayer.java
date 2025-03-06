/*
 * This subclass of Athlete represents a football player. It implements two specific fields, two new methods. Since it does not override the run() method, it will use the run() method from the Athlete class.
 */

public class FootballPlayer extends Athlete {
    private String teamName;
    private String position;

    public void tackle() {
        System.out.println("Tackling!");
    }

    public void pass() {
        System.out.println("Passing!");
    }
}
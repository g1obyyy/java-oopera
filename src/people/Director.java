package people;

public class Director extends Person {
    private final int numberOfShows;

    /* CONSTRUCTORS */

    public Director(String newName, String newSurname, Gender newGender, int numberOfShows) {
        super(newName, newSurname, newGender);
        this.numberOfShows = numberOfShows;
    }

    /* GETTERS */

    public int getNumberOfShows() {
        return numberOfShows;
    }
}

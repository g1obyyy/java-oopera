package shows;

import people.Director;
import people.Person;

public class MusicalShow extends Show {
    private final Person musicAuthor;
    private final String librettoText;

    /* CONSTRUCTORS */

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    /* GETTERS and SETTERS */

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }


    public void printLibretto() {
        System.out.println(librettoText);
    }
}

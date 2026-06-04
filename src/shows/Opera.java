package shows;

import people.Director;
import people.Person;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director,
                 Person musicAuthor, String librettoText,
                 int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    /* GETTERS and SETTERS */

    public int getChoirSize() {
        return choirSize;
    }
}

package shows;

import people.Director;
import people.Person;

public class Ballet extends MusicalShow {
    private final Person choreographer;

    public Ballet(String title, int duration, Director director,
                  Person musicAuthor, String librettoText,
                  Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    /* GETTERS and SETTERS */

    public Person getChoreographer() {
        return choreographer;
    }
}

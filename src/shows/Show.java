package shows;

import people.Actor;
import people.Director;

import java.util.ArrayList;

public class Show {
    private final  String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> actors = new ArrayList<>();

    /* CONSTRUCTORS */

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    /* GETTERS */

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }


    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        if (actors.isEmpty()) {
            System.out.println("Пока актеров в спектакле \"" + title + "\" нет.");
            return;
        }

        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Актер должен существовать, чтобы участвовать в спектакле.");
            return;
        }

        if (actors.contains(actor)) {
            System.out.println("Такой актёр уже участвует в спектакле.");
            return;
        }

        actors.add(actor);
    }

    public void changeActor(Actor newActor, String surname) {
        if (newActor == null) {
            System.out.println("Новый актер должен существовать.");
            return;
        }

        if (surname == null || surname.isBlank()) {
            System.out.println("Фамилия актера для замены должна быть указана.");
            return;
        }

        if (actors.isEmpty()) {
            System.out.println("Пока актеров в спектакле \"" + title + "\" нет.");
            return;
        }

        for (int i = 0; i < actors.size(); i++) {
            Actor oldActor = actors.get(i);

            if (surname.equals(oldActor.getSurname())) {
                actors.set(i, newActor);
                return;
            }
        }

        System.out.println("Актер с фамилией " + surname + " не найден.");
    }
}
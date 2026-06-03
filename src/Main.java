import shows.Ballet;
import shows.Opera;
import shows.Show;
import people.Actor;
import people.Director;
import people.Gender;
import people.Person;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Смирнова", Gender.FEMALE, 168);
        Actor actor3 = new Actor("Олег", "Иванов", Gender.MALE, 175);

        Director director1 = new Director("Сергей", "Соколов", Gender.MALE, 12);
        Director director2 = new Director("Мария", "Орлова", Gender.FEMALE, 8);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show show = new Show("Обычный спектакль", 120, director1);

        Opera opera = new Opera(
                "Опера",
                150,
                director2,
                musicAuthor,
                "Текст либретто оперы.",
                40
        );

        Ballet ballet = new Ballet(
                "Балет",
                100,
                director1,
                musicAuthor,
                "Текст либретто балета.",
                choreographer
        );

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        show.changeActor(actor3, "Петров");
        show.printActors();

        opera.changeActor(actor1, "Несуществующий");

        opera.printLibretto();
        ballet.printLibretto();
    }
}
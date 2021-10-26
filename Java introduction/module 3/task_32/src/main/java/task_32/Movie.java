package task_32;

public class Movie {

    final private String title, directorName, directorSurname;
    final private int releaseYear;
    int durationMinutes;

    public Movie(String title, String directorName, String directorSurname, int releaseYear, int durationMinutes) {
        this.title = title;
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.releaseYear = releaseYear;
        this.durationMinutes = durationMinutes;
    }

}

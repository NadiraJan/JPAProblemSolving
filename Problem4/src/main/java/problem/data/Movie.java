package problem.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    private int movieId;
    private String title;
    private int budget;
    private String homepage;

    public int getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public int getBudget() {
        return budget;
    }

    public String getHomepage() {
        return homepage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movieId +
                ", title='" + title + '\'' +
                ", budget=" + budget +
                ", homepage='" + homepage + '\'' +
                '}';
    }
}

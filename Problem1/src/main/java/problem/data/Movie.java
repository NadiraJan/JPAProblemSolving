package problem.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    private int movie_id;
    private String title;
    private int budget;
    private String homepage;

    public int getMovie_id() {
        return movie_id;
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
                "movie_id=" + movie_id +
                ", title='" + title + '\'' +
                ", budget=" + budget +
                ", homepage='" + homepage + '\'' +
                '}';
    }
}

package problem.app;

import problem.repositories.MovieRepository;

public class TestApp {
    public static void main(String[] args) {

        MovieRepository movieRepository = new MovieRepository();

        System.out.println(movieRepository.getMovieByID(22));

    }
}

package problem.repositories;

import problem.data.Movie;

import javax.persistence.EntityManager;

public class MovieRepository {


    public Movie getMovieByID(int id){
        EntityManager em = EMFFactory.getEMF().createEntityManager();
        return em.find(Movie.class,id);
    }
}

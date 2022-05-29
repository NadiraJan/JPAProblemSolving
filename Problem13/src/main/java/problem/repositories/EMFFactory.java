package problem.repositories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFFactory {

    public static EntityManagerFactory getEMF(){
        return Persistence.createEntityManagerFactory("movieDataBase");
    }
}

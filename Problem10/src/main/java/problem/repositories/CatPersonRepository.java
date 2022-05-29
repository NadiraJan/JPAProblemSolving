package problem.repositories;


import problem.data.CatPerson;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class CatPersonRepository {

    public CatPerson getCatPersonById(int id){
        EntityManager em = EMFFactory.getEMF().createEntityManager();
        return em.find(CatPerson.class, id);
    }

    public void createCatPerson(CatPerson catPerson){
        EntityManager em = EMFFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(catPerson);
        em.getTransaction().commit();
    }


    public CatPerson getCatPersonByName(String name){
        EntityManager em = EMFFactory.getEMF().createEntityManager();
        Query query = em.createQuery("Select v from CatPerson v where v.name = '"+name+ "'");
        List<CatPerson> foundCatPeople = query.getResultList();
        return foundCatPeople.get(0);
    }
}

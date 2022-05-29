package problem.repositories;

import problem.data.Cat;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class CatRepository {

    public Cat getCatById(int id){
        EntityManager em = EMFFactory.getEMF().createEntityManager();
        return em.find(Cat.class, id);
    }

    public void createCat(Cat cat){
        EntityManager em = EMFFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
    }

    public List<Cat> getAllCats(){
        EntityManager em = EMFFactory.getEMF().createEntityManager();
        Query query = em.createQuery("Select v from Cat v");
        return query.getResultList();
    }
    public Cat getCatByName(String name){
        EntityManager em = EMFFactory.getEMF().createEntityManager();
        Query query = em.createQuery("Select v from Cat v where v.name = "+name);
        List<Cat> foundCats = query.getResultList();
        return foundCats.get(0);
    }
}

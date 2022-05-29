package problem.app;


import problem.data.Cat;
import problem.data.CatPerson;
import problem.repositories.CatPersonRepository;
import problem.repositories.CatRepository;

public class TestApp {
    public static void main(String[] args) {


        //TODO:VERGEET DE DATABASE GEGEVENS NIET AAN TE PASSEN IN Persistence.xml !!!!!


        CatRepository catRepository = new CatRepository();


        System.out.println(catRepository.getCatByName("Garfield"));





    }
}

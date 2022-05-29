package problem.app;


import problem.data.Cat;
import problem.data.CatPerson;
import problem.repositories.CatPersonRepository;
import problem.repositories.CatRepository;

public class TestApp {
    public static void main(String[] args) {


        //TODO:VERGEET DE DATABASE GEGEVENS NIET AAN TE PASSEN IN Persistence.xml !!!!!

        CatPersonRepository catPersonRepository = new CatPersonRepository();
        CatRepository catRepository = new CatRepository();

        CatPerson catPerson = new CatPerson("John");
        catRepository.createCat(new Cat("Garfield", catPerson));





    }
}

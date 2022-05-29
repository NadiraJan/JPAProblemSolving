package problem.app;


import problem.data.Cat;
import problem.repositories.CatRepository;

public class TestApp {
    public static void main(String[] args) {


        //TODO:VERGEET DE DATABASE GEGEVENS NIET AAN TE PASSEN IN Persistence.xml !!!!!
        CatRepository catRepository = new CatRepository();
        Cat cat = new Cat(4, "Tom");
        catRepository.createCat(cat);




    }
}

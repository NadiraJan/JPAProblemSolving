package problem.app;


import problem.data.Cat;
import problem.repositories.CatRepository;

public class TestApp {
    public static void main(String[] args) {

        CatRepository catRepository = new CatRepository();
        Cat cat = new Cat("Tom");
        catRepository.createCat(cat);







    }
}

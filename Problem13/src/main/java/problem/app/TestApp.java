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


        //TODO: LAATSTE VRAAG GEEFT GEEN EXCEPTION. MAAR je moet uitzoeken waarom die sysout leeg blijft
        for (Cat c : catPersonRepository.getCatPersonByName("John").getCats()){
            System.out.println(c);
        }





    }
}

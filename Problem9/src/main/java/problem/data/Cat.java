package problem.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cat {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne
    private CatPerson personThatOwnsTheCat;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, CatPerson personThatOwnsTheCat) {
        this.name = name;
        this.personThatOwnsTheCat = personThatOwnsTheCat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatPerson getPersonThatOwnsTheCat() {
        return personThatOwnsTheCat;
    }

    public void setPersonThatOwnsTheCat(CatPerson personThatOwnsTheCat) {
        this.personThatOwnsTheCat = personThatOwnsTheCat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personThatOwnsTheCat=" + personThatOwnsTheCat +
                '}';
    }
}

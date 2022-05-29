package problem.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class CatPerson {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(mappedBy = "personThatOwnsTheCat")
    private List<Cat> cats;

    public CatPerson() {
    }

    public CatPerson(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "CatPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cats=" + cats +
                '}';
    }
}

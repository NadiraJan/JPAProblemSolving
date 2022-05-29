package problem.data;

import java.util.List;
import javax.persistence.*;

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
                '}';
    }
}

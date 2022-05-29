package problem.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class CatPerson {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany
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

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "CatPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

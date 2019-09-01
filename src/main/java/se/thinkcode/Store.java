package se.thinkcode;

import java.util.List;
import java.util.Set;

public class Store {
    private String name;

    private List<Person> people;

    public String getName() {
        return name;
    }

    public Store setName(String name) {
        this.name = name;
        return this;
    }

    public List<Person> getPeople() {
        return people;
    }

    public Store setPeople(List<Person> people) {
        this.people = people;
        return this;
    }
}

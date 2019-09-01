package se.thinkcode.dao;

import org.springframework.stereotype.Component;
import se.thinkcode.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface PersonDAO {
    void save(Person person);

    List<Person> loadAll();

    Person toPerson(ResultSet resultSet) throws SQLException;
}

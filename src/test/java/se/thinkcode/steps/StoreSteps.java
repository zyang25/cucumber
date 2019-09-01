package se.thinkcode.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import se.thinkcode.Person;
import se.thinkcode.Store;
import se.thinkcode.dao.PersonDAO;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StoreSteps {
    @Autowired
    private World world;

    @Autowired
    private PersonDAO personDAO;

    @Given("^that the store (.*) exist$")
    public void storeExist(String name){
        world.store = new Store().setName(name);
    }

    @When("^store is opened$")
    public void storeIsOpened() throws Throwable {
        List<Person> people =  personDAO.loadAll();
        world.store.setPeople(people);
    }

    @Then("^store should have at least (.*) person$")
    public void storeShouldHavePeople(int number){
        assertThat(world.store.getPeople().size(), is(number));
    }
}

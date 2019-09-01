package se.thinkcode.steps;

import org.springframework.stereotype.Component;
import se.thinkcode.Customer;
import se.thinkcode.Item;
import se.thinkcode.Store;

@Component
public class World {
    Customer customer;
    Item item;
    Store store;
}

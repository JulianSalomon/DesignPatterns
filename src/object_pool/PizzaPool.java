package object_pool;

import java.util.LinkedList;
import java.util.List;

public class PizzaPool {

    private static final PizzaPool INSTANCE = new PizzaPool();

    private static List<Pizza> available = new LinkedList<>();
    private static List<Pizza> inUse = new LinkedList<>();

    public PizzaPool getInstance() {
        return INSTANCE;
    }

    public Pizza acquire() {
        Pizza pizza;
        if (available.size() != 0) {
            pizza = available.remove(0);
        } else {
            pizza = new Pizza();
        }
        inUse.add(pizza);
        return pizza;
    }

    public void release(Pizza pizza) {
        available.add(pizza);
        inUse.remove(pizza);
    }
}

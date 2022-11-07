package Pizza;

import java.util.List;

public abstract class CreatePizza {
    public abstract void createPizza();
    public abstract List<String> getToppings();
    public abstract List<String> getSauces();
    public abstract double getPrice();
}

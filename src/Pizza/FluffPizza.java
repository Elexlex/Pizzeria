package Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FluffPizza extends CreatePizza {
    List<String> toppingsList = new ArrayList<>();
    List<String> saucesList = new ArrayList<>();
    double price;
    public void createPizza(){new CreateFluffPizza();}
    public List<String> getToppings() { return toppingsList;}
    public List<String> getSauces() { return saucesList;}
    public double getPrice() { return price;}
    class CreateFluffPizza{
        public CreateFluffPizza(){
            price = (Math.random()*15)+15;
            String[] toppings = {"Ham", "Pineapple", "Mozzarella", "Onion", "Jalapenos", "Spinach", "Chicken", "none"};
            String[] sauces = {"Ketchup", "Garlic", "Hot", "BBQ", "Sweet", "none"};
            toppingsList.addAll(Arrays.asList(toppings));
            saucesList.addAll(Arrays.asList(sauces));
        }
    }
}

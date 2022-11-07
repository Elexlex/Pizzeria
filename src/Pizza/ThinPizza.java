package Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThinPizza extends CreatePizza{
    List<String> toppingsList = new ArrayList<>();
    List<String> saucesList = new ArrayList<>();
    double price;
    public void createPizza(){new CreateThinPizza();}
    public List<String> getToppings() { return toppingsList;}
    public List<String> getSauces() { return saucesList;}
    public double getPrice() { return price;}
    class CreateThinPizza{
        public CreateThinPizza(){
            price = (Math.random()*10)+10;
            String[] toppings = {"Ham", "Mozzarella", "Chicken", "Salami", "Eggs", "Potato", "Broccoli", "Olives", "none"};
            String[] sauces = {"Ketchup", "Garlic", "Hot", "BBQ", "Sweet", "none"};
            toppingsList.addAll(Arrays.asList(toppings));
            saucesList.addAll(Arrays.asList(sauces));
        }
    }
}

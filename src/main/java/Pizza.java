import java.util.ArrayList;
import java.util.List;

public class Pizza {
    Constants.PizzaType type;
    Constants.Size size;
    Constants.Dough dough;
    List<Constants.Toppings> toppings = new ArrayList<Constants.Toppings>();

    public Pizza() {

    }

    public Pizza(Constants.Size size, Constants.Dough dough) {
        this.size = size;
        this.dough = dough;
    }

    public Pizza(Constants.PizzaType type, Constants.Size size, Constants.Dough dough, List<Constants.Toppings> toppings) {
        this.type = type;
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public Constants.PizzaType getType() {
        return type;
    }

    public void setType(Constants.PizzaType type) {
        this.type = type;
    }

    public List<Constants.Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Constants.Toppings> toppings) {
        this.toppings = toppings;
    }

    public Constants.Size getSize() {
        return size;
    }

    public void setSize(Constants.Size size) {
        this.size = size;
    }

    public Constants.Dough getDough() {
        return dough;
    }

    public void setDough(Constants.Dough dough) {
        this.dough = dough;
    }

    public void getPizzaDescription() {
        System.out.println("");
        System.out.println(this.type + " > size:" + this.size.description + ", dough:  " + this.dough.description);
        System.out.println("            toppings:  " + toppings);
    }

}

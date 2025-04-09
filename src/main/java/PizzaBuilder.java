import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements PizzaBuilderInterface {

    Constants.PizzaType type;
    Constants.Size size;
    Constants.Dough dough;
    List<Constants.Toppings> toppings = new ArrayList<Constants.Toppings>();

    @Override
    public void setPizzaType(Constants.PizzaType pizzaType) {
        this.type = pizzaType;
    }

    @Override
    public void setSize(Constants.Size size) {
        this.size = size;
    }

    @Override
    public void setDough(Constants.Dough dough) {
        this.dough = dough;
    }

    @Override
    public void setToppings(List<Constants.Toppings> toppings) {
        this.toppings = toppings;
    }

    public List<Constants.Toppings> getToppings() {
        return toppings;
    }

    public Constants.PizzaType getPizzaType() {
        return this.type;
    }

    public Constants.Size getSize() {
        return this.size;
    }

    public Constants.Dough getDough() {
        return this.dough;
    }

    public Pizza getPizza() {
        Pizza pizza = new Pizza( this.type, this.size, this.dough, getToppings());
        return pizza;
    }

}

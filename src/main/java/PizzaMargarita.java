import java.util.ArrayList;
import java.util.List;

public class PizzaMargarita implements PizzaBuilderInterface {

    final Constants.PizzaType type = Constants.PizzaType.MARGARITA;
    Constants.Size size;
    Constants.Dough dough;
    List<Constants.Toppings> toppings = new ArrayList<Constants.Toppings>();

    public PizzaMargarita(PizzaBuilderInterface pB) {
        this.size = pB.getSize();
        this.dough = pB.getDough();
        this.toppings = getToppings();
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
    public Constants.PizzaType getPizzaType() {
        return this.type;
    }

    @Override
    public Constants.Size getSize() {
        return this.size;
    }

    @Override
    public Constants.Dough getDough() {
        return this.dough;
    }

    public void setToppings(List<Constants.Toppings> toppings) {
        this.toppings = toppings;
    }

    @Override
    public void addToppings(Constants.Toppings pizzaTopping) {
        this.toppings.add(pizzaTopping);
    }


    public List<Constants.Toppings> getToppings() {
        toppings.add(Constants.Toppings.MOZZARELLA_CHEESE);
        toppings.add(Constants.Toppings.FRESH_BASIL_LEAVES);
        toppings.add(Constants.Toppings.OLIVE_OIL);
        return toppings;
    }

    public Pizza getPizza() {
        Pizza pizza = new Pizza( this.type, this.size, this.dough, this.toppings);
        return pizza;
    }

}

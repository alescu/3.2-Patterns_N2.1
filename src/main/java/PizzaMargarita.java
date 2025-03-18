import java.util.List;

public class PizzaMargarita implements PizzaBuilder{

    Pizza pizza;

    public PizzaMargarita(String size, String dough) {
        this.pizza = new Pizza("Margarita", size, dough);
    }

    @Override
    public void setSize(String _size) {
        this.pizza.size=_size;
    }

    @Override
    public void setDough(String _dought) {
        this.pizza.dough=_dought;
    }

    @Override
    public void setToppings() {
        this.pizza.toppings.add(PizzaConstants.Toppings.MOZZARELLA_CHEESE.toString());
        this.pizza.toppings.add(PizzaConstants.Toppings.FRESH_BASIL_LEAVES.toString());
        this.pizza.toppings.add(PizzaConstants.Toppings.OLIVE_OIL.toString());
    }

    @Override
    public void getPizzaDescription(){
        System.out.println(this.pizza.name + " > size:" + pizza.size + ", dough:  " + pizza.dough);
    }

}

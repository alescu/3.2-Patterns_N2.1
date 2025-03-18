import java.util.List;

public class PizzaMargarita implements PizzaBuilder{

    Pizza pizza;

    public PizzaMargarita(PizzaConstants.Size size, PizzaConstants.Dough dough) {
        this.pizza = new Pizza("Margarita", size, dough);
    }

    @Override
    public void setSize(PizzaConstants.Size _size) {
        this.pizza.size=_size;
    }

    @Override
    public void setDough(PizzaConstants.Dough _dough) {
        this.pizza.dough=_dough;
    }

    @Override
    public void setToppings() {
        this.pizza.toppings.add(PizzaConstants.Toppings.MOZZARELLA_CHEESE.toString());
        this.pizza.toppings.add(PizzaConstants.Toppings.FRESH_BASIL_LEAVES.toString());
        this.pizza.toppings.add(PizzaConstants.Toppings.OLIVE_OIL.toString());
    }

    @Override
    public void getPizzaDescription(){
        System.out.println(this.pizza.name + " > size:" + this.pizza.size.description + ", dough:  " + this.pizza.dough.description);
    }

}

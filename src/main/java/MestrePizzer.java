import java.util.List;

public class MestrePizzer {

    public Pizza createCarbonaraPizza(Constants.Size size, Constants.Dough dough) {
        PizzaBuilderInterface pizzaBuilder = new PizzaCarbonaraBuilder();
        return pizzaBuilder.setSize(size).setDough(dough).build();
    }

    public Pizza createHawaiianPizza(Constants.Size size, Constants.Dough dough) {
        PizzaBuilderInterface pizzaBuilder = new PizzaHawaianBuilder();
        return pizzaBuilder.setSize(size).setDough(dough).build();
    }

    public Pizza createMargaritaPizza(Constants.Size size, Constants.Dough dough) {
        PizzaBuilderInterface pizzaBuilder = new PizzaMargaritaBuilder();
        return pizzaBuilder.setSize(size).setDough(dough).build();
    }

    public Pizza createGenericPizzaPizza(String name, Constants.Size size, Constants.Dough dough,
                                 List<Constants.Toppings> toppingsList) {
        PizzaBuilderInterface pizzaBuilder = new PizzaBuilder();
        return pizzaBuilder.setPizzaType(name).setSize(size)
                .setDough(dough).setToppings(toppingsList).build();
    }

}

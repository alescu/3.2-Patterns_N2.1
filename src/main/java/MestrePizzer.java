import java.util.List;

public class MestrePizzer {

    public Pizza getPizzaCarbonara(Constants.Size size, Constants.Dough dough) {
        PizzaBuilderInterface pizzaBuilder = new PizzaCarbonaraBuilder();
        return pizzaBuilder.setSize(size).setDough(dough).build();
    }

    public Pizza getPizzaHawaian(Constants.Size size, Constants.Dough dough) {
        PizzaBuilderInterface pizzaBuilder = new PizzaHawaianBuilder();
        return pizzaBuilder.setSize(size).setDough(dough).build();
    }

    public Pizza getPizzaMargarita(Constants.Size size, Constants.Dough dough) {
        PizzaBuilderInterface pizzaBuilder = new PizzaMargaritaBuilder();
        return pizzaBuilder.setSize(size).setDough(dough).build();
    }

    public Pizza getPizzaGeneric(String name, Constants.Size size, Constants.Dough dough,
                                 List<Constants.Toppings> toppingsList) {
        PizzaBuilderInterface pizzaBuilder = new PizzaBuilder();
        return pizzaBuilder.setPizzaType(name).setSize(size)
                .setDough(dough).setToppings(toppingsList).build();
    }

}

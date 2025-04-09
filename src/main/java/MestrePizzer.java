public class MestrePizzer {

    public void getPizzaCarbonara(PizzaBuilderInterface pizzaBuilder) {
        pizzaBuilder.setPizzaType(Constants.PizzaType.CARBONARA);
        pizzaBuilder.setSize(Constants.Size.MEDIUM);
        pizzaBuilder.setDough(Constants.Dough.THIN);
    }

    public void getPizzaHawaian(PizzaBuilderInterface pizzaBuilder) {
        pizzaBuilder.setPizzaType(Constants.PizzaType.HAWAIIAN);
        pizzaBuilder.setSize(Constants.Size.MEDIUM);
        pizzaBuilder.setDough(Constants.Dough.THIN);
    }

    public void getPizzaMargarita(PizzaBuilderInterface pizzaBuilder) {
        pizzaBuilder.setPizzaType(Constants.PizzaType.MARGARITA);
        pizzaBuilder.setSize(Constants.Size.MEDIUM);
        pizzaBuilder.setDough(Constants.Dough.THIN);
    }

}

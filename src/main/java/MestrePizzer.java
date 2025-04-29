public class MestrePizzer {

    private PizzaBuilderInterface pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilderInterface pb) {
        this.pizzaBuilder = pb;
    }

    public Pizza buildPizza(){
        return this.pizzaBuilder.getPizza();
    }

    public PizzaBuilderInterface getPizzaCarbonara(Constants.Size size, Constants.Dough dough) {
        pizzaBuilder.setSize(size).setDough(dough);
        return pizzaBuilder;
    }

    public PizzaBuilderInterface getPizzaHawaian(Constants.Size size, Constants.Dough dough) {
        pizzaBuilder.setSize(size).setDough(dough);
        return pizzaBuilder;
    }

    public PizzaBuilderInterface getPizzaMargarita(Constants.Size size, Constants.Dough dough) {
        pizzaBuilder.setSize(size).setDough(dough);
        return pizzaBuilder;
    }

}

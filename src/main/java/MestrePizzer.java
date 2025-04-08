public class MestrePizzer {

    public Pizza getPizza(PizzaBuilderInterface pizzaBuilder){
        return getPizza( pizzaBuilder, null);
    }

    public Pizza getPizza(PizzaBuilderInterface pizzaBuilder, Constants.PizzaType pizzaType ) {
        switch(pizzaType){
            case Constants.PizzaType.CARBONARA:
                return (new PizzaCarbonara(pizzaBuilder)).getPizza();
            case Constants.PizzaType.MARGARITA:
                return (new PizzaMargarita(pizzaBuilder)).getPizza();
            case Constants.PizzaType.HAWAIIAN:
                return (new PizzaHawaiian(pizzaBuilder)).getPizza();
            default:
                return new Pizza(pizzaBuilder);
        }
    }

}

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pizza> pizzaOrderList = new ArrayList<>();
        MestrePizzer mestrePizzer = new MestrePizzer();

        PizzaBuilderInterface pizzaCarbonara = new PizzaCarbonaraBuilder();
        mestrePizzer.setPizzaBuilder(pizzaCarbonara);
        mestrePizzer.getPizzaCarbonara(Constants.Size.LITTLE, Constants.Dough.THIN);
        pizzaOrderList.add(pizzaCarbonara.getPizza());

        PizzaBuilderInterface pizzaHawaian = new PizzaHawaianBuilder();
        mestrePizzer.setPizzaBuilder(pizzaHawaian);
        mestrePizzer.getPizzaCarbonara(Constants.Size.FAMILY, Constants.Dough.THICK);
        pizzaOrderList.add(pizzaHawaian.getPizza());

        PizzaBuilderInterface pizzaMargarita = new PizzaMargaritaBuilder();
        mestrePizzer.setPizzaBuilder(pizzaMargarita);
        mestrePizzer.getPizzaCarbonara(Constants.Size.LITTLE, Constants.Dough.THIN);
        pizzaOrderList.add(pizzaMargarita.getPizza());

        System.out.println("\nToday order list:");
        for (Pizza pizza : pizzaOrderList) {
            pizza.getPizzaDescription();
        }

    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pizza> pizzaOrderList = new ArrayList<>();
        MestrePizzer mestrePizzer = new MestrePizzer();

        Pizza pizza = mestrePizzer.createCarbonaraPizza(Constants.Size.LITTLE, Constants.Dough.THIN);
        pizzaOrderList.add(pizza);

        pizza = mestrePizzer.createMargaritaPizza(Constants.Size.FAMILY, Constants.Dough.THICK);
        pizzaOrderList.add(pizza);

        pizza = mestrePizzer.createHawaiianPizza(Constants.Size.MEDIUM, Constants.Dough.THIN);
        pizzaOrderList.add(pizza);

        List<Constants.Toppings> toppingsMixta = new ArrayList<Constants.Toppings>();
        toppingsMixta.add(Constants.Toppings.MOZZARELLA_CHEESE);
        toppingsMixta.add(Constants.Toppings.FRESH_BASIL_LEAVES);
        toppingsMixta.add(Constants.Toppings.BACON);
        toppingsMixta.add(Constants.Toppings.EGG);
        toppingsMixta.add(Constants.Toppings.PARMESAN_CHEESE);
        toppingsMixta.add(Constants.Toppings.BLACK_PEPPER);
        toppingsMixta.add(Constants.Toppings.OLIVE_OIL);

        pizza = mestrePizzer.createGenericPizzaPizza("Mixta Margarita / carbonara", Constants.Size.FAMILY, Constants.Dough.THIN, toppingsMixta);
        pizzaOrderList.add(pizza);

        System.out.println("\nToday order list:");
        for (Pizza pizzaItem : pizzaOrderList) {
            pizzaItem.getPizzaDescription();
        }
        System.out.println("\n\n");
    }
}

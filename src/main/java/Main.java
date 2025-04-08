import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Builder
        Desenvolupa un sistema de gestió de comandes de pizzes utilitzant el patró de disseny Builder en Java.
        El sistema ha de permetre la creació de diferents tipus de pizzes amb configuracions de mida, massa i ingredients diferents.

        Defineix una classe Pizza amb els següents atributs:
            size (mida)
            dough (tipus de massa)
            toppings (ingredients)

        Crea una interfície PizzaBuilder amb els mètodes necessaris per configurar la mida, la massa i els ingredients d'una pizza.
        Implementa una o més classes que actuïn com a constructors concrets (PizzaBuilder) per a diferents tipus de pizzes.
        Per exemple, podries tenir un constructor per a la pizza hawaiana, un altre per a la pizza vegetariana, etc.

        Desenvolupa una classe MestrePizzer que rebi un PizzaBuilder i que permeti construir pizzes de manera específica.
        En el programa principal (Main), crea instàncies de PizzaBuilder i de MestrePizzer, i utilitza'ls per
        construir pizzes amb diferents configuracions.
        */
        List<Pizza> pizzaOrderList = new ArrayList<>();
        MestrePizzer mestrePizzer = new MestrePizzer();

        PizzaBuilderInterface pizzaBuilder1 = new PizzaBuilder(Constants.Size.FAMILY, Constants.Dough.FILLEDWITHCHEESE);
        pizzaOrderList.add(mestrePizzer.getPizza(pizzaBuilder1, Constants.PizzaType.MARGARITA));

        PizzaBuilderInterface pizzaBuilder2 = new PizzaBuilder(Constants.Size.MEDIUM, Constants.Dough.THICK);
        pizzaOrderList.add(mestrePizzer.getPizza(pizzaBuilder2, Constants.PizzaType.CARBONARA));

        PizzaBuilderInterface pizzaBuilder3 = new PizzaBuilder(Constants.Size.LITTLE, Constants.Dough.FILLEDWITHCHEESE);
        pizzaOrderList.add(mestrePizzer.getPizza(pizzaBuilder3, Constants.PizzaType.HAWAIIAN));

        System.out.println("\nToday order list:\n");
        for (Pizza pizza : pizzaOrderList) {
            pizza.getPizzaDescription();
        }

    }
}

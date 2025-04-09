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

        PizzaCarbonara pizzaCarbonara = new PizzaCarbonara();
        mestrePizzer.getPizzaCarbonara(pizzaCarbonara);
        pizzaOrderList.add(pizzaCarbonara.getPizza());

        PizzaHawaiian pizzaHawaian = new PizzaHawaiian();
        mestrePizzer.getPizzaHawaian(pizzaHawaian);
        pizzaOrderList.add(pizzaHawaian.getPizza());

        PizzaMargarita pizzaMargarita = new PizzaMargarita();
        mestrePizzer.getPizzaHawaian(pizzaMargarita);
        pizzaOrderList.add(pizzaMargarita.getPizza());

        System.out.println("\nToday order list:");
        for (Pizza pizza : pizzaOrderList) {
            pizza.getPizzaDescription();
        }

    }
}

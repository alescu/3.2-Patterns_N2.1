import java.util.List;

public class Main {
    public static void main(String[] args){
        /*
        Builder
        Desenvolupa un sistema de gestió de comandes de pizzes utilitzant el patró de disseny Builder en Java. El sistema ha de permetre la creació de diferents tipus de pizzes amb configuracions de mida, massa i ingredients diferents.

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

        PizzaBuilder pizzaBuilder1 = new PizzaMargarita(PizzaConstants.Size.FAMILY, PizzaConstants.Dough.FILLEDWITHCHEESE);
        MestrePizzer mestrePizzer = new MestrePizzer(pizzaBuilder1);

        PizzaBuilder pizzaBuilder2 = new PizzaMargarita(PizzaConstants.Size.MEDIUM, PizzaConstants.Dough.THICK);
        mestrePizzer.addPizza(pizzaBuilder2);

        PizzaBuilder pizzaBuilder3 = new PizzaCarbonara(PizzaConstants.Size.FAMILY, PizzaConstants.Dough.THIN);
        mestrePizzer.addPizza(pizzaBuilder3);

        System.out.println("Today order list:");
        for(PizzaBuilder pizzaBuilder : mestrePizzer.getPizzaBuilderList()){
            pizzaBuilder.getPizzaDescription();
        }

    }
}

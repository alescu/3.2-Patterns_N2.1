public class Constants {
    public enum Size {
        LITTLE("Little"),
        MEDIUM("Medium"),
        FAMILY("Family");
        public final String description;
        Size(String size) {
            this.description=size;
        }
    }

    public enum Dough {
        THIN("Thin"), THICK("Thick"), FILLEDWITHCHEESE("Filled with cheese");
        public final String description;
        Dough(String dough) {
            this.description=dough;
        }
    }

    public enum Toppings {
        MOZZARELLA_CHEESE, FRESH_BASIL_LEAVES, OLIVE_OIL,
        BACON, EGG, PARMESAN_CHEESE, BLACK_PEPPER,
        PIZZA_SAUCE, CHEESE, COOKED_HAM, PINEAPPLE;
    }

}

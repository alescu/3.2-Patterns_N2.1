import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    String size;
    String dough;
    List<String> toppings = new ArrayList<>();

    public Pizza(String name, String size, String dough) {
        this.size = size;
        this.dough = dough;
    }

}

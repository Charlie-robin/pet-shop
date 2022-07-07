import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private final String name;
    private final String address;

    // AGGREGATION -> PETSHOP HAS ONE OR MORE ANIMALS
    private final List<Animal> animals = new ArrayList<>();

    public PetShop(String name, String address) {
        this.name = name;
        this.address = address;
        // CAT / DOG IS-A-ANIMAL
        animals.add(new Cat("Lelo", "persian"));
        animals.add(new Dog("Rusty", "pug"));
    }

    public String getName() {
        return name;
    }

    public void sellPet(Customer customer){
        Animal purchasedAnimal = animals.remove(0);
        customer.setMyAnimal(purchasedAnimal);
        System.out.println(name + " sold " + purchasedAnimal.getName() + " to " + customer.getName());
    }
}

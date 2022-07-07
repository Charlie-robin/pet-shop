// ABSTRACT CLASS CAN'T BE CREATE HAS TO BE INHERITED FROM
public abstract class Animal {
    private final String name;
    private final String breed;

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    // SUB CLASSES HAVE TO IMPLEMENT IT
    public abstract void makeSound();
}

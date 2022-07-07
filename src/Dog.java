public class Dog extends Animal {
    public Dog(String name, String breed) {
        super(name, breed);
    }

    public void fetchStick(){
        System.out.println("Fetching stick");
    }

    @Override
    public void makeSound() {
        System.out.println("Wooofffffff");
    }
}

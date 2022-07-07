public class Cat extends Animal {

    public Cat(String name, String breed) {
        super(name, breed);
    }

    public void scratch(){
        System.out.println("Scratch");
    }

    @Override
    public void makeSound() {
        System.out.println("Meeeeeeooooooooowww");
    }


}

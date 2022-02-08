public class AnimalFactory {
    public Animal getAnimail(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}

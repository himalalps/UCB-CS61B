public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(61);
//        d1.makeNoise();
        Dog d2 = new Dog(100);
//        Dog bigger = Dog.maxDog(d1, d2);
        Dog bigger = d1.maxDog(d2);
        bigger.makeNoise();

//        System.out.println(d1.binomen);
//        System.out.println(d2.binomen);
        System.out.println(Dog.binomen);
    }
}

/**
 * Dog smallDog; Declaration
 * new Dog(20); Instantiation
 * smallDog = new Dog(5); Instantiation and Assignment
 * Dog hugeDog = new Dog(150); Declaration, Instantiation and Assignment
 * hugeDog.makeNoise(); Invocation
 */
public class Dog {
    // instance variable
    public int weightInPounds;
    public static String binomen = "Canis familiariis";

    // constructor
    public Dog() {

    }

    /** One integer constructor for dogs. **/
    public Dog(int w) {
        weightInPounds = w;
    }

    // non-static method OR instance method
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woooof!");
        }
    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    }
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }
}

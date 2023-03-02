public class DogProblem {
    public static Dog[] largerThanFourNeighbours(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt = 0;
        for (int i = 0; i < dogs.length; i += 1) {
            if (isBiggestOfFour(dogs, i)) {
                returnDogs[cnt] = dogs[i];
                cnt = cnt + 1;
            }
        }
        returnDogs = arrayWithNoNulls(returnDogs, cnt);
        return returnDogs;
    }

    public static Dog[] arrayWithNoNulls(Dog[] dogs, int cnt) {
        Dog[] noNullDogs = new Dog[cnt];
        for (int i = 0; i < cnt; i += 1) {
            noNullDogs[i] = dogs[i];
        }
        return noNullDogs;
    }

    public static boolean isBiggestOfFour(Dog[] dogs, int i) {
        boolean isBiggest = true;
        for (int j = -2; j <= 2; j += 1) {
            int compareIndex = i + j;
            if (validIndex(dogs, compareIndex) && compareIndex != i) {
                if (dogs[compareIndex].weightInPounds >= dogs[i].weightInPounds) {
                    isBiggest = false;
                }
            }
        }
        return isBiggest;
    }

    public static boolean validIndex(Dog[] dogs, int i) {
        if (i < 0) {
            return false;
        } else if (i >= dogs.length) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog(10),
                new Dog(15),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(15),
                new Dog(20)
        };
        Dog[] bigDogs1 = largerThanFourNeighbours(dogs);

        for (int k = 0; k < bigDogs1.length; k += 1) {
            System.out.print(bigDogs1[k].weightInPounds + " ");
        }
        System.out.println();
    }
}

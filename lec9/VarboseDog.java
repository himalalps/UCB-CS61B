public class VarboseDog extends Dog {
    @Override
    public void barkMany(int N) {
        System.out.println("As a dog, I say: ");
        for (int i = 0; i < N; i += 1) {
            bark();
        }
    }
}


public class Beecrowd1155 {
    public static void main(String[] agrs) {
        float S = 1;
        float X, i;

        for (i = 3, X = 2; i <= 39; i += 2, X *= 2) {

            S += i / X;

        }
        System.out.printf("Valor e: %.2f ", S);
    }

}

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro:");
        int firstParameter = sc.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int secondParameter = sc.nextInt();
        sc.close();

        try {
            count(firstParameter, secondParameter);
        } catch (InvalidParametersException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }
    }

    static void count(int firstParameter, int secondParameter) throws InvalidParametersException {

        if (firstParameter >= secondParameter) {
            throw new InvalidParametersException();
        }
        int result = secondParameter - firstParameter;

        for (int index = 1; index <= result; index++) {
            System.out.println("Imprimindo o número " + index);
        }
    }
}

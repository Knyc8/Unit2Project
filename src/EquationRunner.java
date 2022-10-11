import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first x-y coordinate point: ");
        String firstPair = s.nextLine();
        System.out.print("Enter the second x-y coordinate point: ");
        String secondPair = s.nextLine();

        System.out.println(firstPair);
        System.out.println(secondPair);
    }
}

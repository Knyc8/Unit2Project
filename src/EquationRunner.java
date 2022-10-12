import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first x-y coordinate point: ");                                                     //Asks the user for the first pair
        String firstPair = s.nextLine();
        System.out.print("Enter the second x-y coordinate point: ");                                                    //Asks the user for the second pair
        String secondPair = s.nextLine();

        int x1 = Integer.parseInt(firstPair.substring(1, firstPair.indexOf(",")));                                      //finds the first x-value
        int y1 = Integer.parseInt(firstPair.substring(firstPair.indexOf(",") + 1, firstPair.length() -1));              //find the first y-value
        int x2 = Integer.parseInt(secondPair.substring(1, secondPair.indexOf(",")));                                    //finds the second x-value
        int y2 = Integer.parseInt(secondPair.substring(secondPair.indexOf(",") + 1, firstPair.length() -1));            //finds the second y-value

        LinearEquation line = new LinearEquation(x1, y1, x2, y2);
        System.out.println(line.calcDeltaY()/line.calcDeltaX());
        System.out.println(line.displaySIForm());
        System.out.println(line.calcDistance());
    }
}

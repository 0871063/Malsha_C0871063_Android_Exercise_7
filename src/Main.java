import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Provide the number : ");
        number = keyboard.nextInt();

        int actualNumber = number;

        while (number > 0) {
            count++;
            if (number % 3 == 0) {
                number = number + 4;
            } else if (number % 4 == 0) {
                number = number / 2;
            } else if (number % 4 != 0 || number % 3 != 0) {
                number = number - 1 ;
            }
        }
        System.out.printf(" %d -> %d \n ", actualNumber , count);
    }
}
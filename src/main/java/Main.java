import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną do obliczenia silni: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Silnia z liczby ujemnej nie istnieje!");
            } else {
                long silnia = 1;
                for (int i = 1; i <= n; i++) {
                    silnia *= i;
                }
                System.out.println(n + "! = " + silnia);
            }
        } else {
            System.out.println("Podano nieprawidłową wartość.");
        }

        scanner.close();
    }
}
//Zad.1
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj dodatnią liczbę całkowitą: ");
//        int n = scanner.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Liczba musi być dodatnia!");
//        } else {
//            System.out.print("Wynik: ");
//            for (int i = 1; i <= n; i += 2) {
//                System.out.print(i);
//                if (i + 2 <= n) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//}
//Zad.2
import java.util.Scanner;

public class Main {
    public static void main(String[] Object) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią n: ");
        int n = scanner.nextInt();

        int potega = 1;

        while (potega <= n) {
            System.out.print(potega + " ");
            potega *= 2;
        }
        System.out.println();
        scanner.close();
    }
}


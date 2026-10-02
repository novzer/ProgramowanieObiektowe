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
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] Object) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj liczbę całkowitą dodatnią n: ");
//        int n = scanner.nextInt();
//
//        int potega = 1;
//
//        while (potega <= n) {
//            System.out.print(potega + " ");
//            potega *= 2;
//        }
//        System.out.println();
//        scanner.close();
//    }
//}
//Zad.3
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int suma = 0;
//        int liczba;
//
//        System.out.println("Podawaj liczby (wpisanie 0 kończy program):");
//
//        do {
//            liczba = scanner.nextInt();
//            suma += liczba;
//        } while (liczba != 0);
//
//        System.out.println("Suma podanych liczb to: " + suma);
//
//        scanner.close();
//    }
//}
//Zad.4
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int suma = 0;
//        int liczba;
//        int min = 0;
//        int max = 0;
//        int ileLiczb = 0;
//
//        System.out.println("Podawaj liczby (wpisanie 0 kończy program):");
//
//        do {
//            liczba = scanner.nextInt();
//
//            if (liczba != 0) {
//                suma += liczba;
//                ileLiczb++;
//
//                if (ileLiczb == 1) {
//                    min = liczba;
//                    max = liczba;
//                } else {
//                    if (liczba < min) {
//                        min = liczba;
//                    }
//
//                    if (liczba > max) {
//                        max = liczba;
//                    }
//                }
//            }
//
//        } while (liczba != 0);
//
//        if (ileLiczb > 0) {
//            double srednia = (double) suma / ileLiczb;
//
//            System.out.println("Najmniejsza liczba: " + min);
//            System.out.println("Największa liczba: " + max);
//            System.out.println("Suma najmniejszej i największej liczby: " + (min + max));
//            System.out.println("Średnia arytmetyczna: " + srednia);
//        } else {
//            System.out.println("Nie podano żadnych liczb.");
//        }
//
//        scanner.close();
//    }
//}
//Zad.5
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Random random = new Random();
//        int wylosowanaLiczba = random.nextInt(100) + 1;
//
//
//        Scanner scanner = new Scanner(System.in);
//        int podanaLiczba = 0;
//
//        System.out.println("Zgadnij liczbę z zakresu od 1 do 100.");
//
//
//        while (podanaLiczba != wylosowanaLiczba) {
//            System.out.print("Podaj swoją liczbę: ");
//            podanaLiczba = scanner.nextInt();
//
//            if (podanaLiczba > wylosowanaLiczba) {
//                System.out.println("Podałeś za dużą wartość.");
//            } else if (podanaLiczba < wylosowanaLiczba) {
//                System.out.println("Podałeś za małą wartość.");
//            } else {
//                System.out.println("Gratulacje! Odgadłeś liczbę.");
//            }
//        }
//
//        scanner.close();
//    }
//}
//Zad.6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    }
}

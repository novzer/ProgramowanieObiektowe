//Zad.1
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj liczbę: ");
//        int liczba = scanner.nextInt();
//
//        if (liczba % 3 == 0) {
//            System.out.println("Liczba jest podzielna przez 3.");
//        } else {
//            System.out.println("Liczba nie jest podzielna przez 3.");
//        }
//
//        scanner.close();
//    }
//}
//Zad.2
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj pierwszą liczbę: ");
//        int liczba1 = scanner.nextInt();
//
//        System.out.print("Podaj drugą liczbę: ");
//        int liczba2 = scanner.nextInt();
//
//        System.out.print("Podaj trzecią liczbę: ");
//        int liczba3 = scanner.nextInt();
//
//        if (liczba1 > 0 && liczba2 > 0 && liczba3 > 0 &&
//                liczba1 + liczba2 > liczba3 &&
//                liczba1 + liczba3 > liczba2 &&
//                liczba2 + liczba3 > liczba1)  {
//            System.out.println("Z tych liczb może zostać zbudowany trójkąt");
//        } else {
//            System.out.println("Z tych liczb nie może zostać zbudowany trójkąt");
//        }
//
//        scanner.close();
//    }
//}
//Zad.3
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj pierwszą liczbę: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Podaj drugą liczbę: ");
//        int b = scanner.nextInt();
//
//
//        if (a > b)  {
//            System.out.println("Największą z liczb jest pierwsza");
//        } else {
//            System.out.println("Największą z liczb jest druga");
//        }
//
//        scanner.close();
//    }
//}
//Zad.4
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj pierwszą liczbę: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Podaj drugą liczbę: ");
//        int b = scanner.nextInt();
//
//        System.out.print("Podaj trzecią liczbę: ");
//        int c = scanner.nextInt();
//
//        int najwieksza = Math.max(a, Math.max(b, c));
//
//        System.out.println("Największa liczba to: " + najwieksza);
//    }
//}
//Zad.5
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj numer miesiąca (1-12): ");
//        int numerMiesiaca = scanner.nextInt();
//
//        String nazwaMiesiaca = switch (numerMiesiaca) {
//            case 1 -> "Styczeń";
//            case 2 -> "Luty";
//            case 3 -> "Marzec";
//            case 4 -> "Kwiecień";
//            case 5 -> "Maj";
//            case 6 -> "Czerwiec";
//            case 7 -> "Lipiec";
//            case 8 -> "Sierpień";
//            case 9 -> "Wrzesień";
//            case 10 -> "Październik";
//            case 11 -> "Listopad";
//            case 12 -> "Grudzień";
//            default -> "Nieprawidlowy numer miesiaca";
//        };
//
//        System.out.println(nazwaMiesiaca);
//
//        scanner.close();
//    }
//}


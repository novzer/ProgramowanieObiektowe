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
//Zad.6
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj swoje imię: ");
//        String imie = scanner.nextLine();
//
//        String mojeImie = "Bartek";
//
//        if (imie.equals(mojeImie)) {
//            System.out.println("Masz takie samo imię jak ja.");
//        } else {
//            System.out.println("Masz inne imię niż ja.");
//        }
//    }
//}
//Zad.7
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj swój wiek: ");
//        int wiek = scanner.nextInt();
//
//        boolean pelnoletni = wiek >= 18 ? true : false;
//
//        System.out.println("Czy jesteś pełnoletni? " + pelnoletni);
//    }
//}
//Zad.8
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj rok: ");
//        int rok = scanner.nextInt();
//
//        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
//            System.out.println("Rok jest przestępny.");
//        } else {
//            System.out.println("Rok nie jest przestępny.");
//        }
//    }
//}
//Zad.9
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj wagę w kg: ");
//        double waga = scanner.nextDouble();
//
//        System.out.print("Podaj wzrost w metrach: ");
//        double wzrost = scanner.nextDouble();
//
//        double bmi = waga / (wzrost * wzrost);
//
//        System.out.println("Twoje BMI: " + bmi);
//
//        if (bmi < 18.5) {
//            System.out.println("Niedowaga");
//        } else if (bmi <= 24.9) {
//            System.out.println("Waga prawidłowa");
//        } else {
//            System.out.println("Nadwaga");
//        }
//    }
//}
//Zad.10
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double cena = 0;
//        int liczbaRat = 0;
//        while (true) {
//            System.out.print("Podaj cenę towaru (od 100 do 10 000 zł): ");
//            if (scanner.hasNextDouble()) {
//                cena = scanner.nextDouble();
//                if (cena >= 100 && cena <= 10000) {
//                    break;
//                }
//            } else {
//                scanner.next();
//            }
//            System.out.println("Błąd! Cena musi mieścić się w przedziale od 100 do 10 000 zł.");
//        }
//        while (true) {
//            System.out.print("Podaj liczbę rat (od 6 do 48): ");
//            if (scanner.hasNextInt()) {
//                liczbaRat = scanner.nextInt();
//                if (liczbaRat >= 6 && liczbaRat <= 48) {
//                    break;
//                }
//            } else {
//                scanner.next();
//            }
//            System.out.println("Błąd! Liczba rat must mieścić się w przedziale od 6 do 48.");
//        }
//        double oprocentowanie = 0.0;
//        if (liczbaRat >= 6 && liczbaRat <= 12) {
//            oprocentowanie = 0.025; // 2.5%
//        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
//            oprocentowanie = 0.05;  // 5%
//        } else if (liczbaRat >= 25 && liczbaRat <= 48) {
//            oprocentowanie = 0.10;  // 10%
//        }
//        double kwotaZOdsetkami = cena * (1 + oprocentowanie);
//        double miesiecznaRata = kwotaZOdsetkami / liczbaRat;
//        System.out.printf("%n--- PODSUMOWANIE ---%n");
//        System.out.printf("Cena towaru: %.2f zł%n", cena);
//        System.out.printf("Liczba rat: %d%n", liczbaRat);
//        System.out.printf("Oprocentowanie: %.1f%%%n", oprocentowanie * 100);
//        System.out.printf("Łączna kwota do spłaty: %.2f zł%n", kwotaZOdsetkami);
//        System.out.printf("Wysokość miesięcznej raty: %.2f zł%n", miesiecznaRata);
//        scanner.close();
//    }
//}
//Zad.11
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Prosty Kalkulator Arytmetyczny ===");
        System.out.println("Program wykonuje operacje dodawania (+), odejmowania (-), ");
        System.out.println("mnożenia (*) oraz dzielenia (/) na dwóch liczbach rzeczywistych.\n");
        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();
        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);
        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();
        System.out.println("\n--- Wynik ---");
        switch (symbol) {
            case '+':
                System.out.println(liczba1 + " + " + liczba2 + " = " + (liczba1 + liczba2));
                break;
            case '-':
                System.out.println(liczba1 + " - " + liczba2 + " = " + (liczba1 - liczba2));
                break;
            case '*':
                System.out.println(liczba1 + " * " + liczba2 + " = " + (liczba1 * liczba2));
                break;
            case '/':
                // Identyfikacja próby dzielenia przez zero
                if (liczba2 == 0) {
                    System.out.println("Błąd: Nie można dzielić przez zero!");
                } else {
                    System.out.println(liczba1 + " / " + liczba2 + " = " + (liczba1 / liczba2));
                }
                break;
            default:
                System.out.println("Błąd: Wprowadzono niepoprawny symbol operacji ('" + symbol + "').");
                break;
        }

        scanner.close();
    }
}





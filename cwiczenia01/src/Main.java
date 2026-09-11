
void main() {
System.out.println("Hello world"); // Wypisz i zrób enter
    System.out.println("Skrót");
    System.out.println("Coś bez robienia entera");
    System.out.println("Nowa linia");
    System.out.println("W taki sposób robie znaki specjalne:");
    System.out.println("\t tabulacja");
    System.out.println("\n enter");
    System.out.println("To jest jak na maszynie \rdo pisania");
    System.out.println("\"cudzysłów\"");
    System.out.println("'\'apostrof\'");
    System.out.println("backflash: \\");

    int liczbaCalkowita = 5;
    double liczbaRzeczywista;

    liczbaRzeczywista = (double) liczbaCalkowita/2;


    System.out.println("Wynik dzielenia liczby 5 przez 2 to " + liczbaRzeczywista);

    char znak = 'a';
    System.out.println("Litera a ma wartość " + (znak + 0));

    String napis = "napis";
    System.out.println("Napis wielkimi literami: " + napis.toUpperCase());

    System.out.println("Wynik 1+ 2 + 3 = " + 1 + 2 + 3);
    System.out.println("Wynik 1 + 2 + 3 = " + (1 + 2 + 3));
    System.out.println(1 + 2 + 3 + "to wynik 1 + 2 + 3");
}

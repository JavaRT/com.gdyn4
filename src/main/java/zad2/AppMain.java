package zad2;

import zad1.Osoba;

import java.util.*;

public class AppMain {
        public static void main(String[] args) {
            List<OfertaSprzedazy> list = new ArrayList<>();

            list.add(new OfertaSprzedazy("Kompot", 2.3));
            list.add(new OfertaSprzedazy("Maslo", 2.0));
            list.add(new OfertaSprzedazy("Ser", 3.0));
            list.add(new OfertaSprzedazy("Bulka", 1.5));

            Scanner scanner = new Scanner(System.in);

            String komenda;
            do {
                System.out.println("Podaj komendę:");
                komenda = scanner.nextLine();

                if (komenda.equalsIgnoreCase("listuj")) {
                    list.forEach(System.out::println);
                    System.out.println();
                } else if (komenda.equalsIgnoreCase("sortuj malejaco")) {
                    Collections.sort(list, new OfertaComparator(true));
                } else if (komenda.equalsIgnoreCase("sortuj rosnaco")) {
                    Collections.sort(list, new OfertaComparator(false));
                } else if (komenda.startsWith("dodaj")) {

String [] slowa = komenda.split(" ");
String nazwa = slowa [1];
Double cena = Double.parseDouble(slowa[2]);
OfertaSprzedazy ofertaSprzedazy= new OfertaSprzedazy(nazwa, cena);
list.add(ofertaSprzedazy);
System.out.println("dodano :" + ofertaSprzedazy);


                } else if (!komenda.equalsIgnoreCase("quit")) {
                    System.err.println("Nie rozpoznałem komendy");
                }

            } while (!komenda.equalsIgnoreCase("quit"));
        }
    }
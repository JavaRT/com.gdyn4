package zad1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class AppMain {
    public static void main(String[] args) {
        List<Osoba> list = new ArrayList<>(Arrays.asList(
                new Osoba("q", "qq", 121),
                new Osoba("q2", "qq", 112),
                new Osoba("q3", "qq", 142),
                new Osoba("q4", "qq", 132),
                new Osoba("q22", "qq", 125)
                ));

        list.forEach(System.out::println);
        System.out.println();
        Collections.sort(list, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
               return Integer.compare(o1.getWiek(), o2.getWiek());
            }
        });
        list.forEach(System.out::println);
        System.out.println();
    }
}

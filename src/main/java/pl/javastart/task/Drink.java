package pl.javastart.task;

public class Drink {
    String nazwa;
    String cena;
    boolean czyAlkoholowy;
    Skladnik skladnik1;
    Skladnik skladnik2;
    Skladnik skladnik3;

    Drink(String n, String c, boolean a, String sn1, int sp1, String sn2, int sp2, String sn3, int sp3) {
        nazwa = n;
        cena = c;
        czyAlkoholowy = a;
        skladnik1 = new Skladnik(sn1, sp1);
        skladnik2 = new Skladnik(sn2, sp2);
        skladnik3 = new Skladnik(sn3, sp3);
    }

    int obliczPojemnosc() {
        return skladnik1.iloscSkladnika + skladnik2.iloscSkladnika + skladnik3.iloscSkladnika;
    }

    void pokazInfo() {
        int pojemnosc = obliczPojemnosc();
        System.out.printf("Drink: %s\nCena: %s\nCzy zawiera alkohol? %b\nSkładniki:\n%s\n%s\n%s\nPojemność:\n%dml\n",
                nazwa, cena, czyAlkoholowy, skladnik1.nazwa, skladnik2.nazwa, skladnik3.nazwa, pojemnosc);
    }
}
package pl.javastart.task;

import java.util.Arrays;

public class Firma {
    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private static final int ILOSC_PRZYCHODOW_I_WYDATKOW_POCZATKOWA = 10;
    private Przychod[] przychody = new Przychod[ILOSC_PRZYCHODOW_I_WYDATKOW_POCZATKOWA];
    private Wydatek[] wydatki = new Wydatek[ILOSC_PRZYCHODOW_I_WYDATKOW_POCZATKOWA];
    private int liczbaPrzychodow;
    private int liczbaWydatkow;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getName());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sumaWydatkow = 0;
        for (int i = 0; i < liczbaWydatkow; i++) {
            sumaWydatkow += wydatki[i].getWartosc();
        }

        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (int i = 0; i < liczbaPrzychodow; i++) {
            sumaPrzychodow += przychody[i].getWartosc();
        }

        return sumaPrzychodow;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        if (liczbaPrzychodow > przychody.length) {
            przychody = Arrays.copyOf(przychody, przychody.length * 2);
        }
        przychody[liczbaPrzychodow] = new Przychod(nazwa, wartosc);
        liczbaPrzychodow++;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        if (liczbaWydatkow > wydatki.length) {
            wydatki = Arrays.copyOf(wydatki, wydatki.length * 2);
        }
        wydatki[liczbaWydatkow] = new Wydatek(nazwa, wartosc);
        liczbaWydatkow++;
    }
}

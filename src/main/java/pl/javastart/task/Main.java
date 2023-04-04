package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();

        Firma budimex = new Firma("Budimex", new PodatekLiniowy());

        budimex.dodajPrzychod("Cegły", 15_000);
        budimex.dodajWydatek("Wypłaty", 5000);

        budimex.wyswietlPodsumowanie();

        Firma januszex = new Firma("Januszex", new SkalaPodatkowa());

        januszex.dodajPrzychod("Areczki", 13_000);
        januszex.dodajWydatek("Biczownicy", 3000);

        januszex.wyswietlPodsumowanie();
    }
}
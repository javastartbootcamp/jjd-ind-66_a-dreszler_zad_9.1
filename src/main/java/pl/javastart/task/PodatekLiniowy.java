package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    private static final double OPROCENTOWANIE_LINIOWE = 0.19;
    private String name = "podatek liniowy";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        if (wydatki > przychody) {
            System.out.println("Błąd - wydatki są mniejsze niż przychody");
            return ERROR;
        }

        double dochod = przychody - wydatki;

        return dochod * OPROCENTOWANIE_LINIOWE;
    }

    @Override
    public String getName() {
        return name;
    }
}

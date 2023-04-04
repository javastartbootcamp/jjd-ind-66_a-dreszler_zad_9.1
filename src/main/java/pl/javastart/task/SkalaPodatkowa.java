package pl.javastart.task;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final double KWOTA_WOLNA_OD_PODATKU = 10_000;
    private static final double PROG_PODATKOWY = 100_000;
    private static final double OPODATKOWANIE_PONIZEJ_PROGU = 0.18;
    private static final double OPODATKOWANIE_POWYZEJ_PROGU = 0.32;
    private String name = "skala podatkowa";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        if (wydatki > przychody) {
            System.out.println("Błąd - wydatki są mniejsze niż przychody");
            return ERROR;
        }

        double dochod = przychody - wydatki;

        if (dochod <= KWOTA_WOLNA_OD_PODATKU) {
            return 0;
        } else if (dochod <= PROG_PODATKOWY) {
            return (dochod - KWOTA_WOLNA_OD_PODATKU) * OPODATKOWANIE_PONIZEJ_PROGU;
        } else {
            double kwotaPowyzejProgu = dochod - PROG_PODATKOWY;
            return (PROG_PODATKOWY - KWOTA_WOLNA_OD_PODATKU) * OPODATKOWANIE_PONIZEJ_PROGU + kwotaPowyzejProgu *
                    OPODATKOWANIE_POWYZEJ_PROGU;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
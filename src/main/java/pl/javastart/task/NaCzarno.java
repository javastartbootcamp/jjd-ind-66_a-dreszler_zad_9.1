package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {
    private String name = "na czarno";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        if (wydatki > przychody) {
            System.out.println("Błąd - wydatki są mniejsze niż przychody");
            return ERROR;
        }

        return 0;
    }

    @Override
    public String getName() {
        return name;
    }
}

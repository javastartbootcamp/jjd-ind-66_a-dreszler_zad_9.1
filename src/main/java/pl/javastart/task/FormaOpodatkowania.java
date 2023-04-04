package pl.javastart.task;

public class FormaOpodatkowania {
    private String name = "BRAK";
    public static final double ERROR = -1;

    public double wyliczPodatek(double przychody, double wydatki) {
        System.out.println("Metoda z wyliczaniem podatku nie została nadpisana");
        return ERROR;
    }

    public String getName() {
        return name;
    }
}

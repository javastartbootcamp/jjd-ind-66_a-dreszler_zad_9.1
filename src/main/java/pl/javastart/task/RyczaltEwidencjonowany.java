package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    private static final double OPROCENTOWANIE_RYCZALTU = 0.15;
    private String name = "ryczałt ewidencjonowany";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return przychody * OPROCENTOWANIE_RYCZALTU;
    }

    @Override
    public String getName() {
        return name;
    }
}

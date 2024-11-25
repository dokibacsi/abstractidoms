package kozostarolo.model;

public abstract class AbstractFaIdom extends AbstractIdom{
    private static double fajsuly = 0.8;

    public double suly(){
        return terfogat() * fajsuly;
    }

    public abstract double terfogat();

    @Override
    public String toString() {
        return "AbstractFaIdom{}";
    }
}

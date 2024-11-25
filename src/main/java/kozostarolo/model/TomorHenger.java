package kozostarolo.model;

public class TomorHenger extends MertaniHenger {
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public void setFajsuly(double fajsuly) {
        this.fajsuly = fajsuly;
    }

    public double suly(){
       return terfogat() * fajsuly;
    }
    //gravitációs gyorsulás: 9.81

    @Override
    public String toString() {
        String os = super.toString();
        return os + " <|--- TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}

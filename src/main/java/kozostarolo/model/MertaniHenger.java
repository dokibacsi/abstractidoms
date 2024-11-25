package kozostarolo.model;

public class MertaniHenger extends AbstractIdom{
    private static int hengerDarab;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        MertaniHenger.hengerDarab++;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public static void setHengerDarab(int hengerDarab) {
        MertaniHenger.hengerDarab = hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }

    public double terfogat(){
        return (this.sugar * this.sugar) * Math.PI * this.magassag;
    }

    public static int getHengerDarab(){
        return MertaniHenger.hengerDarab;
    }
}

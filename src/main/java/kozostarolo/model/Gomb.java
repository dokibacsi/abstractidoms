package kozostarolo.model;

public class Gomb extends AbstractFaIdom{

    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return (((this.sugar * this.sugar * this.sugar) * 4) * Math.PI) / 3;
    }

    @Override
    public String toString() {
        return "Gomb{" +
                "sugar=" + sugar +
                '}';
    }
}

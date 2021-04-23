public abstract class Czworokat extends Figura {
    private final double[] boki;

    public Czworokat(double bok1, double bok2, double bok3, double bok4) {
        this.boki = new double[]{bok1, bok2, bok3, bok4};
    }

    @Override
    public double obliczObwod() {
        double obwod = 0;

        for(double d : boki) obwod += d;

        return obwod;
    }

    public double[] getBoki() { return boki; }
}

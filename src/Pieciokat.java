public class Pieciokat extends Figura {
    private final double bok;

    public Pieciokat(double bok) {
        this.bok = bok;
    }

    @Override
    public double obliczObwod() {
        return 5 * bok;
    }

    @Override
    public double obliczPole() {
        return bok * bok * Math.sqrt(25 + 10 * Math.sqrt(5)) / 4;
    }
}

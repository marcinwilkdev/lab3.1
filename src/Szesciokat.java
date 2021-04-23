public class Szesciokat extends Figura {
    private final double bok;

    public Szesciokat(double bok) {
        this.bok = bok;
    }

    @Override
    public double obliczObwod() {
        return 6 * bok;
    }

    @Override
    public double obliczPole() {
        return 3 * bok * bok * Math.sqrt(3) / 2;
    }
}

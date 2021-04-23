public class Romb extends Czworokat {
    private final double kat;

    public Romb(double bok, double kat) {
        super(bok, bok, bok, bok);

        this.kat = kat;
    }

    @Override
    public double obliczPole() {
        return getBoki()[0] * getBoki()[0] * Math.sin(Math.toRadians(kat));
    }
}

public class Prostokat extends Czworokat {
    public Prostokat(double bok1, double bok2) {
        super(bok1, bok2, bok1, bok2);
    }

    @Override
    public double obliczPole() {
        return getBoki()[0] * getBoki()[1];
    }
}

public class Kwadrat extends Czworokat {
    public Kwadrat(double bok) {
        super(bok, bok, bok, bok);
    }

    @Override
    public double obliczPole() {
        return getBoki()[0] * getBoki()[0];
    }
}

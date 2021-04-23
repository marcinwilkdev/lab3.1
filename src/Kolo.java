public class Kolo extends Figura {
    private final double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double obliczPole() {
        return Math.PI * promien * promien;
    }
}

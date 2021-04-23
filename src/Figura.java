public abstract class Figura implements Obliczalne {
    public void pokazPoleObwod() {
        System.out.printf("%s: pole = %.2f obwód = %.2f\n", this.getClass().getName(), obliczPole(), obliczObwod());
    }

    // Metody tworzące figury w zależności od argumentu typu enum

    public static Figura stworzFigure(JedenParametr figura, double p1) {
        switch (figura) {
            case KOLO -> { return new Kolo(p1); }
            case KWADRAT -> { return new Kwadrat(p1); }
            case PIECIOKAT -> { return new Pieciokat(p1); }
            case SZESCIOKAT -> { return new Szesciokat(p1); }
        }

        return null;
    }

    public static Figura stworzFigure(DwaParametry figura, double p1, double p2) {
        switch (figura) {
            case PROSTOKAT -> { return new Prostokat(p1, p2); }
            case ROMB -> { return new Romb(p1, p2); }
        }

        return null;
    }

    // Metody liczące pole w zależności od zmiennej enum

    public static double ObliczPole(JedenParametr figura, double p1) {
        return stworzFigure(figura, p1).obliczPole();
    }

    public static double ObliczObwod(JedenParametr figura, double p1) {
        return stworzFigure(figura, p1).obliczObwod();
    }

    public static double ObliczPole(DwaParametry figura, double p1, double p2) {
        return stworzFigure(figura, p1, p2).obliczPole();
    }

    public static double ObliczObwod(DwaParametry figura, double p1, double p2) {
        return stworzFigure(figura, p1, p2).obliczObwod();
    }

    enum JedenParametr {
        KOLO,
        KWADRAT,
        PIECIOKAT,
        SZESCIOKAT
    }

    enum DwaParametry {
        PROSTOKAT,
        ROMB
    }
}

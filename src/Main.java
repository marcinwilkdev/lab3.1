import java.util.*;

public class Main {
    public static void main(String[] args) {
        String figury;
        var tablica_figur = new ArrayList<Figura>();

        while(args.length == 0) {
            System.out.println("Podaj liste arguementow.");

            try (Scanner s = new Scanner(System.in)) {
                String temp = s.nextLine();
                args = temp.split(" ");
            }
        }

        figury = args[0];

        int argument_number = 1;

        for(int i=0; i<figury.length(); i++) {
            String figura = figury.toLowerCase().substring(i, i+1);

            switch (figura) {
                case "o" -> {
                    double promien;

                    try {
                        promien = Double.parseDouble(args[argument_number]);

                        if(promien > 0) tablica_figur.add(Figura.stworzFigure(Figura.JedenParametr.KOLO, promien));
                            else ObslugaWyjatkow.blednyArgument();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        ObslugaWyjatkow.zaMaloArgumentow();
                    } catch (NumberFormatException e) {
                        ObslugaWyjatkow.blednyArgument();
                    }

                    argument_number++;
                }
                case "p" -> {
                    double bok;

                    try {
                        bok = Double.parseDouble(args[argument_number]);

                        if(bok > 0) tablica_figur.add(Figura.stworzFigure(Figura.JedenParametr.PIECIOKAT, bok));
                            else ObslugaWyjatkow.blednyArgument();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        ObslugaWyjatkow.zaMaloArgumentow();
                    } catch (NumberFormatException e) {
                        ObslugaWyjatkow.blednyArgument();
                    }

                    argument_number++;
                }
                case "c" -> {
                    double[] boki = new double[4];

                    try {
                        for (int j = 0; j < 4; j++) {
                            boki[j] = Double.parseDouble(args[argument_number + j]);
                        }

                        double kat = Double.parseDouble(args[argument_number + 4]);

                        if (boki[0] > 0 && boki[1] > 0 && boki[2] > 0 && boki[3] > 0 && kat > 0 && kat < 180) {
                            Arrays.sort(boki);

                            if (boki[0] == boki[1]
                                    && boki[2] == boki[3]) {
                                if (boki[1] == boki[2]) {
                                    if (kat == 90) {
                                        tablica_figur.add(Figura.stworzFigure(Figura.JedenParametr.KWADRAT, boki[0]));
                                    } else {
                                        tablica_figur.add(Figura.stworzFigure(Figura.DwaParametry.ROMB, boki[0], kat));
                                    }
                                } else if (kat == 90) {
                                    tablica_figur.add(Figura.stworzFigure(Figura.DwaParametry.PROSTOKAT, boki[1], boki[2]));
                                } else ObslugaWyjatkow.blednyArgument();
                            } else ObslugaWyjatkow.blednyArgument();
                        } else {
                            ObslugaWyjatkow.blednyArgument();
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        ObslugaWyjatkow.zaMaloArgumentow();
                    } catch (NumberFormatException e) {
                        ObslugaWyjatkow.blednyArgument();
                    }

                    argument_number += 5;
                }
                case "s" -> {
                    double bok;

                    try {
                        bok = Double.parseDouble(args[argument_number]);
                        if (bok > 0) tablica_figur.add(Figura.stworzFigure(Figura.JedenParametr.SZESCIOKAT, bok));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        ObslugaWyjatkow.zaMaloArgumentow();
                    } catch (NumberFormatException e) {
                        ObslugaWyjatkow.blednyArgument();
                    }

                    argument_number++;
                }
                default -> ObslugaWyjatkow.blednyArgument();
            }
        }

        for(Figura f : tablica_figur) {
            f.pokazPoleObwod();
        }
    }
}

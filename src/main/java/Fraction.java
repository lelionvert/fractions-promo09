public class Fraction {

    private final int numerator;

    public Fraction(int i, int i1) {

        numerator = i;
    }

    public Fraction add(Fraction fraction) {
        if (fraction.numerator == 0)
            return this;
        return fraction;
    }
}

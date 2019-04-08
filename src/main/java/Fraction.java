public class Fraction {

    private final int numerator;

    public Fraction(int numerator, int i1) {
        this.numerator = numerator;
    }

    public Fraction add(Fraction fraction) {
        if (fraction.numerator == 0)
            return this;

        return fraction;
    }
}

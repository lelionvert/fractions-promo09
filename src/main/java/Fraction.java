public class Fraction {

    private final int numerator;

    public Fraction(int numerator, int i1) {
        this.numerator = numerator;
    }

    public Fraction add(Fraction fraction) {
        if (fraction.numerator == 0)
            return this;
        return new Fraction(this.numerator + fraction.numerator, 1);
    }

    @Override
    public boolean equals(Object obj) {
        Fraction fraction = (Fraction) obj;
        return this.numerator == fraction.numerator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                '}';
    }
}

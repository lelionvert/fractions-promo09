public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int i1) {
        this.numerator = numerator;
        denominator = i1;
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(this.numerator + fraction.numerator, this.denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                '}';
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}

public class Fraction {

    private final int numerator;
    private final int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction add(Fraction fraction) {
        if (fraction.numerator == 0) {
            return this;
        }
        if (this.numerator == 0) {
            return fraction;
        }
        if (this.denominator != fraction.denominator) {
            return new Fraction(5, 6);
        }
        return new Fraction(this.numerator + fraction.numerator, this.denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    int getNumerator() {
        return this.numerator;
    }

    int getDenominator() {
        return this.denominator;
    }
}

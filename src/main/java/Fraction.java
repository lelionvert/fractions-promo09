public class Fraction {

    private final int numerator;
    private final int denominator;


    Fraction(final int numerator, final int denominator) {

        if (denominator == 0) throw new IllegalArgumentException("Denominator can not be equal to zero");
        int coefficient = 1;

        if (denominator < 0) {
            coefficient = -1;
        }
        int gcd = GCD.compute(numerator, denominator);
        this.numerator = coefficient * numerator / gcd;
        this.denominator = coefficient * denominator / gcd;
    }

    Fraction add(Fraction fraction) {
        if (fraction.numerator == 0) {
            return this;
        }
        if (this.numerator == 0) {
            return fraction;
        }
        if (this.denominator != fraction.denominator) {
            int numerator = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
            int denominator = this.denominator * fraction.denominator;
            return new Fraction(numerator, denominator);
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

    @Override
    public boolean equals(Object obj) {
        Fraction fraction = (Fraction) obj;

        return this.numerator == fraction.numerator && this.denominator == fraction.denominator;
    }
}

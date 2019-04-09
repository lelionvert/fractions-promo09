public class Fraction {

    private final int numerator;

    public Fraction(int numerator, int i1) {
        this.numerator = numerator;
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(this.numerator + fraction.numerator, 1);
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
}

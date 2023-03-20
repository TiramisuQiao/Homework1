package Project1;
public interface FractionInterface{

    public Fraction add(Fraction frac1);

    /** Subtracts two fractions.
     * @param frac1 A Fraction to be subtracted from this fraction.
     * @return A Fraction that is the result of adding two fraction.
     */
    public Fraction subtract(Fraction frac1);

    /** Multiply two fractions.
     * @param frac1 A Fraction to be multiplied to this fraction.
     * @return A Fraction containing the multiplication of two fractions.
     */
    public Fraction multiply(Fraction frac1);

    /** Divides two fractions.
     * @param frac1 A Fraction by which this fraction is to be divided.
     * @return A Fraction containing the division of two fractions.
     */
    public Fraction divide(Fraction frac1);

    /** Returns reciprocal of the fraction.
     * @return A Fraction that is the reciprocal of this fraction.
     */
    public FractionInterface reciprocal();

    /** Returns an integer shows the result in comparing two fraction
     * Condition:1: this.frac > frac1,
     *           0: this.frac = frac1,
     *          -1: this.frac < frac1
     * @param frac1 A Fraction to be compared
     * @return an ingeter depending on the condition
     */
    public int compare(Fraction frac1);

    /**
     *
     * @return A string contains the result
     */
    public String toFracString();
} // end FractionInterface
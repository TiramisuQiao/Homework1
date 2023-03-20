package Project2;

public interface MixFractionInterface {
    /** Add two fractions.
     * @param MixFrac1 Fraction to be added to this fraction.
     * @return A Fraction containing the add of two fractions.
     */
    public MixFraction AddMixFraction(MixFraction MixFrac1);
    /** Subtract two fractions.
     * @param MixFrac1 Fraction to be subtracted to this fraction.
     * @return A Fraction containing the subtraction of two fractions.
     */
    public MixFraction MinusMixFraction(MixFraction MixFrac1);
    /** Multi two fractions.
     * @param MixFrac1 Fraction to be Multi to this fraction.
     * @return A Fraction containing the Multiplication of two fractions.
     */
    public MixFraction MultiMixFraction(MixFraction MixFrac1);
    /** Divide two fractions.
     * @param MixFrac1 Fraction to be divided to this fraction.
     * @return A Fraction containing the division of two fractions.
     */
    public MixFraction DivideMixFraction(MixFraction MixFrac1);

    /**
     *
     * @return A String contains the result
     */
    public String ShowMixResult();
}

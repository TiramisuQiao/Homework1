package Project1;

public class Fraction implements FractionInterface
{
    private int Num;
    private int Denom;
    private int gcd(int num1, int num2)
    {
        int result;

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 % num2 == 0)
            result = num2;
        else
            result = gcd(num2, num1 % num2);

        return result;
    }
    private void simplified()
    {
        int GCD = gcd(Num, Denom);
        Num/=GCD;
        Denom/=GCD;
    }

    /** Constructor: set the default number of the fraction  */
    public Fraction()
    {
        Num = 1;
        Denom = 1;
    }
    /**
     * Constructor:
     * @param Num the numerator of the fraction
     * @param Denom the denominator of the fraction
     * @return the Fraction that should be initialized
     * @throws NullPointerException if Num == 0
     */
    public Fraction(int Num, int Denom) {
        if (Num == 0) {
            System.out.println("Wrong input");
        } else {
            this.Num = Num;
            this.Denom = Denom;
        }
    }

    /** Adds two fractions.
     * @param frac1 A Fraction to be added to this fraction.
     * @return A Fraction containing the summation of two fractions.
     */
    public Fraction add(Fraction frac1)
    {
        int resDenom = Denom * frac1.Denom;
        int resNum = Num * frac1.Denom + frac1.Num*Denom;
        Fraction res = new Fraction(resNum,resDenom);
        return res;
    }

    /** Subtracts two fractions.
     * @param frac1 A Fraction to be subtracted from this fraction.
     * @return A Fraction containing the subtraction of two fractions.
     */
    public Fraction subtract(Fraction frac1)
    {
        int resDenom = Denom * frac1.Denom;
        int resNum = Num * frac1.Denom  - frac1.Num*Denom;
        Fraction res = new Fraction(resNum,resDenom);
        return res;
    }

    /** Multiply two fractions.
     * @param frac1 A Fraction to be multiplied to this fraction.
     * @return A Fraction containing the multiplication of two fractions.
     */
    public Fraction multiply(Fraction frac1)
    {
        int resDenom = Denom * frac1.Denom;
        int resNum = Num * frac1.Num;
        Fraction res = new Fraction(resNum,resDenom);
        return res;
    } // end multiply

    /** Divides two fractions.
     * @param frac1 A Fraction by which this fraction is to be divided.
     * @return A Fraction containing the division of two fractions.
     */
    public Fraction divide(Fraction frac1)
    {
        int resDenom = Denom * frac1.Num;
        int resNum = Num * frac1.Denom;
        Fraction res = new Fraction(resNum,resDenom);
        return res;
    }

    /** Returns reciprocal of this fraction.
     * @return A Fraction containing a reciprocal of this fraction.
     */
    public Fraction reciprocal()
    {
        if(Denom == 0){
            System.out.println("No reciprocal");
        }else{
            Fraction res = new Fraction(Denom,Num);
            return res;
        }
        return null;
    }

    /** Returns an integer.
     * 1: this > frac1,
     * 0: this = frac1,
     * -1: this < frac1
     * @param frac1 A Fraction to be compared
     * @return an ingeter depending on the condition
     */
    public int compare(Fraction frac1)
    {
        if(Num * frac1.Denom  - frac1.Num *Denom > 0){
            return 1;
        }else if(Num * frac1.Denom  - frac1.Num*Denom == 0){
            return 0;
        }else{
            return -1;
        }
    } // end compare
    /** Returns a string that contains this fraction in lowest terms.
     * @return A string containing this fraction.
     */
    public String toFracString()
    {
        String result;
        if (Denom == 1)
            result = Integer.toString(Num);
        else
            result = Num + "/" + Denom;
        return result;
    } // end toString

    /** Reduces this fraction to its lowest terms.
     *  Update numerator and denominator accordingly.
     */


}

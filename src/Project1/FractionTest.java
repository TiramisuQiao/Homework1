package Project1;

public class FractionTest {
    public static void main(String[] args){
        Fraction A = new Fraction(1,2);
        Fraction B = new Fraction(1,4);
        //General test the ToFracString method
        //test add
        System.out.println("1/2 + 1/4 = "+(A.add(B)).toFracString());
        //test subtract
        System.out.println("1/2 - 1/4 = "+(A.subtract(B)).toFracString());
        System.out.println("1/4 - 1/2 = "+(B.subtract(A)).toFracString());
        //test multiply
        System.out.println("1/2 * 1/4 = "+(A.multiply(B)).toFracString());
        //test divide
        System.out.println("1/2 / 1/4 = "+(A.divide(B)).toFracString());
        //test reciprocal
        System.out.println("1 / 1/2 ="+((A.reciprocal()).toFracString()));
        //test compare
        if(A.compare(B) < 0){
            System.out.println("1/2 < 1/4");
        }else if(A.compare(B) == 0){
            System.out.println("1/2 == 1/4");
        }else{
            System.out.println("1/2 > 1/4");
        }

    }
}

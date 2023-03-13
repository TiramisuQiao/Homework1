package Project1;

public class FracMain {
    public static void main(String []args){
        Fraction FracA= new Fraction();
        Fraction FracB= new Fraction();
        Fraction FracC= new Fraction();
        Fraction FracD= new Fraction();
        Fraction FracE= new Fraction();
        Fraction FracF= new Fraction();
        Fraction FracG= new Fraction();
        Fraction FracH= new Fraction();
        Fraction FracI= new Fraction();
        System.out.println("-50/100 simplified:");
        FracA.SetFrac("-50/100");
        System.out.println("18/36 simplified:");
        FracB.SetFrac("18/36");
        System.out.println("2/2 simplified:");
        FracC.SetFrac("2/2");
        System.out.println("4/1 simplified:");
        FracD.SetFrac("4/1");
        System.out.println("5/10 simplified:");
        FracI.SetFrac("5/10");
        System.out.println("-50/100 + 18/36 =");
        FracE.addTwoFrac(FracA,FracB);
        System.out.println("-50/100 - 18/36 =");
        FracF.minusTwoFrac(FracA,FracB);
        System.out.println("-50/100 * 18/36 =");
        FracG.multiTwoFrac(FracA,FracB);
        System.out.println("-50/100 / 18/36 =");
        FracH.divTwoFrac(FracA,FracB);
        System.out.println("-50/100 inverse:"+FracA.Inverse1());
        int val1=FracA.Compare(FracB);
        if(val1 > 0){
            System.out.println("-50/100 > 18/36");
        }else if(val1 == 0){
            System.out.println("-50/100 = 18/36");
        }else{
            System.out.println("-50/100 < 18/36");
        }
        int val2=FracB.Compare(FracI);
        if(val2 > 0){
            System.out.println("18/36 > 5/10");
        }else if(val2 == 0){
            System.out.println("18/36 = 5/10");
        }else{
            System.out.println("18/36 < 5/10");
        }
    }
}

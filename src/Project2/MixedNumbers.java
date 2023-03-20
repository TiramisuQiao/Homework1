package Project2;

public class MixedNumbers {
//    public void ShowMixResult(MixFraction A){
//        if(A.sgn == -1){
//            System.out.println("-"+A.Int);
//        }
//    }
    public static void main(String [] args) {
        MixFraction FracA = new MixFraction();
        MixFraction FracB = new MixFraction();
        MixFraction FracC = new MixFraction();
        MixFraction FracD = new MixFraction();
        //MixFraction FracE = new MixFraction();
        ////FracA.MixFraction(1,1,2);
        ////FracB.MixFraction(2,1,4);
        ////FracC.ShowMixResult(FracA.AddMixFraction(FracB));

        FracA.MixFraction(1,1,2);
        FracB.MixFraction(-2,1,4);
        FracD.ShowMixResult(FracB.MinusMixFraction(FracA));

        //FracB.MixFraction(2,1,4);
        //FracD.MixFraction
    }
}

package Project2;

public class MixedNumbers {
    public static void main(String [] args) {
        MixFraction FracA = new MixFraction(1,1,2);
        MixFraction FracB = new MixFraction(-2,1,4);
        System.out.println("1 1/2 + -2 1/4 = "+(FracA.AddMixFraction(FracB)).ShowMixResult());
        System.out.println("1 1/2 - -2 1/4 = "+(FracA.MinusMixFraction(FracB)).ShowMixResult());
        System.out.println("-2 1/4 - 1 1/2 = "+(FracB.MinusMixFraction(FracA)).ShowMixResult());
        System.out.println("1 1/2 * -2 1/4 = "+(FracA.MultiMixFraction(FracB).ShowMixResult()));
        System.out.println("1 1/2 / -2 1/4 = "+(FracA.DivideMixFraction(FracB)).ShowMixResult());
    }
}

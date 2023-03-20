package Project2;

public class MixFraction {
    private int IntSection;
    private int UpNum;
    private int DownNum;
    private int TrueUpNum;
    private int sgn = 1;
    private int CheckSign(int a,int b,int c){
        if(a * b * c < 0 ||(a == 0 && b*c < 0) ){
            return -1;
        }else if(a != 0 && b*c == 0){
            return 0;
        }else if(a * b * c > 0){
            return 1;
        }
        return 1;
    }


    public void MixFraction(int IntSection, int UpNum, int DownNum){
        this.DownNum = java.lang.Math.abs(DownNum);
        this.IntSection = java.lang.Math.abs(IntSection);
        this.UpNum = java.lang.Math.abs(UpNum);
        this.sgn = CheckSign(IntSection,UpNum,DownNum);
        this.TrueUpNum = sgn * (java.lang.Math.abs(UpNum) + java.lang.Math.abs(IntSection * DownNum));

    }
    private int gcd(int a,int b) {
        int r;
        while(b>0) {
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    private MixFraction SimplifyMixedFraction(int a,int b){
        a=java.lang.Math.abs(a);
        b=java.lang.Math.abs(b);
        int CommonDivision = gcd(b,a);
        a = a / CommonDivision;
        b = b / CommonDivision;
        int Division =a/b;
        a = a - Division * b;
        MixFraction A = new MixFraction();
        A.MixFraction(Division,a,b);
        return A;
    }
    public MixFraction AddMixFraction(MixFraction A){
        TrueUpNum = TrueUpNum * A.DownNum + DownNum * A.TrueUpNum;
        DownNum = DownNum * A.DownNum;
        return SimplifyMixedFraction(TrueUpNum,DownNum);
    }
    public MixFraction MinusMixFraction(MixFraction A){
        TrueUpNum = TrueUpNum * A.DownNum - DownNum * A.TrueUpNum;
        DownNum = DownNum * A.DownNum;
        return SimplifyMixedFraction(TrueUpNum,DownNum);
    }
    public MixFraction MultiMixFraction(MixFraction A){
        TrueUpNum = TrueUpNum * A.TrueUpNum;
        DownNum = DownNum * A.DownNum;
        return SimplifyMixedFraction(TrueUpNum,DownNum);
    }
    public MixFraction DivideMixFraction(MixFraction A){
        TrueUpNum = TrueUpNum * A.DownNum;
        DownNum = DownNum * A.TrueUpNum ;
        return SimplifyMixedFraction(TrueUpNum,DownNum);
    }
    public void ShowMixResult(MixFraction A){
        String IntSectionS=String.valueOf(sgn * java.lang.Math.abs(A.IntSection));
        String UpNumS = String.valueOf(A.UpNum);
        String DownNumS = String.valueOf(A.DownNum);
        System.out.println(IntSectionS + " "+ UpNumS+"/"+DownNumS);
    }

}

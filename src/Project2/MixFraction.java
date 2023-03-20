package Project2;
import java.lang.Math.*;

public class MixFraction implements MixFractionInterface{
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

    public MixFraction(){
        this.DownNum = 1;
        this.IntSection = 1;
        this.UpNum = 1;
        this.sgn = 1;
        this.TrueUpNum = 2;
    }
    public MixFraction(int IntSection, int UpNum, int DownNum) {
        if (DownNum == 0) {
            System.out.println("Wrong input");
        } else {
            this.sgn = CheckSign(IntSection, UpNum, DownNum);
            this.DownNum = Math.abs(DownNum);
            this.IntSection = Math.abs(IntSection);
            this.UpNum = Math.abs(UpNum);
            this.TrueUpNum = sgn * (Math.abs(UpNum) + Math.abs(IntSection * DownNum));
        }
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
    private MixFraction(int TrueUpNum,int DownNum){
        this.TrueUpNum = TrueUpNum;
        this.DownNum = DownNum;
        int sign = 0;
        if(TrueUpNum * DownNum < 0){
            sign = -1;
        }else if(TrueUpNum * DownNum > 0){
            sign = 1;
        }
        TrueUpNum =java.lang.Math.abs(TrueUpNum);
        DownNum =java.lang.Math.abs(DownNum);
        int CommonDivision = gcd(DownNum,TrueUpNum);
        TrueUpNum = TrueUpNum / CommonDivision;
        DownNum = DownNum / CommonDivision;
        int Division = TrueUpNum/DownNum;
        TrueUpNum = TrueUpNum - Division * DownNum;
        //System.out.println(sign*Division+" "+a+" "+b);
        this.sgn = sign;
        this.IntSection = Division;
        this.UpNum = sign*TrueUpNum;
        this.DownNum = DownNum;
    }
    public MixFraction AddMixFraction(MixFraction A){
        int resUp = TrueUpNum * A.DownNum + DownNum * A.TrueUpNum;
        int resDown = DownNum * A.DownNum;
        MixFraction res = new MixFraction(resUp,resDown);
        return res;
    }
    public MixFraction MinusMixFraction(MixFraction A){
        int resUp = TrueUpNum * A.DownNum - DownNum * A.TrueUpNum;
        int resDown = DownNum * A.DownNum;
        //System.out.println(resUp + " "+ resDown);
        MixFraction res = new MixFraction(resUp,resDown);
        return res;
    }
    public MixFraction MultiMixFraction(MixFraction A){
        int resUp = TrueUpNum * A.TrueUpNum;
        int resDown = DownNum * A.DownNum;
        //System.out.println(resUp + " "+ resDown);
        MixFraction res = new MixFraction(resUp,resDown);
        return res;
    }
    public MixFraction DivideMixFraction(MixFraction A){
        int resUp = TrueUpNum * A.DownNum;
        int resDown = DownNum * A.TrueUpNum ;
        //System.out.println(resUp + " "+ resDown);
        MixFraction res = new MixFraction(resUp,resDown);
        return res;
    }
    public String ShowMixResult() {
        String res = new String();
        if (UpNum == 0) {
            res = IntSection + " ";
        } else {
            if(sgn < 0) {
                res += '-';
            }
            String IntSectionS = String.valueOf(Math.abs(IntSection));
            String UpNumS = String.valueOf(java.lang.Math.abs(UpNum));
            String DownNumS = String.valueOf(java.lang.Math.abs(DownNum));
            res = res +IntSectionS + " " + UpNumS + "/" + DownNumS;
        }
        return res;
    }

}

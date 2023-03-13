package Project1;
public class Fraction {
    private int upnum = 0;
    private int downnum = 0;
    private int sgn = 1;
    private int checkVaild(int upnum,int downnum) {
        if (upnum > downnum || downnum ==0) {
            return -1;
        }else if(upnum == 0){
            return 2;
        }else if (upnum == downnum) {
            return 0;
        }
        return 1;
    }

    public int gcd(int a,int b) {
        int r;
        while(b>0) {
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public void SetFrac(String Equation) {
        int len = Equation.length();
        int i = 0;
        int flag = 0;
        while (i < len) {
            if (Equation.charAt(i) == '-' && flag == 0) {
                sgn = -1;
                i++;
                flag = 1;
            } else if(Equation.charAt(i) != '-' && flag == 0){
                sgn = 1;
                flag = 1;
            }
            if (Equation.charAt(i) != '/' && flag == 1) {
                upnum = upnum * 10 + Equation.charAt(i) - '0';
                i++;
            }
            if (Equation.charAt(i) == '/') {
                i++;
                flag = 2;
            }
            if (flag == 2) {
                downnum = downnum * 10 + Equation.charAt(i) - '0';
                i++;
            }

        }
        int vaildNum = checkVaild(upnum,downnum);
        if(vaildNum == -1){
            System.out.println("Wrong Input");
        }
        if(vaildNum == 0 ){
            System.out.println(sgn);
        }
        if(vaildNum == 2){
            System.out.println("0");
        }
        if(vaildNum == 1){
            int division=gcd(downnum,upnum);
            upnum = upnum / division;
            downnum = downnum / division;
            System.out.println(sgn*upnum+"/"+downnum);
        }
        upnum = upnum * sgn;
    }
    public void addTwoFrac(Fraction A,Fraction B){
        String upResult =  String.valueOf(A.upnum * B.downnum + B.upnum * A.downnum);
        String downResult =String.valueOf(A.downnum * B.downnum);
        String input=upResult+"/"+downResult;
        SetFrac(input);

    }
    public void minusTwoFrac(Fraction A,Fraction B){
        String upResult =  String.valueOf(A.upnum * B.downnum - B.upnum * A.downnum);
        String downResult =String.valueOf(A.downnum * B.downnum);
        String input=upResult+"/"+downResult;
        SetFrac(input);

    }
    public void multiTwoFrac(Fraction A,Fraction B){
        String upResult =  String.valueOf(A.upnum * B.upnum);
        String downResult =String.valueOf(A.downnum * B.downnum);
        String input=upResult+"/"+downResult;
        SetFrac(input);

    }
    public void divTwoFrac(Fraction A,Fraction B){
        String upResult =  String.valueOf(A.upnum / B.upnum);
        String downResult =String.valueOf(A.downnum / B.downnum);
        String input=upResult+"/"+downResult;
        SetFrac(input);

    }
    public float Inverse1(){
        return (float) downnum/upnum;
    }
    public int Compare(Fraction K){
        if(upnum * K.downnum - K.upnum * downnum - downnum*K.downnum > 0){
            return 1;
        }else if(upnum * K.downnum == downnum*K.upnum ){
            return 0;
        }else{
            return -1;
        }
    }
}


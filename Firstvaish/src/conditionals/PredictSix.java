package conditionals;

public class PredictSix {
    public static void main(String[] args){
        int a = 5,b;
         b = a = 15;
        boolean   c = a < 15;
        System.out.println("a="+a+" b="+b+" c="+c);
    }
}
//give error if
//int a = 5,b,c;
//c = a < 15;
     //   System.out.println("a="+a+" b="+b+" c="+c);
public class UnaryOperators {
    public static void main(String [] args){

        int p = 5 , q = 5;

        //unany plus + (number is positive)
        //unary minus - (number is negative)
        //increment operator ++ (post increment  (p++)(1-assign/compute   2-increment)
        // and pre increment (--p)(1-increment 2-assign/compute))
        //decrement operator --
        //logical complement operator !


        System.out.println(p++); // 5
        System.out.println(p); // 6

        System.out.println(++q); //6
        System.out.println(q); //6

        int x = p++;
        int y = ++q;

        System.out.println(x); //6
        System.out.println(y); //7

        System.out.println(p); //7
        System.out.println(q); //7


    }
}

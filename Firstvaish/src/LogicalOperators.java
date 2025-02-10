public class LogicalOperators {
    public static void main(String[] args){
        int p = 15 , q = 10 , r = 5;

        // && logical AND
        // ||logical OR
        // ! logical NOT

        //&& operator
        System.out.println((p > q) && (p > r)); // true
        System.out.println((p > q) && (p < q)); // false

        //  || operator
        System.out.println((r < q) || (p < q)); // true
        System.out.println((p > q ) || (q > r)); // false
        System.out.println((p < q) || (q < r)); // false

       //! opertor
        System.out.println(p == q); // true
        System.out.println(p > q);  //false

    }
}

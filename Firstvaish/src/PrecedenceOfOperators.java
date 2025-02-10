public class PrecedenceOfOperators {
    public static void main(String[] args) {

        //Postfix (++,--) LR> Unary (++,--,+-,! ~) RL> Multiplicative (*,/,%) LR> Additive (+ -)  LR> Shift (<< , >> , >>>) LR> Relational ( < , <= , > , >= )  LR > Equality (== , != )  LR > Bitwise AND(&)  LR > Bitwise XOR (^) LR >
        //Bitwise OR(|)  LR > logical AND (&&)  LR > Conditional (?:)  RL > Assignment (= , += , -= , *= ,/= , %=, >>= , <<= , &= ,^= , |=)  RL )


        //(ASSOCIATIVITY  OF unary , conditional, assignment OPERATORS  (RIGHT TO LEFT))
         int p = 4 , q = 3  , r = 2  , s ;
         s = p - ++r - ++r; // 4-3-4  1-4 -3
         System.out.println(s);

        System.out.println( 4 + 2 + "pqr");
        System.out.println( "pqr" + 4 +2);

//        Boolean p = false;
//        Boolean q = false;
//        Boolean r = true;
//
//        System.out.println(p==q==r); //LR  true=r( ans true)
    }

}

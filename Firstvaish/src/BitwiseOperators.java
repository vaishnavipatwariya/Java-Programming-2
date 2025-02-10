public class BitwiseOperators {
    public static void main(String[] args) {
        int p = 9 , q = 10;
     // a << b = (a * 2^b) ,a >> b = ( a / 2^b )
        System.out.println(p | q); //11 BITWISE OR
        System.out.println(p & q); //8  BITWISE AND
        System.out.println(p ^ q); //3  BITWISE EXCLUSIVE OR / XOR

        System.out.println(p << 1); //18
        System.out.println(p << 2); //36 // LEFT SHIFT

        System.out.println(q >> 1); //5
        System.out.println(q >> 2); //2  // RIGHT SHIFT
    }
}

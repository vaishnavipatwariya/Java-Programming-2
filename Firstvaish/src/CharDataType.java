import java.util.Scanner;

public class CharDataType {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        char ch = 'a';
        System.out.println(ch);
        int x = (int)ch; // typecast
        //int x = ch;
        System.out.println(x);
        //a b c d e f g h i j k l m n o p  q r s t u v w x y z
        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        // ~ ! # @ $ % ^ & * ( ) [ ] { } : ; ' " < , > . ? / | \ + = - _
        // 0 1 2 3 4 5 6 7 8 9

        // a ki  ascii  value  97
        //z ...........        122
        // A ............      65
        //Z ..........         90
    }

}

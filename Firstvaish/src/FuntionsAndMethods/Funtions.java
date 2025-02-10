package FuntionsAndMethods;

import java.util.Scanner;

public class Funtions {

        public static void printMyName(String name){
            System.out.println(name);
            return;
        }
        public static void main(String []args){
            Scanner Sc = new Scanner(System.in);
            String name = Sc.next();
            printMyName(name);

        }
}

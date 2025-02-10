package conditionals;

import java.util.Scanner;

public class YoungerBoy {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter age of Ram : ");
    int age1 = sc.nextInt();

    System.out.println("Enter age of Shyam : ");
    int age2 = sc.nextInt();

    System.out.println("Enter age of Ajay : ");
    int age3 = sc.nextInt();

    if (age1<age2 && age1<age3){
        System.out.println("Ram is younger ");

}
    else if (age2<age1 && age2<age3){
        System.out.println("Shyam is younger ");

    }

    else {
        System.out.println("Ajay is younger");
    }



}

}

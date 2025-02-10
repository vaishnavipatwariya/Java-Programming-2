import java.util.Scanner;

public class Si {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal : ");
        float p = sc.nextFloat();

        System.out.println("Enter rate of simple interest : ");
        float r = sc.nextFloat();

        System.out.println("Enter time of simple interest : ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("principal :" +p);
        System.out.println("rate : " +r);
        System.out.println("time : " +t);

        System.out.println("Simple interest : " +si);


    }

}

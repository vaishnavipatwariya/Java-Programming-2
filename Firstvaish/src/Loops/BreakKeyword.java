package Loops;

public class BreakKeyword {
    public static void main(String[] args){
        for(int num = 1; num <= 10; num++){
            if(num == 5){
                break;
            }
            System.out.println(num);
        }
    }
}

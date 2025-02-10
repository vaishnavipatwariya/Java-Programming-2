package AccessModifires;

public class App {
    //protected , private and  default check karna ho toh public String str_1 ki place par public ki place pr protected aur default kar do
    public String str_1 = " I am a public member";

    void printFromClass(){
        System.out.println("Within class : " +str_1);
    }

    public static void main(String[] args){
        App obj = new App();
        obj.printFromClass();
        System.out.println("within class : " +obj.str_1);
        App2 obj2 = new App2();
        obj2.printFromOutsideClass();
    }
}

class App2{
    void printFromOutsideClass(){
        App obj = new App();
        System.out.println("Within package , outside the class :" +obj.str_1);
    }
}

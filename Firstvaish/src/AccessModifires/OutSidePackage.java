package AccessModifires;

public class OutSidePackage {
    public static void main(String[] args){
        App obj = new App();
        System.out.println("Outside package , non child " +obj.str_1);
        App3 obj3 = new App3();
        obj3.printFromChildClass();
    }

}
//child class  //parent class
class App3 extends App{
    void printFromChildClass(){
        App3 obj3 = new App3();
        System.out.println(" Child class "+obj3.str_1);
    }

}

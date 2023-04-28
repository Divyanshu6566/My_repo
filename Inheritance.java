import javax.print.DocFlavor.STRING;

class Human{
    void name(){
        System.out.println("Divyanshu");
    }
}
class Human2 extends Human{
    void language(){
        System.out.println("I speak English");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Human hm = new Human();
        hm.name();
    }
}
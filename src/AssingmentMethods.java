
public class AssingmentMethods {
    static int staticVar = 10;
    int  instanceVar = 100;
    void instanceMethod(){
        AssingmentMethods assingmentMethods = new AssingmentMethods();
        System.out.println("Printing instance variable inside instance method is " + instanceVar);
        System.out.println(" static instance variable inside instance nonstatic method is " + staticVar);
    }

    static void staticMethod(){
        AssingmentMethods assingmentMethods = new AssingmentMethods();
        System.out.println("you can access static variable directly " + staticVar); //calling static variable from static method
        System.out.println("you can access static variable via object " + assingmentMethods.staticVar);
        System.out.println("Static Method Static variable via class name " + AssingmentMethods.staticVar);

    }

    public static void main (String[] args)
    {
        String localVariable = "localVar";
        System.out.println(" Printing local variable " + localVariable);;
        AssingmentMethods assingmentMethods = new AssingmentMethods();
        assingmentMethods.instanceMethod();

        staticMethod(); //calling static method from static method directly
        AssingmentMethods.staticMethod(); //calling static method from static method by Class name
        assingmentMethods.staticMethod();




    }
}

public class AssignmentConstructors {
    int instanceVar = 10;
    static int staticVar = 100;
    AssignmentConstructors(){
        int localVar = 1000;
        System.out.println("local variable inside constructor " + localVar);
        System.out.println("instance variable inside constructor " + instanceVar);
        System.out.println("static variable inside constructor " + staticVar);
        instanceMethod();
        staticMethod();
    };

    void instanceMethod(){
        int localVar1 = 20;
        System.out.println("local variable inside instance method " + localVar1);
        System.out.println("instance variable inside instance method " + instanceVar);
        System.out.println("static also know as class variable inside instance method " + staticVar);
    }
    static void staticMethod(){
        int localVar2 = 30;
        AssignmentConstructors assignmentConstructors = new AssignmentConstructors();
        System.out.println("local variable inside static method " + localVar2);
        System.out.println("instance variable inside static method " + assignmentConstructors.instanceVar);
    }
    public static void main (String[] args){
        AssignmentConstructors assignmentConstructors =  new AssignmentConstructors();
        assignmentConstructors.instanceMethod();
        staticMethod();

    }
}

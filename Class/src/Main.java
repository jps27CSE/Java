public class Main {


    int x =5;
    int y = 4;

    static void MethodTest(){  // Static method 
        System.out.print("Hello,,,calling from method\n");
    }

    public void PublicMethod(){
        System.out.println("Calling Public method\n");
    }

    public void AccessMethodWithObject(int maxspeed)
    {
        System.out.print("Car speed is " + maxspeed +"\n");
    }

    public static void main(String[] args)  {
        Main myObj = new Main();
        System.out.println(myObj.x + myObj.y);


        Second secondClass = new Second();

        System.out.println(secondClass.result);
       

        MethodTest(); // can call static method without creating object

        Main PublicMethodOBJ = new Main();
        PublicMethodOBJ.PublicMethod();

        Main AccessMethod = new Main();

        AccessMethod.AccessMethodWithObject(200);

        Constructor objectConstructor = new Constructor(2022,"Ford");

        System.out.println(objectConstructor.value +"\n");

        System.out.println(objectConstructor.carModel + objectConstructor.carYear);
        
        Static statObj = new Static();
        statObj.PublicMethod();

        Student studentObject = new Student();
        System.out.println(studentObject.SName);
        System.out.println(studentObject.age);        
        System.out.println(studentObject.graduationYear);             

    }
}

public class Static {
    static void myStaticMethod(){
        System.out.print("Calling from static"); // it will call without creating object
    }

    public void PublicMethod(){
      System.out.println("Calling Public Method"); // to print this you need to create object first
    }
}

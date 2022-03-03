public class OuterClass {
    int x = 10; 

    class InnerClass{
        int y = 5;
    }

    public static void main(String[] args)
    {
        OuterClass myouterclass = new OuterClass();
        OuterClass.InnerClass myinnerclass = myouterclass.new InnerClass();

        System.out.println(myouterclass.x + myinnerclass.y);
    }
}

abstract class AbstractClass {
    public String SName = "Jack";
    public int age = 19;
    public abstract void study();

};

class Student extends AbstractClass{
   
    int graduationYear = 2023;

    public void study()
    {
        System.out.println("Study Message");
    }

}


public class Encapsulation {
    private String name;

    public String getName() {
        return name;                 //getter
    }

    public void setName(String Newname){
        this.name = Newname;              //setter
    }

    public static void main(String[] args)
    {
        Encapsulation obj1 = new Encapsulation();

        obj1.setName("jack");

        System.out.println(obj1.getName());


    }
}

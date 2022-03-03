public class Inheritance {
    // private String CarName = "Ford";
    public int Age = 4;
}

class Car extends Inheritance {
    public int YearBuy = 2022; 
    
    public void PrintFunction()
    {
        // System.out.println(CarName);
        System.out.println(Age);
        System.out.println(YearBuy);
    }
}

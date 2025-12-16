class WrongAge extends Exception {
    public WrongAge(String msg) {
        super(msg);
    }
}
class Father {
    int age;
    Father(int age) throws WrongAge {
        if (age < 0)
            throw new WrongAge("Father's age cannot be negative!");
        this.age = age;
    }
}
class Son extends Father {
    int sonAge;
    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);
        if (sonAge >= fatherAge)
            throw new WrongAge("Son's age must be less than Father's age!");
        if (sonAge < 0)
            throw new WrongAge("Son's age cannot be negative!");
        this.sonAge = sonAge;
    }
}

public class FatherSonHandling {
    public static void main(String[] args) {
        try {
            Father f = new Father(20);
            Son s = new Son(20, 40);
            System.out.println("Father and Son objects created successfully.");
        }
        catch (WrongAge e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}


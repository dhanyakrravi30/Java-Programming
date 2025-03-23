interface Animal{
    void eat();
}

interface Bird{
    void fly();
}

class Bat implements Animal,Bird{
    public void eat(){
        System.out.println("Bat eat insects");
    }
    
    public void fly(){
        System.out.println("Bat can fly");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Bat mybat = new Bat();
        mybat.eat();
        mybat.fly();
    }
    
}


/*
Bat eat insects
Bat can fly
 */
package SuperKeyword;

public class Parent {
    int num=0;
    void m(){
        System.out.println("Parent");
    }
    Parent(){
        System.out.println("Parent Constructor");
    }
    Parent(int n){
        this();//this is calling to non parameterized constructor
        System.out.println(n+" Parent Constructor");
    }
}

class Child extends Parent {
    int num=5;
    void m(){
        super.m();   //parent class ke reference ko refer karta hai  = super keyword
        System.out.println(super.num); // Parent class ke instace variable ki access kar raha hai
        System.out.println("Child");
    }
    Child(){
        super(7);
        System.out.println("Child Constructor");
//        super(7);
    }
}

class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.m();

    }
}

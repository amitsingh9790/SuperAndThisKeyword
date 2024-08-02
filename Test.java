package ThisKeyword;

import static java.lang.StringTemplate.STR;

public class Test {
    void m1()
    {
        System.out.println("I am in m1 method");
        m2();   //internally compiler is doing--> this.m2();
    }
    void m2(){ System.out.println("I am in m2 method"); }
    Test(){
        this(5); // Constructor call using this keyword
        System.out.println("Non Parameterized Constructor");
    }
    Test m3(){
        Test CC = new Test();
        return this; // returning object
    }
    Test(int number){
        this("Amit"); // Constructor call using this keyword
        System.out.println(STR."\{number} Parameterized Constructor");
    }
    Test(String name){
        System.out.println(STR."\{name}Parameterized Constructor");
    }

    public static void main(String[] args){
        Test obj = new Test();
        System.out.println(obj.m3());
    }
}
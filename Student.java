package ThisKeyword;

import static java.lang.StringTemplate.STR;

public class Student {
    private String name;
    private int age;

    public Student setName(String name) {
        this.name = name;
        return this;    //Returning the current object
    }

    public Student setAge(int age) {
        this.age = age;
        return this;    //Returning the current object
    }
    public void display() {
        System.out.println(STR."Name: \{name}, Age: \{age}");
    }
}

//class Main{
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setName("Amit Singh").setAge(45);  //Method Chaining = s1 ne setName ko call kiye as a return us class ka obj return hua , jiski madad se setAge ko call kiya gya hai
//        s1.display();
//    }
//}



package ThisKeyword;

public class ThisDemo {
    void m1()
    {
        System.out.println("I am in m1 method : "+this);
    }
    public static void main(String[] args){
        ThisDemo ob = new ThisDemo();
        System.out.println("I am in main method : "+ob);
        //System.out.println(this); //this cannot be referenced from a static context
        ob.m1();
    }
}

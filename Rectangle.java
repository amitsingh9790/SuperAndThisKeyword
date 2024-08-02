package ThisKeyword;

import static java.lang.StringTemplate.STR;

public class Rectangle {
    private int width, height;

    //First constructor
    Rectangle(){
        this(1,1); // Calls the second constructor
    }
    //Second constructor
    Rectangle(int width, int height){
        this.height=height;
        this.width=width;
    }
    void display(){
        System.out.println(STR."Width=\{width} Height=\{height}");
    }
}

//class Main {
//    public static void main(String[] args) {
//        Rectangle rec = new Rectangle();
//        rec.display();
//    }
//}
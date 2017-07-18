//: typeinfo/Shapes.java
package typeinfo; /* Added by Eclipse.py */

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    //抽象方法在被继承后，必需重写！
    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Triangle()
        );
        int i = 1;
        for (Shape shape : shapeList) {
            /*
                选出三角形，把他们涂成黄色！
             */
            if (Triangle.class.isInstance(shape)) {
                System.out.println("shapeList中有" + i + "个三角形！把他们涂成黄色！");
                i++;
            }
            shape.draw();
        }
    }

    private boolean isTriangle(Shape s) {
        Triangle triangle = new Triangle();
        return triangle.equals(s);
    }


}

/* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~

package week6;

import java.util.Scanner;
interface ShapesMethodInterface {
    double area();
    double perimeter();
    void display();

}

class Rectangle extends Shapes{

    double length,breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area () {
        double area = length * breadth;
        return area;
    }

    @Override
    public double perimeter () {
        double perimeter = 2*(length+breadth);
        return perimeter;

    }
}

class Square extends Rectangle{

    double side;
    public Square(double side){
        super(side,side);
    }

}
class Circle extends Shapes{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double area () {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double perimeter () {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}

class Triangle extends Shapes{

    public double baseSide, Side2, Side3, height;

    public Triangle(double baseSide, double Side2, double Side3, double height){
        this.baseSide = baseSide;
        this.Side2 = Side2;
        this.Side3 = Side3;
        this.height = height;
    }

    public double area () {

        double area = 0.5 * baseSide * height;
        return area;
    }

    @Override
    public double perimeter () {

        double perimeter = baseSide + Side2 + Side3;
        return perimeter;
    }

}

public abstract class Shapes implements ShapesMethodInterface{

    public void display(){
        System.out.println ("\n" + getClass ().getSimpleName ());
        System.out.println ("Area =" + area ());
        System.out.println ("Perimeter =" + perimeter ());
    }
    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );
        String choice;

        do {
            System.out.print ( "\nEnter the shape (Rectangle, Square, Circle, Triangle (exit to quit): " );

            choice = input.next( ).toLowerCase ( );

            switch (choice) {
                case "rectangle": {
                    System.out.print ( "Enter length and breadth of a rectangle: " );
                    double length = input.nextDouble ( );
                    double breadth = input.nextDouble ( );
                    Shapes rectangle = new Rectangle ( length, breadth );
                    rectangle.display ( );
                    break;
                }

                case "square": {
                    System.out.print ( "Enter side of a square: " );
                    double side = input.nextDouble ( );
                    Rectangle square = new Square ( side );
                    square.display ( );
                    break;
                }

                case "circle": {
                    System.out.print ( "Enter radius of a circle: " );
                    double radius = input.nextDouble ( );
                    Shapes circle = new Circle ( radius );
                    circle.display ( );
                    break;
                }

                case "triangle": {
                    System.out.print ( "Enter Sides (Base Side, Side 2, Side 3) of a triangle: " );
                    double baseSide = input.nextDouble ( );
                    double side1 = input.nextDouble ( );
                    double side2 = input.nextDouble ( );
                    System.out.print ( "Enter height of a triangle " );
                    double height = input.nextDouble ( );

                    Shapes triangle = new Triangle ( baseSide, side1, side2, height );
                    triangle.display ( );
                    break;
                }

               default:{
                    if(!choice.equalsIgnoreCase ("exit")){
                        System.out.println ("Wrong input...");
                    }
                }

            }

        } while(!choice.equalsIgnoreCase ("exit"));
    }

}



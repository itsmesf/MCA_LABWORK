package week4;

import java.util.Scanner;
public class circle {
    private double radius;
    private int x1, y1;

    public circle(double radius, int x1, int y1) {
        this.radius = radius;
        this.x1 = x1;
        this.y1 = y1;
    }

    void area_circle(double radius){
        double area = Math.PI * radius * radius;
        System.out.println("\nArea of circle with radius " + radius + " : " + Math.round(area * 100.0) / 100.0) ;
    }

    void perimeter_circle(double radius){
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle with radius " + radius + " : " + Math.round(perimeter * 100.0) / 100.0);
    }

    void isPointInside(int x2 , int y2){
            int d1 = x2 - x1;
            int d2 = y2 - y1;
            double d = Math.sqrt((d1 * d1) + (d2 * d2));

            if(d<radius){
                System.out.println("(" + x2 + ", " + y2 +") lies inside the circle");
            }
            else{
                System.out.println("(" + x2 + ", " + y2 +") lies outside the circle");
            }

    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter radius of circle: ");
            double r = input.nextDouble();

            if(r<0){
                System.out.println("Negative radius entered. Exiting the program.");
                break;
            }

            System.out.print("Enter x and y coordinates of center of circle: ");
            int x = input.nextInt();
            int y = input.nextInt();


            circle Circle = new circle(r,x,y);

            System.out.print("Enter the x and y coordinate of the point to check if it lies inside circle: ");
            int h = input.nextInt();
            int k = input.nextInt();

            Circle.area_circle(r);
            Circle.perimeter_circle(r);
            Circle.isPointInside(h,k);

            System.out.println();
        }

    }
}

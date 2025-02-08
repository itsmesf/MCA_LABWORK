import java.util.Scanner;
class Coordinates{
    int x,y;

    Coordinates(int x,int y){
        this.x = x;
        this.y = y;
    }

    static double distance(int x1, int y1, int x2, int y2){
        int d1 = x2 - x1;
        int d2 = y2 - y1;

        double d = Math.sqrt((d1 * d1) + (d2 * d2));

        return d;
    }
}
class Rectangle{

    Coordinates topLeft,topRight, BottomLeft, BottomRight;
    Rectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new Coordinates(x1,y1);
        this.BottomRight = new Coordinates(x2,y2);

        //Deriving new Coordinates from already existing diagonal coordinates
        this.topRight = new Coordinates(x2,y1);
        this.BottomLeft = new Coordinates(x1,y2);
    }

    void displayVertices(){

        System.out.println("Top Left: " + "(" + topLeft.x + ", " + topLeft.y + ")");
        System.out.println("Top Right: " + "(" + topRight.x + ", " + topRight.y + ")");
        System.out.println("Bottom Right: "+ "(" + BottomRight.x + ", " + BottomRight.y + ")");
        System.out.println("Bottom Left: "+ "(" + BottomLeft.x + ", " + BottomLeft.y + ")");
    }

    Rectangle intersection(Rectangle r2){
        if(BottomRight.x < r2.topLeft.x || topLeft.x > r2.BottomRight.x ||
                BottomRight.y < r2.topLeft.y || topLeft.y > r2.BottomRight.y){
            return null; // if there is no intersection
        }

        //Calculate intersecting rectangle coordinates

        int ix1 = Math.max(topLeft.x, r2.topLeft.x);
        int iy1 = Math.max(topLeft.y, r2.topLeft.y);
        int ix2 = Math.min(BottomRight.x, r2.BottomRight.x);
        int iy2 = Math.min(BottomRight.y, r2.BottomRight.y);

        return new Rectangle(ix1, iy1, ix2, iy2);
    }

}
public class w3_q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x1,y1,x2,y2;

        System.out.println("Enter diagonal coordinates of first rectangle: ");
        System.out.print("Enter coordinates (x1,y1): ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.print("Enter coordinates (x2,y2): ");
        x2 = input.nextInt();
        y2 = input.nextInt();

        Rectangle r1 = new Rectangle(x1,y1,x2,y2);

        System.out.println("Enter diagonal coordinates of second rectangle: ");
        System.out.print("Enter coordinates (x1,y1): ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.print("Enter coordinates (x2,y2): ");
        x2 = input.nextInt();
        y2 = input.nextInt();

        Rectangle r2 = new Rectangle(x1,y1,x2,y2);

        System.out.println("\nFirst Rectangle Coordinates");
        r1.displayVertices();

        System.out.println("\nSecond Rectangle Coordinates");
        r2.displayVertices();

        Rectangle r3 = r1.intersection(r2);
        if (r3 != null) {
            System.out.println("\nIntersecting Rectangle Coordinates");
            r3.displayVertices();
        } else {
            System.out.println("\nRectangle r1 and r2 are not intersecting");
        }

    }
}

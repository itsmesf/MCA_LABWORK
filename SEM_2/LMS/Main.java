package LMS;


class Car {

    private String Company;
    private String model;
    private int year;
    private String color;

    public Car(String Company, String model, int year, String color){
        this.Company = Company;
        this.model = model;
        this.year = year;
        this.color = color;
    }
     public String getCompany(){
        return Company;
     }

     public int getYear () {
         return year;
     }

     public String getModel(){
        return  model;
     }

     public String getColor(){
        return color;
     }

     public void setCompany(String Company){
        this.Company = Company;
     }

    public void setModel ( String model ) {
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

}

class superCar extends Car{

    private int topSpeed;

    superCar(String Company, String model, int year, String color, int topSpeed){
        super(Company,model,year,color);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed(){
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

    public void MakeAndModel(){
        System.out.println (getCompany ());
        System.out.println (getModel () );
        System.out.println (getYear () );
        System.out.println (getColor () );
    }

}

public class Main {
    public static void main ( String[] args ) {
        superCar s1 = new superCar ( "Porsche", "911 GT3", 2023, "Shark Blue", 440 );
        superCar s2 = new superCar ( "Chevrolet", "Corvette Z06", 2023, "Torch Red", 450 );
        superCar s3 = new superCar ( "Nissan", "GT-R Nismo", 2024, "Pearl White", 350 );


        /*
        if (s1.getTopSpeed ( ) > s2.getTopSpeed ( )) {
            if (s1.getTopSpeed ( ) > s3.getTopSpeed ( )) {
                s1.MakeAndModel ( );
            } else {
                s3.MakeAndModel ( );

            }
        } else {
            if (s2.getTopSpeed ( ) > s3.getTopSpeed ( )) {
                s2.MakeAndModel ( );
            } else {
                s3.MakeAndModel ( );
            }
        }

         */

        superCar[] s = {s1, s2, s3};

        int max = s1.getTopSpeed ();

        for(int i = 0 ; i<s.length;i++){
            if(max<s[i].getTopSpeed ()){
                max = s[i].getTopSpeed ();
            }
        }

        for(int i = 1; i<s.length;i++){
            if(max==s[i].getTopSpeed ()){
                s[i].MakeAndModel ();
            }
        }



    }
}

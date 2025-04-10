package week8;

import java.util.Scanner;

class Students{
    private String name;
    private String en_no;
    private String faculty_no;
    private Address PermanentAddress;
    private Address CorrespondingAddress;

    private static final Address DEFAULT_ADDRESS = new Address("N/A", "N/A", "N/A", "N/A", "N/A");

    public Students(String name, String en_no, String faculty_no){
        this.name = name;
        this.en_no = en_no;
        this.faculty_no = faculty_no;

    }

    void StudentBasicDetails(){
        System.out.println ("\n------------------Student Details--------------------" );
        System.out.println ("\nStudent Name: "  + name);
        System.out.println ("Enrollment Number: "+ en_no );
        System.out.println ("Faculty Number: "+faculty_no);
    }

    void DefaultNullPointerHandler(){
        //using try catch approach
        try{
            System.out.print ("Permanent address: " );
            System.out.print (PermanentAddress.student_address () + "\n");
        }catch (NullPointerException e){
            System.out.print ("Not Available\n" );
        }

        try{
            System.out.print ("Corresponding address: " );
            System.out.print ( CorrespondingAddress.student_address () + "\n");
        }catch (NullPointerException e){
            System.out.print ("Not Available\n" );
        }

    }

    void PreventiveNullCheck(){
        //using preventive measures by performing null check;
        if (PermanentAddress!=null){
            System.out.println ( "Permanent address: " + PermanentAddress.student_address ());
        }else{
            System.out.println ("Permanent address is not available" );
        }

        if (CorrespondingAddress!=null){
            System.out.println ( "Corresponding address: " + CorrespondingAddress.student_address ());
        }else{
            System.out.println ("Corresponding address is not available" );
        }

    }

    void DefaultAddressApproach(){
        //using Default Address approach
        if (PermanentAddress!=null){
            System.out.println ( "Permanent address: " + PermanentAddress.student_address ());
        }else{
            System.out.println ("Permanent address: " + Students.DEFAULT_ADDRESS.student_address ());
        }
        if (CorrespondingAddress!=null){
            System.out.println ( "Corresponding address: " + CorrespondingAddress.student_address ());
        }else{
            System.out.println ( "Corresponding address: " + Students.DEFAULT_ADDRESS.student_address ());
        }

    }

    public void setCorrespondingAddress ( Address correspondingAddress ) {
        CorrespondingAddress = correspondingAddress;
    }

    public void setPermanentAddress ( Address permanentAddress ) {
        PermanentAddress = permanentAddress;
    }

    void displayAddress() {
        if (PermanentAddress != null && CorrespondingAddress != null) {
            this.DefaultNullPointerHandler ();
        } else {
            System.out.println ( "\nUsing try catch to handle null Pointer exception error in Address" );
            this.DefaultNullPointerHandler ( );

            System.out.println ( "\nUsing null check to handle null Pointer exception error in Address" );
            this.PreventiveNullCheck ( );

            System.out.println ( "\nUsing default address to handle null Pointer exception error in Address" );
            this.DefaultAddressApproach ( );
        }
    }

}

class Address{
    private String house_no;
    private String street;
    private String locality;
    private String district;
    private String state;
    private static final String country = "India";

    public Address(String house_no, String street, String locality, String district, String state){
        this.house_no = house_no;
        this.street = street;
        this.locality = locality;
        this.district = district;
        this.state = state;
    }

    String student_address(){
        return house_no + ", " + street + ", "+locality + ", "+district + ", "+state +", "+ country;
    }

}

public class NullPointerExceptionHandler1 {
    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Enter student details " );

        System.out.print ( "\nEnter student Name: " );
        String name = sc.nextLine ( );
        System.out.print ( "Enter student Enrollment Number: " );
        String En_no = sc.nextLine ( );
        System.out.print ( "Enter student Faculty Number: " );
        String faculty_no = sc.nextLine ( );

        Students student = new Students ( name, En_no, faculty_no );

        System.out.print ( "Do you want to enter permanent address(y/n): " );
        String PerAdd = sc.nextLine ( );

        if (PerAdd.equalsIgnoreCase ( "y" )) {
            student.setPermanentAddress ( address ( sc ) );
        }

        System.out.print ( "Do you want to enter correspondence address(y/n): " );
        String CorrAdd = sc.nextLine ( );

        if (CorrAdd.equalsIgnoreCase ( "y" )) {
            student.setCorrespondingAddress ( address ( sc ) );
        }

        student.StudentBasicDetails ();
        student.displayAddress ();


    }

    public static Address address ( Scanner sc ) {
        System.out.print ("Enter house no: ");
        String house_no = sc.nextLine ();
        System.out.print ("Enter street: ");
        String street = sc.nextLine ();
        System.out.print ("Enter locality: ");
        String locality = sc.nextLine ();
        System.out.print ("Enter district: ");
        String district = sc.nextLine ();
        System.out.print ("Enter state: ");
        String state = sc.nextLine ();
        return new Address ( house_no, street, locality, district, state );
    }
}

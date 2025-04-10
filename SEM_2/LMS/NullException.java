package LMS;

import java.util.*;
class Students extends ParentDetails{
    private String name;
    private String en_no;
    private String faculty_no;
    private String phone_no;
    private String email;
    private Address PermanentAddress;
    private Address CorrespondingAddress;


    public Students(String name, String en_no, String faculty_no, String father_name, String mother_name){
        super(father_name, mother_name);
        this.name = name;
        this.en_no = en_no;
        this.faculty_no = faculty_no;
    }

    public String getPhone_no () {
        return phone_no;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public void setPhone_no ( String phone_no ) {
        this.phone_no = phone_no;
    }

    void StudentParentDetails(){
        super.displayParentsDetails ();
        try {
            super.FatherContactDetails (super.getFatherPhoneNumber ());
            super.FatherEmailDetails (super.getFatherEmailAddress () );
            super.MotherContactDetails (super.getMotherPhoneNumber ());
            super.MotherEmailDetails (super.getMotherEmailAddress ());
        }catch (Exception e){
            System.out.print ("Not Available");
        }
    }

    void StudentDetails(){

        System.out.println ("\n-------------------Student Details------------------" );

        System.out.println ("\nStudent Name: "  + name);
        System.out.println ("Enrollment Number: "+ en_no );
        System.out.println ("Faculty Number: "+faculty_no);

        try{
            System.out.println ("Phone Number: " + getPhone_no ());
            System.out.println ("Email Address: " + getEmail ());
            System.out.println ("Permanent address: " + PermanentAddress.student_address () );
            System.out.print ("Corresponding address: " );
            System.out.print ( CorrespondingAddress.student_address ());
        }catch (NullPointerException e){
            System.out.print ("Not Available\n" );
        }

        this.StudentParentDetails ();
    }

    public void setCorrespondingAddress ( Address correspondingAddress ) {
        CorrespondingAddress = correspondingAddress;
    }

    public void setPermanentAddress ( Address permanentAddress ) {
        PermanentAddress = permanentAddress;
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

class ParentDetails{
    private String FatherName;
    private String MotherName;
    private String FatherPhoneNumber;
    private String FatherEmailAddress;
    private String MotherPhoneNumber;
    private String MotherEmailAddress;

    public ParentDetails(String FatherName, String MotherName){
        this.FatherName = FatherName;
        this.MotherName = MotherName;
    }

    public String getMotherName () {
        return MotherName;
    }

    public String getFatherName () {
        return FatherName;
    }

    public String getFatherPhoneNumber(){
        return FatherPhoneNumber;
    }

    public String getMotherPhoneNumber(){
        return MotherPhoneNumber;
    }

    public String getMotherEmailAddress(){
        return MotherEmailAddress;
    }

    public String getFatherEmailAddress(){
        return FatherEmailAddress;
    }

    public void setFatherEmailAddress ( String fatherEmailAddress ) {
        FatherEmailAddress = fatherEmailAddress;
    }

    public void setFatherPhoneNumber ( String fatherPhoneNumber ) {
        FatherPhoneNumber = fatherPhoneNumber;
    }

    public void setMotherEmailAddress ( String motherEmailAddress ) {
        MotherEmailAddress = motherEmailAddress;
    }

    public void setMotherPhoneNumber ( String motherPhoneNumber ) {
        MotherPhoneNumber = motherPhoneNumber;
    }

    void displayParentsDetails(){
        System.out.println ("Father's name: " + getFatherName () );
        System.out.println ("Mother's name: " + getMotherName () );
    }

    void FatherContactDetails(String phone_no){
        System.out.println ("Father's Phone number: " + phone_no );
    }

    void FatherEmailDetails(String email){
        System.out.println ("Father's email address: " + email );
    }

    void MotherContactDetails(String phone_no){
        System.out.println ("Mother's Phone number: " + phone_no );
    }

    void MotherEmailDetails(String email){
        System.out.println ("Mother's email address: " + email );
    }
}

public class NullException {
    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in );

        System.out.println ("Enter student details " );

        System.out.print ("\nEnter student Name: ");
        String name = sc.nextLine ();
        System.out.print("Enter student Enrollment Number: ");
        String En_no = sc.nextLine ();
        System.out.print("Enter student Faculty Number: ");
        String faculty_no = sc.nextLine ();
        System.out.print("Enter student Father Name: ");
        String FatherName = sc.nextLine ();
        System.out.print ("Enter student Mother Name: ");
        String MotherName = sc.nextLine ();

        Students student =  new Students ( name, En_no, faculty_no,FatherName,MotherName );

        System.out.print ("Do you want to enter student Phone number(y/n): ");
        String PStudent = sc.nextLine ();

        if(PStudent.equalsIgnoreCase ( "y" )){
            System.out.print ("Enter student Phone Number: ");
            String Phone = sc.nextLine ();
            student.setPhone_no ( Phone );
        }

        System.out.print ("Do you want to enter student Email Address(y/n): ");
        String EStudent = sc.nextLine ();

        if(EStudent.equalsIgnoreCase ( "y" )){
            System.out.print ("Enter student Email Address: ");
            String Email = sc.nextLine ();
            student.setEmail ( Email );
        }

        System.out.println ("Enter your permanent address " );
        student.setPermanentAddress ( address ( sc ) );

        System.out.print("Do you want to enter correspondence address(y/n): ");
        String CorrAdd = sc.nextLine ();

        if(CorrAdd.equalsIgnoreCase ( "y" )){
            student.setCorrespondingAddress ( address ( sc ) );
        }

        System.out.print ("Do you want to enter father phone no(y/n): ");
        String FPhone = sc.nextLine ();

        if(FPhone.equalsIgnoreCase ( "y" )){
            System.out.print ("Enter Father's Phone number: " );
            String FatherPhoneNo = sc.nextLine ();
            student.setFatherPhoneNumber ( FatherPhoneNo );
        }

        System.out.print("Do you want to enter mother phone no(y/n): ");
        String MPhone = sc.nextLine ();

        if(MPhone.equalsIgnoreCase ( "y" )){
            System.out.print ("Enter Mother's Phone number: " );
            String MotherPhoneNo = sc.nextLine ();
            student.setMotherPhoneNumber ( MotherPhoneNo );
        }

        System.out.print("Do you want to enter father email address(y/n): ");
        String FEmail = sc.nextLine ();

        if(FEmail.equalsIgnoreCase ( "y" )){
            System.out.print ("Enter Father's Email Address: " );
            String FatherEmail = sc.nextLine ();
            student.setFatherEmailAddress ( FatherEmail );
        }

        System.out.print("Do you want to enter mother email address(y/n): ");
        String MEmail = sc.nextLine ();

        if(MEmail.equalsIgnoreCase ( "y" )){
            System.out.print ("Enter Mother's Email Address: " );
            String MotherEmail = sc.nextLine ();
            student.setMotherEmailAddress ( MotherEmail );
        }

        student.StudentDetails ();

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

package LMS;

import java.sql.Array;

public class Student
{
    private String name;
    private String rollNo;
    private String enNo;
    private int total_marks;

    public Student(String name, String rollNo, String enNo, int total_marks){
        this.name = name;
        this.rollNo = rollNo;
        this.enNo = enNo;
        this.total_marks = total_marks;
    }

    public String getName () {
        return name;
    }

    public String getRollNo () {
        return rollNo;
    }

    public String getEnNo () {
        return enNo;
    }

    public int getTotal_marks () {
        return total_marks;
    }

    public void setTotal_marks ( int total_marks ) {
        this.total_marks = total_marks;
    }

    public void StudentDetails(){
        System.out.println ("Name: " +getName () );
        System.out.println ("Roll No: " +getRollNo () );
        System.out.println ("En No: " + getEnNo () );
    }

    public static void main ( String[] args ) {

        Student s1 = new Student ( "Sadaf" , "24CMAMSA149" , "GK6762" , 67 );
        Student s2 = new Student ( "Saud" , "24CAMSA115" , "GK4775" , 87 );
        Student s3 = new Student ( "Inab" , "24CAMSA123" , "GQ6754" , 56);
        Student s4 = new Student ( "Adeeba" , "24CAMSA108" , "GJ8204" , 87);
        Student s5 = new Student (  "Qudsia" , "24CAMSA109" , "GJ2504" , 45);

        Student[] student = {s1,s2,s3,s4,s5};

        int max = student[0].getTotal_marks ();

        for(int i = 0 ; i<5; i++){
            if(student[i].getTotal_marks ()>max){
                max = student[i].getTotal_marks ();
            }
        }

        for(int i = 0 ; i<5; i++){
            if(max==student[i].getTotal_marks ()){
                student[i].StudentDetails ();
            }
        }

    }
}

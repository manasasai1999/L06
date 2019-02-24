/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L05;

/**
 *
 * @author user
 */
public class Student 
{
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;

    public Student(String fName, String lName, int age) 
    {
           this.firstName = fName;
           this.lastName = lName;
           this.age = age;

           //init gpa
           semesterGPA();
   }

   public String getInfo() 
   {
        return "Name = " +this.firstName+" "+this.lastName+" "+this.gpa;
   }

   public void semesterGPA() 
   {
        double semgpa = Math.random() * 4.0;
        long factor = (long) Math.pow(10, 2);
        semgpa = semgpa * factor;
        long tmp = Math.round(semgpa);
        gpa=(double) tmp / factor;
   }

   public String getFirstName() 
   {
        return firstName;
   }

   public double getGPA() 
   {
        return gpa;
   }
}

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
public class Group 
{
    public String name;
    public Student member1, member2, member3, member4, member5;
    public double g1, g2, g3, g4, g;

    public Group(String name, Student s1, Student s2, Student s3, Student s4) 
    {
        this.name = name;
        member1   = s1;
        member2   = s2;
        member3   = s3;
        member4   = s4;
        
        g1 = member1.getGPA();
        g2 = member2.getGPA();
        g3 = member3.getGPA();
        g4 = member4.getGPA();
        g = g1+g2+g3+g4;  
    }
    
    public void getInfo() 
   {

        System.out.printf("Group Name: %s\n",this.name);

        this.member1.getInfo();
        this.member2.getInfo();
        this.member3.getInfo();
        this.member4.getInfo();

        System.out.printf("Group GPA: %.2f\n",this.averageGPA());

   }
    
    public void refreshGPAs() 
    {
 	   g1 = member1.getGPA();
        g2 = member2.getGPA();
        g3 = member3.getGPA();
        g4 = member4.getGPA();
        g = g1+g2+g3+g4;  
    }

   public Double averageGPA() 
   {
	    this.refreshGPAs();

	    long factor = (long) Math.pow(10, 2);
        double avgGPA = Math.round(g/4 * factor);

        return (double) avgGPA / factor;
   }
   
   public double getSemesterGPA(Student s) 
   {
        return s.getGPA();
   }
   
}

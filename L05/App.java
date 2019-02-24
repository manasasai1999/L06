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
public class App 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double avgGPA = 0.0;
        double semGPA = 0.0;

        Student s1 = new Student("Iron", "Man", 12);
        Student s2 = new Student("Black", "Widow", 12);
        Student s3 = new Student("Captain", "America", 12);
        Student s4 = new Student("Spider", "Man", 12);

        Group g1 = new Group("Avengers", s1, s2, s3, s4);
        new MainFrame(g1).setVisible(true);
        
    }
}

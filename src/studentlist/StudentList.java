/*
        Name:  [your name here]
        Assignment:  [assignment name]
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */

package studentlist;

import java.util.Scanner;

/**
 *
 * @author katarn
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter a word:");
        
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        
        // Do not forget length intialization
        // Remeber to put brackets for Array
        char[] letters = new char[word.length()]; 
        
        // Do not put - 1 ... ha...
        // have a loop to populate the Array
        for (int i = 0; i < word.length(); i++)
        {
            letters[i] = word.charAt(i);
        }
        
        System.out.println("Here is the printed out array:");
        
        // print out the array
        for (char letter: letters)
        {
            System.out.print(letter);
        }
        
        System.out.println();
        
        System.out.println("Here is the printed arrary backwards");
        
        // print out that array backwards
        for (int i = letters.length - 1; i >= 0; i--)
        {
            System.out.print(letters[i]);
        }
        
        System.out.println();
        
        System.out.println("Now we do the Student code");
        
        Student[] studentList = new Student[3];
        
        for (int i = 0; i < studentList.length; i++)
        {
            System.out.println("Enter the student name"); // User clarifaction
            String name = input.nextLine(); // Get the name
            Student student = new Student(name); // Student
            studentList[i] = student; // put student in the array
        }
        
        System.out.println("Here is the student");
        
        for (Student student: studentList)
        {
            System.out.println(student.getName()); 
            // Must use student.getName
            // Otherwise you will get binary
        }
        
    }

}

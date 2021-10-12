import java.util.Scanner;

public class Main { //Every Java program needs a class. That's just a part of Java being a lower level language, as opposed to a language like python for which so much boiler plate code isn't necessary to simply print Hello World
    public static void main(String[] args) { //vs code ide shortcut (called code completion): type "main" then hit tab and it autocompletes the main function
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammond";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        input.close();

        System.out.println(studentFirstName + " " + studentLastName + "now has a GPA of " + studentGPA);

    }
}
//This IDE contains a code editor, contains a debugger (details in later chapter), contains a compiler, and contains other fatures that make developing code easier

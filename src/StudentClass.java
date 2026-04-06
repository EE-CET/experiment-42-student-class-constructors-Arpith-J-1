import java.util.Scanner;

class Student {
    // TODO: Create a parameterized constructor Student(String name, int rollNo)
    String name;
    int rollNo;
    // TODO: Create a method or use direct access to print details in the required format
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    void display(){
        System.out.println("Name: "+ name+ " Roll: "+ rollNo);
    }
}

public class StudentClass {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // TODO: Read name1
        // TODO: Read rollNo1
        // Hint: Handle the newline consumption if using nextLine() after nextInt()
        String name1 = sc.nextLine();
        int rollNo1 = sc.nextInt();
        sc.nextLine();
        // TODO: Read name2
        // TODO: Read rollNo2
        String name2 = sc.nextLine();
        int rollNo2 = sc.nextInt();
        // TODO: Create two Student objects
        Student s1 = new Student(name1, rollNo1);
        Student s2 = new Student(name2, rollNo2);
        // TODO: Print details for both students
        s1.display();
        s2.display();
        sc.close();
        }
}

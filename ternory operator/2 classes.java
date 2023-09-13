import java.util.Scanner;

class Student1 {
    String name;
    int id;
    int age;
    String mobileNo;

    void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter ID: ");
        id = scanner.nextInt();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter mobile number: ");
        mobileNo = scanner.nextLine();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 student = new Student1();

        // Calling member function to get data
        student.getData();

        // Calling member function to display data
        student.display();
    }
}
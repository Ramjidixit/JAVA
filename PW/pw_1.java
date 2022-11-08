/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. */

class Student {
    String name;
    int roll_no;

    public void display() {
        System.out.println("Name=" + name);
        System.out.println("Roll number=" + roll_no);
    }
}

public class pw_1 {
    public static void main(String[] args) {
        Student detail = new Student();
        detail.name = "John";
        detail.roll_no = 2;
        detail.display();
    }

}

package HW1;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jane");
        Student student3 = new Student(3,"Jack");

        student1.display();
        student2.display();
        student3.display();

    }
}

package HW1;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBIT";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    static void change () {
        college = "Oxford";
    }
    void display () {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

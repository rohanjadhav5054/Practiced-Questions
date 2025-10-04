class Student{
    int rollNo;
    String name;
    int marks[];

    Student(int rollNo, String name, int marks[]) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public void calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = (double) total / marks.length;
        System.out.println("Average Marks: " + average);
    }
    public void displayDetails(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        calculateTotalMarks();
        calculateAverage();
    }
    public void calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Total Marks: " + total);
    }
}
public class exp2_s6 {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78};
        Student student = new Student(1, "John Doe", marks);
        student.displayDetails();
    }
}

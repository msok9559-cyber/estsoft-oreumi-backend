package day06;

public class Ex06 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Harry Potter",37,Gender.MALE,371,"Defence of the Dark");
        Student student = new Student("Rose Granger-Weasley",11,Gender.FEMALE,2,4.2,7128);

        teacher.print();
        student.print();
    }
}

package day05;

public class Student {
    private String name;
    private int korean;
    private int math;
    private int english;
    private double average;
    private char grade;

    public String getName() {return name;}
    public int getKorean() {return korean;}
    public int getMath() {return math;}
    public int getEnglish() {return english;}
    public double getAverage() {return average;}
    public char getGrade() {return grade;}

    public void setName(String name) {this.name = name;}
    public void setKorean(int korean) {this.korean = korean;}
    public void setMath(int math) {this.math = math;}
    public void setEnglish(int english) {this.english = english;}
    public void setAverage(double average) {this.average = average;}
    public void setGrade(char grade) {this.grade = grade;}
    public void calculate(){
        average = (korean + math + english) / 3.0;

        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.printf("Average: %.1f\n " , average);
        System.out.println("Grade: " + grade);
    }


}

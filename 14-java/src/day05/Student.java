package day05;

public class Student {
    private String name;
    private int korean;
    private int math;
    private int english;
    private double average;
    private char grade;

    private boolean check(int score){
        return score >= 0 && score <= 100;
    }

    public String getName() {return name;}
    public int getKorean() {return korean;}
    public int getMath() {return math;}
    public int getEnglish() {return english;}
    public double getAverage() {return average;}
    public char getGrade() {return grade;}

    public void setName(String name) {this.name = name;}
    public void setKorean(int korean) {
        if(check(korean)){
            this.korean = korean;
        }

    }
    public void setMath(int math) {
        if(check(math)){
            this.math = math;
        }
    }
    public void setEnglish(int english) {
        if(check(english)){
            this.english = english;
        }
    }
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
    /// 처음 짠코드하고 변한점 처음에는 average와 grade에 바로 계산하는 식으로 코드를 짬
    ///  문제 1) 출력할려고 보니 average 와 grade를 공백으로 두고 출력해야되서 코드가좀 길어지는 경향이있는거같아
    ///  계산해주는걸 따로 만들어서 출력함
    ///  문제 2) 검사를 하는 코드를 넣지않음 ************
    /// 항상 검사를하는 코드를 넣고 할것 이상한값이들어오면 문제가 생기기때문


}

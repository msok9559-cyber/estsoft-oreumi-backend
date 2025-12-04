package day05;

public class file08 {
    static void main() {
        Student s1 = new Student();

        s1.setName("Cheolsu Kim");
        s1.setKorean(88);
        s1.setMath(76);
        s1.setEnglish(64);
        s1.setAverage(0);
        s1.setGrade(' ');
        Student s2 = new Student();
        s2.setName("Yeonghee Park");
        s2.setKorean(98);
        s2.setMath(88);
        s2.setEnglish(94);
        s2.setAverage(0);
        s2.setGrade(' ');
        Student s3 = new Student();
        s3.setName("Gildong Hong");
        s3.setKorean(96);
        s3.setMath(64);
        s3.setEnglish(48);
        s3.setAverage(0);
        s3.setGrade(' ');

        s1.print();
        s2.print();
        s3.print();

    }

}

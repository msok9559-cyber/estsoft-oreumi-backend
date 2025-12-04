package day05;

public class file08 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Cheolsu Kim");
        s1.setKorean(88);
        s1.setMath(76);
        s1.setEnglish(64);
        Student s2 = new Student();
        s2.setName("Yeonghee Park");
        s2.setKorean(98);
        s2.setMath(88);
        s2.setEnglish(94);
        Student s3 = new Student();
        s3.setName("Gildong Hong");
        s3.setKorean(96);
        s3.setMath(64);
        s3.setEnglish(48);


        s1.calculate();
        s1.print();
        s2.calculate();
        s2.print();
        s3.calculate();
        s3.print();

    }

}

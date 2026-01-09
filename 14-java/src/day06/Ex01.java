package day06;

import day06.Sample;

public class Ex01 {
    public static void main(String[] args) {
        Sample sample1 = new Sample(10);
        Sample sample2 = new Sample(20);

        System.out.println("Sample1.Data: " + sample1.getData());
        System.out.println("Sample2.Data: " + sample2.getData());

        System.out.println("Sample1.NumInstances: " + sample1.getNumInstances());
        System.out.println("Sample2.NumInstances: " + sample2.getNumInstances());
    }
}

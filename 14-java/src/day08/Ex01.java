package day08;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("20255108","James"));
        list.add(new Student("20255114","Michael"));
        list.add(new Student("20255103","Hans"));

        list.sort((a, b) -> b.getId().compareTo(a.getId()));

        for(Student s : list){
            System.out.println(s);
        }
    }
}

package day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class file02 {
    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();
        for (int i =1; i<=45; i++){
            list.add(i);
        }
        Collections.shuffle(list);

        List<Integer> random = list.subList(0, 6);

        Collections.sort(random);

        System.out.println("Numbers =" + random);
    }
}

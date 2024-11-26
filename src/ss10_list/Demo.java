package ss10_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        generic
//        Nguyên lý D trong SOLID
        List<String> strings = new LinkedList<>();
        strings.add("haiTT");
        strings.add(1, "TrungDP");
//        strings.remove(2);
        strings.set(1, "ChanhTV");
        System.out.println(strings.get(1));


    }
}

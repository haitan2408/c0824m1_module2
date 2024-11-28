package ss10_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
//        generic
//        Nguyên lý D trong SOLID
        List<String> strings = new ArrayList<>();
        strings.add("haiTT");
        strings.add(1, "TrungDP");
//        strings.remove(2);
        strings.set(1, "ChanhTV");
        System.out.println(strings.get(4));


    }
}

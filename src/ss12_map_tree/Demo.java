package ss12_map_tree;

import mvc.entity.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "HaiTT");
//        map.put(0, "Nguyên");
//        map.put(2, "Minh");
//        map.put(4, "Tài");
//        map.put(11, "Hải");
//        Set<Integer> set = map.keySet();
//        for (Integer i: set) {
//            System.out.println(map.get(i));
//        }
//        for(Map.Entry<Integer, String> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        Set<Student> students = new TreeSet<>();

        students.add(new Student(1, "HaiTT", "QN", 9.0));
        students.add(new Student(0, "HaiTT", "DN", 9.0));
        students.add(new Student(1, "HaiTT1", "QN", 9.0));

        for (Student i: students) {
            System.out.println(i);
        }
    }
}

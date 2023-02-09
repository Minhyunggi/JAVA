package chap_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석","파이썬"));
        list.add(new Student("박명수","자바"));
        list.add(new Student("김종국","자바"));
        list.add(new Student("조세호","C"));
        list.add(new Student("서장훈","파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------");
        for (Student student : list) {
            if (student.license.equals("자바")){
                System.out.println(student.name);
            }
        }
    }
}

class Student{
    String name;
    String license;

    public Student(String name, String license) {
        this.name = name;
        this.license = license;
    }
}
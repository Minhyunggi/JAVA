package chap_10;

import java.util.ArrayList;
import java.util.stream.Stream;

public class _Quiz_10 {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("첸들러",50));
        list.add(new Customer("레이첼",42));
        list.add(new Customer("모니카",21));
        list.add(new Customer("벤쟈민",18));
        list.add(new Customer("제임스",5));
        System.out.println("미술관 입장료");
        System.out.println("--------------------");
//        list.stream().filter(x -> x.age >= 20).map(x -> x.name + " 5000원").forEach(System.out::println);
//        list.stream().filter(x -> x.age < 20).map(x -> x.name + " 무료입장").forEach(System.out::println);
        list.stream().map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료").forEach(System.out::println);
        

    }
}
class Customer{
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

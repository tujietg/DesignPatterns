package com.tujietg.strategy.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author tujietg
 * @date 12/1/20 9:41 PM
 */
public class ComparatorDemo {

    class Dog {
        private int age;
        private String name;

        public Dog(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog [age=" + age + ", name=" + name + "]";
        }

    }


    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        list.add(new ComparatorDemo().new Dog(5, "DogA"));
        list.add(new ComparatorDemo().new Dog(6, "DogB"));
        list.add(new ComparatorDemo().new Dog(7, "DogC"));
        Collections.sort(list, Comparator.comparing(Dog::getName));

        System.out.println("按照狗的名字排序" + list);
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {
	// i need to prepare the exam. About oop

        Cat cat = new Cat();
        cat.name = "lulu";
        cat.age = 5;
        cat.weight = 36;
        cat.color = "grey";
        cat.year = 2019;
        cat.makeSound();
        cat.year(3);
        System.out.println(cat);
        System.out.println();
        Cat cat1 = new Cat();
        cat1.name = "tom";
        cat1.age = 2;
        cat1.weight = 13;
        cat1.color = "black";
        cat1.year = 2021;
        cat1.year(1);
        cat1.makeSound();
        System.out.println(cat1);
        System.out.println();
        tom();
    }
    static void tom(){
        Cat f = new Cat();
        f.age = 5;
        f.year = 2022;
        f.name  = "tom";
        f.weight = 100;
        f.color = "yellow";
        System.out.println(f);
        f.makeSound();
        f.year(9);
    }
}

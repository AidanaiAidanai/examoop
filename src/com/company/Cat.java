package com.company;

public class Cat {
    String name;
    int age;
    String color;
    int weight;
    int year;

    void makeSound(){
        System.out.println("мышык мыйоолоп жатат");
    }
    void year(int a) {
        System.out.println("we have "+a+" cat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                '}';
    }
}

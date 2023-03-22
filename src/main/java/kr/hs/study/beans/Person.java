package kr.hs.study.beans;

class Job{}
public class Person {
    String name;
    int age;
    Job job;

//    Person(String name){
//        this.name = name;
//    }
//    Person(int age){
//        this.age = age;
//    }
//    Person(Job job){
//        this.job = job;
//    }

    Person(String name, int age, Job job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void pp(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("job : "+job);
    }
}
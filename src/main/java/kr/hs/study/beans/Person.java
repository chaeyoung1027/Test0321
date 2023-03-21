package kr.hs.study.beans;

class Job{}
public class Person {
    String name;
    int age;
    Job job;

    public void name(){
        this.name = "채영";
    }
    public void age(){
        this.age = 19;
    }
    public void job(){
    }
    public void pp(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("job : "+job);
    }
}
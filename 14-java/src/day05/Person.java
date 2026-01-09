package day05;

public class Person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void print(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }

}

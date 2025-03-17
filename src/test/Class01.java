package test;

public class Class01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setName("홍길동");
        p1.setAge(20);

        p1.introduce();
        p2.introduce();

        //이름: 홍길동, 나이: 20
        //이름: null, 나이: 0
    }
}

class Person {
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

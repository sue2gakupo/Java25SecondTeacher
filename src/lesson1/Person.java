package lesson1;
//類別

public class Person {
    // 屬性(自己的屬性/方法)
    public String name;
    public int age;

    public static String schoolName="QQ";
   

    // 建構子(初始化)
    public Person(String inputName, int inputAge) {
        
        this.name = inputName;
        this.age = inputAge;
    }

    // 方法
    public void showPersonInfo() {
        System.out.println("Name：" + this.name + " & age：" + this.age);
    }// 自己class的屬性用this呼叫



    }

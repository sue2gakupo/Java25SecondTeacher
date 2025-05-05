package lesson1;

public class Car {

    public String color;
    public String number;

    /*
     * 建構子(跟類別同名稱Car的方法)
     * 初始化屬性的物件
     */

    public Car(String number, String color) {
        // 宣告的String Number, String Color是區域變數
        // 沒寫this的變數變為區域變數，只能在此method內使用
        this.number = number;
        this.color = color;
    }

    // public Car(String inputNumber, String inputColor) {
    // (this.)number = inputNumber;
    // (this.)color = inputColor;
    // }

    // void不需要回傳
    public void showCarInfo() {
        System.out.println("Car number：" + this.number + " , Car color：" + this.color);
    }// 自己class的屬性用this呼叫

}
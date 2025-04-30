//類別

public class Car {
    // 屬性(自己的屬性/方法)
    public String color;
    public String number;
    public int year = 0;

    // 建構子(初始化)
    // 初始化屬性的物件

    public Car(String inputNumber, String inputColor) {

        this.number = inputNumber;
        this.color = inputColor;
    }

    // 方法
    public void showCarInfo() {
        System.out.println("Car number：" + this.number + " , Car color：" + this.color);
    }// 自己class的屬性用this呼叫

}
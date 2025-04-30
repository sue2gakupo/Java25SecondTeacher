package lesson2;

public class Dog extends Animal {

    public Dog(){
        // super();
        System.out.println("Dog建構子被呼叫");
    }//帶入參數進去就要把super寫出來

    public void bark() {
        System.out.println("狗在汪汪叫");
    }

    /*
     * 覆寫Override
     */
    @Override
    public void speak() {
        System.out.println("發出聲音:狗在汪汪叫");
    }// override覆寫父類別的speak

}// 子類別繼承父類別的方法

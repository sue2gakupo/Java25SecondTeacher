package lesson2;

public class Cat extends Animal {
    public void meow(){
        System.out.println("貓在喵喵叫");
    }
    

    @Override
    public void speak(){
        System.out.println("發出聲音:貓在喵喵叫");
    }

}//跟Dog同為子類別，皆繼承Animal父類別的功能
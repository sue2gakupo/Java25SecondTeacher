public class DemoCLass {
    public static void main(String[] args) {

        // 另開一個檔案為程式進入點，繼承也是開另一個檔案，開頭"main"的意思為程式進入點，
        // 另一個檔案的屬性、建構子、方法可以在main經由程式導入

        /*
         * 類別實作
         * car1是實作的物件 型別為Car型別為Car
         */
        Car car1 = new Car("001", "blue");
        car1.showCarInfo();
        car1.color = "blue"; // 直接改變屬性值
        car1.number = "001"; // 直接改變屬性值
        car1.showCarInfo(); // 呼叫方法

        Car car2 = new Car("002", "red");
        car2.showCarInfo();

        // 「臨時物件（anonymous object）+ 馬上呼叫方法」適用
        new Car("003", "yellow").showCarInfo();

        /*
         * for(int carIndex=1;carIndex<=10;carIndex++){
         * String carName
         * System.out.println(carIndex);
         * }
         */

        /*
         * 課間練習
         * 建立類別Person
         * 屬性：name, age
         * 方法：showName(),showAge()
         * 實作兩個person
         */
        // Person p1 = new Person("Sue", "17");
        // p1.showPersonInfo();

        // Person p2=new Person("Tom","20");
        // p2.showPersonInfo();

        // new Person("Chris","45").showPersonInfo();

        // new Person("Knife","100").showPersonInfo();

        // System.out.println("schoolName：" + Person.schoolName);
        // Person p3=new Person();

        /*
         * 課間練習
         * 設計衣服(Cloth)類別
         * 顏色(color)尺寸(size) logo
         * 用非建構子的方式直接設定值 印出logo color size等資訊
         */

        // 實體化
        // 1.用建構子初始化物件屬性(寫new Cloth()的時候會自動呼叫建構子)
        /*
         * Cloth c1 = new Cloth("Nike", "white", "XL");
         * c1.showInfo();
         * c1.size = "L"; // 直接改變屬性值
         * c1.showInfo();
         * c1.color = "black";
         * c1.showInfo();
         * System.out.println(c1.color); //可以直接印出單個屬性值
         */

        // 2.用非建構子

        /*
         * Cloth c2 = new Cloth();
         * c2.logo="Adidas";
         * c2.color="red";
         * c2.size="M";
         * c2.showInfo();
         */


         
        /* Bank實體化
        封裝練習 Getter*Setter */
         
        

        /* // 開戶並且存款1000
        Bank b1 = new Bank("Duu", "1000");
        b1.showBalance();

        // 顯示帳戶與餘額，透過窗口
        b1.setBalance1(5000);
        int myBalance=b1.getBalance1();
        System.out.println("存錢後的餘額"+myBalance);

       
        b1.setBalance1(5000);
        int myBalance1=b1.getBalance1();
        System.out.println("存錢後的餘額"+myBalance); */

    }
}
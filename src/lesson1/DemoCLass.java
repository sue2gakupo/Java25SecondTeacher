package lesson1;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;

import lesson1.homework.traning.Employee;

public class DemoCLass {
    public static void main(String[] args) {

        // 另開一個檔案為程式進入點，繼承也是開另一個檔案，開頭"main"的意思為程式進入點，
        // 另一個檔案的屬性、建構子、方法可以在main經由程式導入

        /*
         * 類別實作
         * car1是實作的物件 型別為Car型別為Car
         */
        /*
         * Car car1 = new Car("001", "blue");
         * car1.showCarInfo();
         * car1.color = "blue"; // 直接改變屬性值
         * car1.number = "001"; // 直接改變屬性值
         * car1.showCarInfo(); // 呼叫方法
         * 
         * Car car2 = new Car("002", "red");
         * car2.showCarInfo();
         * 
         * // 「臨時物件（anonymous object）+ 馬上呼叫方法」適用
         * new Car("003", "yellow").showCarInfo()
         */;

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

        /*
         * Bank實體化
         * 封裝練習 Getter*Setter
         */

        // 開戶並且存款1000
        /*
         * Bank b1 = new Bank("Duu", "1000");
         * b1.showBalance();
         * 
         * // 顯示帳戶與餘額，透過窗口
         * b1.setBalance1(5000);
         * int myBalance = b1.getBalance1();
         * System.out.println("存錢後的餘額" + myBalance);
         * 
         * b1.setBalance1(5000);
         * int myBalance1 = b1.getBalance1();
         * System.out.println("存錢後的餘額" + myBalance);
         * 
         * 
         * }
         * 
         * /*
         * 課程練習
         * 修改可以變更account
         * 注意需比對原帳號，正確才能修正
         * 改完帳號後分別用新舊帳號存錢/提領
         */

        /*
         * 命名一個類別student
         * 兩個私有屬性 name score
         * 用getter setter 存取name跟score
         * setScore 內要檢查 數入的score為0~100間
         * 不在此範圍需跳出回應"分數在0~100之間"
         */

        Student s1 = new Student();
        s1.setName("Tom");
        s1.setScore(101);
        System.out.println(s1.getName() + "分數" + s1.getScore());

        s1.setScore(80);
        System.out.println(s1.getName() + "修改成功之分數" + s1.getScore());

        /*
         * 多載介紹(Overload)
         */

        // Printer p1 = new Printer();
        // p1.show();
        // p1.show(101);
        // p1.show("1");
        // p1.show("2", "2");
        // p1.show("good", 15);

        /*
         * 課堂練習:
         * 產生一個Area類別
         * 產生Method 名稱為cal()
         * 分別產生圓形、長方形、三角形面積計算
         */

        // Area a1=new Area();
        // a1.show(2);
        // a1.show(45, 3);
        // a1.show(2, 3 );

        /*
         * package呼叫：import很重要
         */

        /*
         * 課堂練習:
         * 產生一個lesson1產生以下路徑資料夾lesson1>homework>traning
         * 在training內放Employee類別
         * Employee 請用getter setter存取name
         * 最後在DemoClass實做一個Employee物件且印出getName()
         */
        lesson1.homework.traning.Employee e1 = new lesson1.homework.traning.Employee("Evan");
        System.out.println("Evan");

    }

}
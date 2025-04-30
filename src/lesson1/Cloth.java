package lesson1;

//1.我還是要先用有建構子的方法

/* public class Cloth {
    // 屬性(定義型別)
    public String logo;
    public String color;
    public String size;

    // 建構子(初始化)(方法名要跟class名稱大小寫完全一樣)
  
    public Cloth(String logo, String color,String size) {
        
        this.logo = logo;
        this.color = color;
        this.size = size;
    }

    // 方法:建索引值顯示衣服資訊
    public void showInfo() {
        System.out.println("Logo：" + this.logo + " color：" + this.color+" size:"+this.size);
    }// 屬性用this呼叫

} */


//2.沒有建構子得方法
/* public class Cloth{
    public String logo;
    public String color;
    public String size;
}
public void showInfo() {
    System.out.println("Logo：" + this.logo + " color：" + this.color+" size:"+this.size);
} */
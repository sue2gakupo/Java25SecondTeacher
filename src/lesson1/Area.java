package lesson1;
public class Area{

    public void show(int radius){
        if(radius==0){  //if防呆,,防止使用者輸入0不能計算
            System.out.println("半徑不能為0");
        }else{
             System.out.println("圓形面積："+(3.14*radius*radius));
        }
       
    }

    public void show(int length, int width){
        if(length==0||width==0){
            System.out.println("長或寬不能為0");
        }else{
            System.out.println("長方形面積："+length*width);
        }
        

    }

    public void show(int base,int height,String text ){
        if(base==0||height==0){
            System.out.println("底或高不能為0");
        }else{
            System.out.println("三角形面積："+base*height/2);
        }
        

    }
    
}
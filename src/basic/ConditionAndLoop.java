package basic;
public class ConditionAndLoop {
    public static void main(String[] args) throws Exception {
        /*
         * 條件式
         * 
         * if (條件) {
         * 條件成立時執行的程式碼
         * } else {
         * 條件不成立時執行的程式碼
         * }
         */
        // int a = 2;
        // int b = 3;

        /*
         * if((a <= b)) {
         * System.out.println("a 的確 <= b");
         * } else {
         * System.out.println("a 沒有 <= b");
         * }
         */

        /*
         * if((a == 2) && (b == 3)) {
         * System.out.println("條件成立");
         * } else {
         * System.out.println("條件不成立");
         * }
         * 
         * if((a == 1) || (b == 3)) {
         * System.out.println("條件成立");
         * } else {
         * System.out.println("條件不成立");
         * }
         * 
         * if((a == 2) && (b == 3)|| (b == 4)) {
         * System.out.println("條件成立");
         * } else {
         * System.out.println("條件不成立");
         * }
         */

        /*
         * else if
         * 
         * if (條件1) {
         * 條件1成立時執行的程式碼
         * } else if (條件2) {
         * 條件2成立時執行的程式碼
         * } else {
         * 條件1跟條件2都不成立時執行的程式碼
         * }
         */

        /*
         * int a = 5;
         * 
         * if (a == 4) {
         * System.out.println("a : 2");
         * } else if (a == 3) {
         * System.out.println("a : 3");
         * } else if (a == 4) {
         * System.out.println("a : 4");
         * } else {
         * System.out.println("a 為2,3,4以外的數字");
         * }
         */

        // 用if else判斷學生分數
        // 分數90~100 印出(超棒)
        // 分數80~89 印出(很好)
        // 分數60~79 印出(還不錯)
        // 其他 印出(加油)

        /*
         * int g = 81;
         * if (g >= 90) {
         * System.out.println("超棒");
         * } else if (g >= 80 && g < 90) {
         * System.out.println("很好");
         * } else if (g >= 60 && g < 80) {
         * System.out.println("還不錯");
         * } else {
         * System.out.println("加油");
         * }
         */

        /*
         * int a = 5;
         * int b = 0;
         * 
         * if (b==0){
         * System.out.println("分母不能為0");
         * }else{
         * double quotiend1 = a / b;
         * System.out.println(quotiend1);
         * }
         */

        /*
         * 取代判斷式的寫法
         * String[] results={
         * "a : 0",
         * "a : 1",
         * "a : 2",
         * "a 為0,1,2以外的數字"
         * };
         * System.out.println(results[0]);
         */

        /*
         * 簡化if else 寫法
         * (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼
         */
        // int a = 2;
        // int b = 3;

        // String min = (a < b) ? "A < B" : "A > B"; //第一種寫法
        // int min = (a < b) ? 1 : 0; //第二種寫法
        // System.out.println(min);

        /*
         * ↑↑↑這兩行 效果等於以下寫法
         */
        // if(a < b) {
        // System.out.println("A < B");
        // } else {
        // System.out.println("B > A");
        // }

        /*
         * for 迴圈
         * for (初始值; 進入迴圈條件; 增量/減量) {
         * 條件成立時執行的程式碼
         * }
         * ++:自增1
         */

        /*
         * for (int index = 0; index <= 10; index++) {
         * System.out.println(index);
         * System.out.println(index + 1);
         * }
         */

        /*
         * 課間練習題1:不要印出2x2、3x3,....9x9
         * 
         */
        // for (int x = 2; x <= 9; x++) {
        // for (int y = 1; y <= 9; y++) {
        // if (x != y) {
        // System.out.print(x + "x" + y + "=" + x * y + " "); // print不換行印出
        // }
        // }
        // System.out.println();
        // }

        /*
         * 課間練習題2:設計一個金字塔
         * *
         * ***
         * *****
         * *******
         * 有四行，先印空白,再印星星
         */

        // int ln = 50;// 第N行
        // for (int x = 1; x <= ln; x++) {
        // // 先印空白
        // for (int blank = 1; blank <= ln - x; blank++)
        // System.out.print(" ");
        // // 再印星星
        // for (int star = 1; star <= (2 * x) - 1; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /*
         * 課間練習題3：
         * 從1~100
         * 遇到15倍數輸出"FizzBuzz"
         * 遇到5倍倍數輸出"Buzz"
         * 遇到3倍數輸出"Fizz"
         * 其他則輸出正常數字
         */

        // for (int i = 1; i <= 100; i++) {
        // if (i % 15 == 0) {
        // System.out.println("FixBuzz");
        // }else if (i%5==0){
        // System.out.println("Buzz");
        // }else if(i%3==0){
        // System.out.println("Fizz");
        // }else{
        // System.out.println(i);
        // }
        // }

        /*
         * for 迴圈 將array所有元素印出來範例
         * 元素長度可以用 array.length 取得
         * 可用Debug 觀察 index 的變化
         */

        // int[] bingo = { 7, 22, 89, 55 };
        // // for(int index = 0; index < bingo.length; index ++) {
        // for (int index = 0; index <= bingo.length - 1; index++) {
        // System.out.println(bingo[index]);
        // }

        /*
         * 課間練習題 ：把 bingo內所有數字加總且印出
         */
        // int sum = 0;
        // int[] bingo1 = { 7, 22, 89, 55, 88 };
        // for (int index = 0; index <= bingo1.length - 1; index++) {
        //     sum = sum + bingo1[index];
        // }
        // System.out.println(sum);

        /*
         * 課間練習題
         */
        // int max = 0;
        // int[] bingo = { 7, 22, 89, 55, 88 };
        // for (int index = 0; index <= bingo.length - 1; index++) {
        //     if (bingo[index] > max) {
        //         max = bingo[index];
        //     }
        // }
        // System.out.println(max);

        // JSON Object
        // key value
        // [{
        //     "name":"t1",
        //     "age":14
        // },

        // {
        //     "name":"t2",
        //     "age":12
        // }]
        // {"t1","t2"}
        // {14,15}

        /*
         * for 迴圈 減量範例
         * 這裡的 index 會從10開始，然後每次減1，直到 index <= 0 為止
         * 可用Debug 觀察 index 的變化
         */
        // for(int index = 10; index > 0; index --) {
        // System.out.println(index);
        // }

        /*
         * for each 迴圈
         * for (資料型態 單一變數名稱 : 陣列變數名稱) {
         * 條件成立時執行的程式碼
         * }
         * 兩個陣列要長度一樣才能同時被一個for抓到
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (String stu : students) {
        // System.out.println(stu);
        // }

        /*
         * 這幾行 效果等於以下寫法
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (int index = 0; index <= students.length - 1; index++) {
        // System.out.println(students[index]);
        // }

    }
}

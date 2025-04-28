public class MethodInfo {
    public static void main(String[] args) throws Exception {
        // 沒有輸入參數 ＆ 沒有回傳值
        // sayHello1();

        // 有輸入參數 ＆ 沒有回傳值
        // String inputName = "Suyi";
        // int[] score = { 55 };
        // sayHello2(inputName, 25, score);

        // sayHello2("Sue", 23, score);

        // 有輸入參數 ＆ 有回傳值
        // 需要用變數接回傳值
        // String result = sayHello3("Jerry");
        // System.out.println(result);

        // System.out.println(sayHello3("Jerry")); 第二種寫法,更快速,需要熟練度

        //練習題：判斷式回傳印出
        String getResult = checkScore(99);
        System.out.println(getResult);

        //System.out.println(checkScore(25));第二種寫法

    }

    /*
     * 成績判斷的method
     * 輸入分數(int)
     * method內容
     * 用if elseif判斷學生分數
     * 分數90~100 印出(超棒)
     * 分數80~89 印出(很好)
     * 分數60~79 印出(還不錯)
     * 其他 印出(加油)
     * 回傳結果 印出(String)
     */

    public static String checkScore(int scroe) {
        String result = "";

        if (scroe >= 90) {
            result = "超棒";
        } else if (scroe >= 80 && scroe < 90) {
            result = "很好";
        } else if (scroe >= 60 && scroe < 80) {
            result = "還不錯";
        } else {
            result = "加油";
        }
        return result;

    }

    /*
     * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
     * 
     * 修飾: public, private, protected
     * 靜態: static (靜態方法只能呼叫靜態方法) ‼
     * 無回傳值: void
     * 方法名稱: sayHello1
     * 輸入參數: 無
     */
    // public static void sayHello1() {
    // System.out.println("Hi everyone");
    // // void 可省略 return;
    // return;
    // }

    /*
     * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
     * 
     * 修飾: public, private, protected
     * 靜態: static (靜態方法只能呼叫靜態方法)
     * 無回傳值: void
     * 方法名稱: sayHello2
     * 輸入參數: String name
     */
    // public static void sayHello2(String name, int age, int[] score) {
    // System.out.println("Hi " + name);
    // System.out.println("Age" + age);
    // System.out.println("Score:"+score[0]);
    // // void 可省略 return;
    // return;
    // }

    /*
     * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
     * 
     * 修飾: public, private, protected
     * 靜態: static (靜態方法只能呼叫靜態方法)
     * 有回傳值: 型態為: String
     * 方法名稱: sayHello2
     * 輸入參數: String name
     */
    public static String sayHello3(String name) {
        return "Hi " + name;
    }

}

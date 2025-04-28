public class BasicDeclare {
    public static void main(String[] args) throws Exception {
        /*
         * 基本型別介紹
         * int: 整數, 範圍: -2,147,483,648 ~ 2,147,483,647
         *
         * byte: 整數, 範圍: -128 ~ 127
         *
         * long: 整數, 範圍: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 , 需要加上L
         *
         * float: 32位元浮點數, 需要加上F
         *
         * double: 64位元浮點數, 預設型別
         *
         * char: 字元, 1個字元, 單引號
         *
         * String: 文字, 多個字元, 雙引號
         *
         * boolean: 布林, true/false
         */

        // int age = 5555555;
        // System.out.println(age);

        // long age2 = 555555555555L;
        // System.out.println(age2);

        // float weight1 = 49.4F; // float型別需要加上F
        // System.out.println(weight1);

        // double weight2 = 49.49;
        // System.out.println(weight2);

        // char c1 = 'A';
        // System.out.println(c1);

        // String name = "救命";
        // System.out.println(name);

        // boolean isStudent = true; // false
        // System.out.println(isStudent);
        // 部分語言會印出1跟0,Java則是印出true跟false

        /*
         * 陣列(Array)宣告
         * 要給陣列"型別"e.g. int[] ，大括號內的資料要跟型別一致
         * 陣列的長度是固定的, 不能改變
         * 陣列的長度是從0開始計算： 0 ~ n-1
         */
        // int[] bingo = {7, 22, 89, 55, 33, 99, 28, 60};
        // System.out.println(bingo[7]);
        // System.out.println(bingo[2]);

        // float[] weight1 = {44.2F, 21.5F};
        // System.out.println(weight1[0]);

        // boolean[] b1 = {true, false, true};
        // System.out.println(b1[2]);

        // String[] students = {"A1", "A2", "A3"};
        // System.out.println(students[1]);

        //String[] classRooms = { "教室1", "教室2", "教室3" }; // 變數不能用中文
        //System.out.println(classRooms[2]);

    }
}

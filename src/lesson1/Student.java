package lesson1;
public class Student {
    // 封裝：將屬性設為 private，只能透過方法存取
    private String name;
    private int score;

    // if用建構子（入口1）：初始化物件時直接設定姓名與分數
    // 呼叫 set 方法可以套用分數的判斷邏輯（導向入口2）
    /*
     * public Student(String name, int inputScore) {
     * this.setName(name);
     * this.setScore(inputScore);
     * }
     */


    // Getter：提供 name 屬性的讀取方式
    public String getName() {
        return this.name;
    }

    // Setter：提供 name 屬性的設定方式
    public void setName(String name) {
        this.name = name;
    }

    // Getter：提供 score 屬性的讀取方式
    public int getScore() {
        return this.score;
    }

    // Setter（入口2）：設定 score 時加上範圍驗證
    public void setScore(int inputScore) {

        if (inputScore >= 0 && inputScore <= 100) {
            this.score = inputScore;
        } else {
            System.out.println("分數需在0~100之間");
        }

    }

}

package lesson1;

public class Teacher {
    private String teacherAccount;
    private int score1;
    private int score2;

    public Teacher(String teacherAccount) {
        this.teacherAccount = teacherAccount;
    }

    public int getScore1(String teacherAccount) {
        if (teacherAccount != this.teacherAccount) {
            System.out.println("老師帳號錯誤");
            return -1;
            // 老師帳號比對失敗
        } else {
            return this.score1;
            // 老師帳號比對成功
        }
    }

    public void setScore1(String teacherAccount, int score1) {
        if (teacherAccount != this.teacherAccount) {
            // 老師帳號比對失敗
            System.out.println("老師帳號輸入錯誤");
        } else {
            // 老師帳號比對成功
            if (score1 <= 100 && score1 >= 0) {
                this.score1 = score1;
            } else {
                System.out.println("分數需在0~100之間");
            }
        }
    }

    public int getScore2(String teacherAccount) {
        if (teacherAccount != this.teacherAccount) {
            System.out.println("老師帳號錯誤");
            return -1;
            // 老師帳號比對失敗
        } else {
            return this.score2;
            // 老師帳號比對成功
        }
    }

    public void setScore2(String teacherAccount, int score2) {
        if (teacherAccount != this.teacherAccount) {
            // 老師帳號比對失敗
            System.out.println("老師帳號錯誤");
        } else {
            // 老師帳號比對成功
            if (score2 <= 100 && score2 >= 0) {
                this.score2 = score2;
            } else {
                System.out.println("分數需在0~100之間");
            }
        }
    }

}

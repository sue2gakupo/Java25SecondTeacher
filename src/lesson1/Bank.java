package lesson1;

public class Bank {
   
    private String account;
    private int balance1 = 0;

    // 建構子(初始化)
    public Bank(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance1 = inputBalance;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    // 想像情境：回傳餘額
    public int getBalance1() {
        return this.balance1;
    }

    // 想像情境：存錢/提款
    // account:帳號
    // action:存款/提款
    // balance1:存款/提款金額
    
    public void setBalance1(String account, String action, int balance1) {
        if (account != this.account) {
            System.out.println("您的帳號輸入錯誤，無法執行此交易");
        } else {

            // 存錢/提款
            if (action == "deposit") {
                if (balance1 > 0) {
                    this.balance1 = this.balance1 + balance1;
                } else {
                    System.out.println("存進來要大於0");
                }

                if (action == "withdraw") {
                    if (this.balance1 >= balance1) {
                        this.balance1 = this.balance1 + balance1;
                    } else {
                        System.out.println("您的餘額不足");
                    }
                }
            }
        }
    }

    // 顯示餘額
    public void showBalance() {
        System.out.println(this.account + "balance:" + this.balance1);
    }

}

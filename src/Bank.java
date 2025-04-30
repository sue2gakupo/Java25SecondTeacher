public class Bank {
    //屬性private
    private String account;
    private int balance1;

    // 建構子(初始化)
    public Bank(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance1 = inputBalance;
    }

    //顯示餘額
    public void showBalance() {
        System.out.println(this.account + "balance:" + this.balance1);
    }

    //四個function讀取
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

    // 想像情境：存錢
    public void setBalance1(int balance1) {
        if(balance1>0){
            this.balance1=this.balance1+balance1;
        }else{
            System.out.println("存款需大於零");
        }
        this.balance1 = this.balance1 + balance1;
    }

}

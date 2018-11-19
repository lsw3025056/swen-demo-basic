package syncthread;

/**
 * 银行账户类
 * @author liusw
 * @date 2018-11-14 16:08
 */
public class Account {
    String name;
    float amount;

    public Account(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    // 存钱
    public void  deposit(float amt) {
        amount += amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 取钱
    public void withdraw(float amt) {
        amount -= amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public float getAmount() {
        return amount;
    }
}

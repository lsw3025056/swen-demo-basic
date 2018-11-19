package syncthread;

/**
 * 账户操作类
 *
 * @author liusw
 * @date 2018-11-14 16:11
 */
public class AccountOperator implements Runnable{
    private Account account;

    public AccountOperator(Account account) {
        this.account = account;
    }


    public void run() {
        synchronized (account) {
            // 存100块
            account.deposit(100);
            // 取50块
            account.withdraw(50);
            System.out.println(Thread.currentThread().getName() + ":" + account.getAmount());
        }
    }
}

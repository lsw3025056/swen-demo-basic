package syncthread;

/**
 * @author liusw
 * @date 2018-11-12 17:56
 */
public class Test {
    public static void main(String[] args) {
        accountTest1();
    }

    public static void blockTest1() {
        // t1和t2是互斥的，锁定当前对象
        SyncThread syncThread = new SyncThread();
        Thread t1 = new Thread(syncThread, "t1");
        Thread t2 = new Thread(syncThread, "t2");
        t1.start();
        t2.start();
    }

    public static void blockTest2() {
        // 只锁定对象，每个对象只有一个锁与之相关联； 两把锁分别锁定，互不干扰，同时进行
        SyncThread syncThread1 = new SyncThread();
        SyncThread syncThread2 = new SyncThread();
        Thread t1 = new Thread(syncThread1, "t1");
        Thread t2 = new Thread(syncThread2, "t2");
        t1.start();
        t2.start();
    }

    public static void blockTest3() {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "A");
        Thread t2 = new Thread(counter, "B");
        t1.start();
        t2.start();
    }

    public static void accountTest1() {
        Account account = new Account("张三", 1000.0f);
        AccountOperator accountOperator = new AccountOperator(account);
        final int THREAD_NUM = 5;
        Thread t1 = new Thread(accountOperator, "t1");
        Thread t2 = new Thread(accountOperator, "t2");
        Thread t3 = new Thread(accountOperator, "t3");
        Thread t4 = new Thread(accountOperator, "t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

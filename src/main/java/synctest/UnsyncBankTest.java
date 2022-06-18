package synctest;

/**
 * @author yuxiang.chu
 * @date 2022/6/18 11:00
 **/
public class UnsyncBankTest {

    public static void main(String[] args) {
        Bank b = new Bank(100, 1000);
        for (int i = 0; i < 100; i++) {
            TransferRunnable transferRunnable = new TransferRunnable(b, i, 1000);
            Thread t = new Thread(transferRunnable);
            t.start();
        }
    }
}

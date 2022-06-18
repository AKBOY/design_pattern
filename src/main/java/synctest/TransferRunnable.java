package synctest;

/**
 * @author yuxiang.chu
 * @date 2022/6/18 11:06
 **/
public class TransferRunnable implements Runnable{

    private Bank bank;
    private int fromAccount;
    private double maxAmount;

    public TransferRunnable(Bank b, int from, double max){
        this.bank = b;
        this.fromAccount = from;
        this.maxAmount = max;
    }
    @Override
    public void run() {
        try {
            while(true) {
                int toAccount = (int)(bank.size() * Math.random());
                double amount = maxAmount * Math.random();
                bank.transfer(fromAccount, toAccount, amount);
                Thread.sleep((int) (10 * Math.random()));
            }
        } catch (Exception e) {
            System.out.println("错误~~~~");
        }
    }
}

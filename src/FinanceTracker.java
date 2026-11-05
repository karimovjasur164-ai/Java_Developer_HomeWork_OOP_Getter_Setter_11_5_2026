public class FinanceTracker {
    private Transaction[] transactions = new Transaction[100]; // Yangilik 03 - dars PDF dan qildim Hali tushunmadim ko'rib sinab qildim

    private int count = 0;

    // 🟣 Tranzaksiya qo'shadi
    public void addTransaction(Transaction transaction) {
        if (count < transactions.length) {
            transactions[count] = transaction;
            count++;
        }
    }

    // 🔵 Tranzaksiyalarnai chiqaradi
    public void showTransactions() {
        for (int i = 0; i < count; i++) {
            System.out.println(transactions[i]);
        }
    }

    // 🟢 Balansni hisoblaydi
    public double getBalance() {
        double balance = 0;

        for (int i = 0; i < count; i++) {
            if (transactions[i].getType().equals("Mackbook")) {
                balance = balance + transactions[i].getAmount();
            } else {
                balance = balance - transactions[i].getAmount();
            }
        }

        return balance;
    }
}

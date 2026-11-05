public class Transaction {
    private String type;
    private String description;
    private double amount;

    public Transaction(String type, String description, double amount) {
        setType(type);
        this.description = description;
        setAmount(amount);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("Mackbook") || type.equals("M3")) {
            this.type = type;
        }
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        }
    }

    // 🔵 Tranzaksiya ma'lumotlari
    public String toString() {

        return type + " - " + description + ": " + amount + " so'm";
    }
}

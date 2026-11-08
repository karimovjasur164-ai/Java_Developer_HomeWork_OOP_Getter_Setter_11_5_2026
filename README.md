# ☕ Java Developer: OOP Encapsulation (Getter & Setter)  ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

> **Muallif:** Rahimjonov Otabek  
> **Mavzu:** Obyektga Yo'naltirilgan Dasturlash (OOP) — Inkapsulyatsiya, `private` modifikatori, `Getter` va `Setter` metodlari amaliyoti.

Ushbu repozitoriyada ma'lumotlar xavfsizligini ta'minlash, klas maydonlarini noto'g'ri qiymatlardan himoya qilish (Validation) va obyektlar o'rtasidagi to'g'ri aloqalarni shakllantirish bo'yicha yozilgan real loyiha klasslari jamlangan.

---

## 📁 Kodlar Ro'yxati va Masala Shartlari

### 📄 Address2.java: Manzil klassi
Mijozning yashash yoki etkazib berish manzili (mamlakat, shahar, ko'cha) ma'lumotlarini saqlaydi.
```java
public class Address2 {
    private String country;
    private String city;
    private String street;

    public Address2(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
}
```

### 📄 Customer.java: Mijoz profili klassi
Tizim foydalanuvchisi ma'lumotlarini (ism, login, parol va `Address2` obyekti) xavfsiz inkapsulyatsiya qiladi.
```java
public class Customer {
    private String name;
    private String username;
    private String password;
    private Address2 address;

    public Customer(String name, String username, String password, Address2 address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Address2 getAddress() { return address; }
    public void setAddress(Address2 address) { this.address = address; }
}
```

### 📄 Product2.java: Mahsulot klassi
Mahsulot nomi, narxi va ombordagi sonini boshqaradi. Narx va son manfiy bo'lmasligi validatsiya qilingan.
```java
public class Product2 {
    private String name;
    private double price;
    private int stockQuantity;

    public Product2(String name, double price, int stockQuantity) {
        this.name = name;
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Xatolik: Narx manfiy bo'lishi mumkin emas!");
        }
    }

    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("Xatolik: Mahsulot soni manfiy bo'lishi mumkin emas!");
        }
    }
}
```

### 📄 PaymetCard2.java: To'lov kartasi klassi
Karta raqami, amal qilish muddati va balans xavfsizligini ta'minlaydi. Pul yechish va solish amallari tekshiriladi.
```java
public class PaymetCard2 {
    private String cardNumber;
    private double balance;
    private String expiryDate;

    public PaymetCard2(String cardNumber, double balance, String expiryDate) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() { return cardNumber; }
    public double getBalance() { return balance; }
    public String getExpiryDate() { return expiryDate; }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
```

### 📄 Order.java: Buyurtma klassi
Mijoz (`Customer`) va sotib olinayotgan mahsulot (`Product2`) zanjirini hamda buyurtma holatini bog'laydi.
```java
public class Order {
    private Customer customer;
    private Product2 product;
    private int quantity;
    private String status;

    public Order(Customer customer, Product2 product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.status = "Kutilmoqda";
    }

    public Customer getCustomer() { return customer; }
    public Product2 getProduct() { return product; }
    public int getQuantity() { return quantity; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
```

### 📄 Transaction.java: Tranzaksiya klassi
Pul o'tkazmalari ID raqami, summasi va turi (Kirim/Chiqim) hisobini xavfsiz yuritadi.
```java
public class Transaction {
    private String transactionId;
    private double amount;
    private String type;

    public Transaction(String transactionId, double amount, String type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
    }

    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public String getType() { return type; }
}
```

### 📄 FinanceTracker.java: Moliya trekeri klassi
Foydalanuvchining umumiy balansi, umumiy daromad (income) va xarajatlarini (expense) hisoblab boradi.
```java
public class FinanceTracker {
    private double totalBalance;
    private double totalIncome;
    private double totalExpense;

    public FinanceTracker(double initialBalance) {
        this.totalBalance = initialBalance;
    }

    public double getTotalBalance() { return totalBalance; }
    public double getTotalIncome() { return totalIncome; }
    public double getTotalExpense() { return totalExpense; }

    public void addIncome(double amount) {
        if (amount > 0) {
            this.totalIncome += amount;
            this.totalBalance += amount;
        }
    }

    public void addExpense(double amount) {
        if (amount > 0 && this.totalBalance >= amount) {
            this.totalExpense += amount;
            this.totalBalance -= amount;
        }
    }
}
```

### 📄 Main.java: Dasturni ishga tushirish
Yuqoridagi barcha klasslar obyektlarini yaratib, ularning Setter-Getter metodlarini test qiladi.
```java
public class Main {
    public static void main(String[] args) {
        Address2 address = new Address2("Uzbekistan", "Tashkent", "Chilanzar");
        Customer customer = new Customer("Otabek", "otabek_dev", "pass123", address);
        Product2 product = new Product2("Laptop", 500.0, 10);
        PaymetCard2 card = new PaymetCard2("8600123456789012", 1000.0, "12/28");

        System.out.println("Mijoz ismi: " + customer.getName());
        System.out.println("Mahsulot narxi: " + product.getPrice() + " USD");
        
        card.withdraw(200);
        System.out.println("Qoldiq balans: " + card.getBalance());
    }
}
```
 
 
